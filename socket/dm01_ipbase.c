//判断大小端
void main11() {
     unsigned int data = 0x12345678;
     char *p = &data;

     printf("%x, %x, %x, %x\n", p[0], p[1], p[2], p[3]);

     if (p[0] == 0x78) {
          printf("当前系统是小端模式\n");
     } else {
          printf("当前系统是大端模式\n");
     }

     printf("把本地字节转换成网络字节\n");
     uint32_t mynetdat = htonl(data);
     p = &mynetdat;
     printf("%x, %x, %x, %x\n", p[0], p[1], p[2], p[3]);

     if (p[0] == 0x78) {
          printf("网络字节序是小端模式\n");
     } else {
          printf("网络字节序大端模式\n");
     }

}



void main()
{
	/*
	*    man inet_aton
	 in_addr_t
     inet_addr(const char *cp);

     int
     inet_aton(const char *cp, struct in_addr *pin);

     in_addr_t
     inet_lnaof(struct in_addr in);

     struct in_addr
     inet_makeaddr(in_addr_t net, in_addr_t lna);

     in_addr_t
     inet_netof(struct in_addr in);

     in_addr_t
     inet_network(const char *cp);

     char *
     inet_ntoa(struct in_addr in);

	*/

     //32位 将字符ip地址转成了 32 位的int
     int myint = inet_addr("192.168.1.22");
     printf("%u\n", myint);

     struct in_addr myaddr;
     inet_ntoa("192.168.1.1", &myaddr);
     printf("%u\n", myaddr.s_addr);

     //传入元素，返回值借用了元素的空间， man inet_
	//char *inet_ntoa(struct in_addr in);
     //请深刻理解为什么这个地方要求传入的是元素
     printf("%s\n", inet_ntoa(myaddr));

	//internationl 
	//sockaddr_in

	
}