#include <stdio.h>
#include <errno.h>
#include <string.h>
#include <sys/socket.h>
#include <arpa/inet.h>
#include <stdlib.h>
#include <unistd.h>

int main() {
	int sockfd = 0;
	int conn = 0;
	sockfd = socket(PF_INET, SOCK_STREAM, 0);
	if (sockfd == -1)
	{
		perror("创建socket失败");
	}

	struct sockaddr_in srvaddr;
	srvaddr.sin_family = AF_INET;
	srvaddr.sin_port = htons(8001);
	srvaddr.sin_addr.s_addr = INADDR_ANY; //绑定本机任意一个地址

	if(bind(sockfd, (struct sockaddr *)&srvaddr, sizeof(srvaddr)) < 0) {
		perror("绑定失败：");
		exit(0);
	}
	//	一旦调用了listen函数，socket变成被动套接字，只能接收连接，不能主动发送连接
	//	两个队列，正在三次握手的，已经连接的
	if (listen(sockfd, SOMAXCONN) < 0) {
		perror("fun listen");
		exit(0);
	}

	//struct sockaddr peeraddr; //通用ip
	//socklen_t peerlen;

	struct sockaddr_in peeraddr;
	socklen_t peerlen = sizeof(peeraddr);

	conn = accept(sockfd, (struct sockaddr *)&peeraddr, &peerlen);
	if (conn == -1) {
		perror("fun accept");
		exit(0);
	}

	printf("peeraddr: %s\n  peerpot: %d\n", inet_ntoa(peeraddr.sin_addr), ntohs(peeraddr.sin_port));

	char revbuf[1024] = {0};
	while(1) {
		int ret = read(conn, revbuf, sizeof(revbuf));
		if (ret == 0) {
			//如果在读的过程中，对方已经关闭，tcpip协议会返回一个0数据包
			printf("对方已经关闭\n");
			exit(0);
		} else if (ret < 0) {
			printf("读数据失败\n");
			exit(0);
		}

		fputs(revbuf, stdout);//服务器端收到数据，打印到屏幕

		write(conn, revbuf, ret);//服务器发回 客户端
	}
	return 0;
}