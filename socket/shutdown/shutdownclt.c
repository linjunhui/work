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
	exit(0);
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

	while(1){
		char sendbuf[1024] = {0};
		//从键盘读取一行数据，发送到服务器
		while(fgets(sendbuf, sizeof(sendbuf), stdin) != NULL) {
			//向服务器写数据
			write(sockfd, sendbuf, strlen(sendbuf));
			memset(sendbuf, 0, sizeof(sendbuf));
		}
	}


	
	close(sockfd);

	return 0;
}
