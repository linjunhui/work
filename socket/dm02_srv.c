

int main() {
	int sockfd = 0;
	sockfd = socket(PF_INET, SOCK_STREAM, 0);
	if (sockfd == -1)
	{
		perror("创建socket失败");
	}

	struct sockaddr_in srvaddr;
	srvaddr.sin_family = AF_INET;
	srvaddr.sin_port = htons(8001);
	srvaddr.sin_addr.s_addr = INADDR_ANY;

	if(bind(sockfd, (struct sockaddr *)&srvaddr, sizeof(srvaddr)) < 0) {
		perror("绑定失败：");
		exit(0);
	}
	//	一旦调用了listen函数，socket变成被动套接字，只能接收连接，不能主动发送连接
	//	两个队列，正在三次握手的，已经连接的
	if (listen(sockfd, SOMAXCONN) < 0) {
		
	}
}