#include <stdio.h>
#include <errno.h>
#include <string.h>
#include <sys/socket.h>
#include <arpa/inet.h>
#include <stdlib.h>
#include <unistd.h>
#include <signal.h>

void handle(int num) {
	printf("recv num : %d\n", num);
	printf("服务器端已关闭\n");
	exit(0); //终止正在执行的进程，就是当前的父进程
}

int main() {
	int sockfd = 0;

	signal(SIGUSR1, handle);

	sockfd = socket(PF_INET, SOCK_STREAM, 0);

	struct sockaddr_in srvaddr;
	srvaddr.sin_family = AF_INET;
	srvaddr.sin_port = htons(8001);
	srvaddr.sin_addr.s_addr = inet_addr("127.0.0.1");//INADDR_ANY

	if (connect(sockfd, (struct sockaddr *)(&srvaddr), sizeof(srvaddr)) < 0)
	{
		printf("errno:%d \n", errno);
		perror("failed connect");
		exit(0);
	}

	printf("connted\n");
	int pid = 0;
	pid = fork();
	if(pid > 0) { //父进程

		char sendbuf[1024] = {0};
		//从键盘读取一行数据，发送到服务器
		while(fgets(sendbuf, sizeof(sendbuf), stdin) != NULL) {
			//向服务器写数据
			write(sockfd, sendbuf, strlen(sendbuf));
			memset(sendbuf, 0, sizeof(sendbuf));
		}
	} else {
		char revbuf[1024] = {0};

		while(1) {
			//从服务器读数据
			int ret = read(sockfd, revbuf, sizeof(revbuf));

			if (ret < 0)
			{
				//处理服务器端挂掉的情况,
				printf("read err\n");
				break;
			}
			if (ret == 0)//收到服务器关闭的报文
			{
				printf("read err\n");
				printf("收到 0 包，服务器已经关闭\n");
				break;
			}

			fputs(revbuf, stdout);
			memset(revbuf, 0, sizeof(revbuf));
		}
		close(sockfd);
		//子进程，读不到服务器端的数据挂掉，让父进程也挂掉
		kill(getppid(), SIGUSR1);
	}

	

	return 0;
}
