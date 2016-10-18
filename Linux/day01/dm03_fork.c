#include <stdio.h>
#include <errno.h>
#include <signal.h>

int main(void) {
	pid_t pid;
	printf("befor fork pid:%d \n", getpid());

	int abc = 10;
	
	pid = fork();
	if(pid == -1) {
		printf("error\n");
	}
	
	if(pid > 0) {
		abc++;
		printf("parent:pid:%d  abc:%d \n", getpid(),abc);
	}
	else if(pid == 0) {
		abc++;
		printf("parent:pid:%d  abc:%d \n", getpid(),abc);
	}

	return 0;
}
