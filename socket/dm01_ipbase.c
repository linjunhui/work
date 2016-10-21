

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

     //32位
     int myint = inet_addr("192.168.1.22");

     struct in_addr myaddr;
     inet_ntoa("192.168.1.1", &myaddr);

     //传入元素，返回值借用了元素的空间， man inet_
	char *inet_ntoa(struct in_addr in);

	//internationl 
	//sockaddr_in

	
}