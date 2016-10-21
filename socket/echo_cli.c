void echo_cli(int sock) {
	char sendbuf[1024] = {0};
	char recvbuf[1024] = {0};

	while(fgets(sendbuf, sizeof(sendbuf), stdin) != NULL) {
		writen(sock, "ddaaassssssssssssa", 11);
		writen(sock, "AAAAAAAAAAAAAAAAAA", 11);
		writen(sock, "BBBBBBBBBBBBBBBBBB", 11);

		int ret = readline(sock, recvbuf, sizeof(recvbuf));
		if (ret == -1)
			ERR_EXIT("readline");
		else if (ret == 0)
		{
			printf("client close\n");
			break;
		}

		fputs(recvbuf, stdout);
		memset(sendbuf, 0, sizeof(sendbuf));
		memset(recvbuf, 0, sizeof(recvbuf));
	}
	close(sock);
}