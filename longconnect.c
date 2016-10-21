
//每次读取一行保存到sendbuf中
while(fgets(sendbuf, sizeof(sendbuf), stdin) != NULL) {
	write(sockfd, sendbuf, strlen(sendbuf));	//服务端回发信息

	//从服务器读取数据
	read(sockfd, revbuf, sizeof(revbuf));

	//向指定文件写入一个字符串，这里是写到标准输出
	fputs(revbuf, stdout);//从服务器接收到的数据打印到屏幕

	memset(revbuf, 0, sizeof(revbuf));
	memset(sendbuf, 0, sizeof(sendbuf));
}
close(sockfd);