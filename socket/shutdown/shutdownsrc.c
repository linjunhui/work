#include <stdio.h>
#include <errno.h>
#include <string.h>
#include <sys/socket.h>
#include <arpa/inet.h>
#include <stdlib.h>
#include <unistd.h>

int main() {
	int sockfd = 0;
	sockfd = socket(PF_INET, SOCK_STREAM, 0);

	struct sockaddr_in srvaddr;
	srvaddr.sin_family = AF_INET;
	srvaddr.sin_port = htons(8001);
	srvaddr.sin_addr.s_addr = inet_addr("127.0.0.1");//INADDR_ANY

	//设置地址复用
	int val = 1;
	setsockopt(sockfd, SOL_SOCKET, SO_REUSEADDR, &val, sizeof(val));

	if(bind(sockfd, (struct sockaddr *)&srvaddr, sizeof(srvaddr)) == -1) {
		perror("bind failed");
	}

	if (listen(sockfd, SOMAXCONN) < 0)
	{
		perror("listen failed");
	}

	struct sockaddr_in peeraddr;
	socklen_t peerlen = sizeof(peeraddr);
	int conn = 0;
	conn = accept(sockfd, (struct sockaddr *)&peeraddr, (socklen_t *)&peerlen);
	if (conn == -1)
	{
		perror("accept failed");
	}
	printf("accepted \n");

		char revbuf[1024] = {0};
		while(1) {

		char sendbuf[1024] = {0};
		while(fgets(sendbuf, sizeof(sendbuf), stdin) != NULL) {
			//向服务器写数据
			write(conn, sendbuf, strlen(sendbuf));
			memset(sendbuf, 0, sizeof(sendbuf));
		}
	}

	close(sockfd);

	return 0;
}