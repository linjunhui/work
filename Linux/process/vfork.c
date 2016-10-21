#include <stdio.h>
#include <errno.h>
#include <unistd.h>
#include <signal.h>
//fork 和 vfork都是用来创建进程，vfork的限制是，进程创建后必须立即执行exec或者exit
//vfork一个进程，拉起一个应用，共享父进程的数据段，子进程先运行

int main() {
	int fd;
	pid_t pid;
	signal(SIGCHLD, SIG_IGN);

	printf("vfork前进程id:%d\n", getpid());

	pid = vfork();

	if(pid == -1) {
		perror("vfork failed");
	}
	if(pid > 0) {
		printf("parent: pid :%d\n", getpid());
	} else if(pid == 0) {
		printf("child: %d , parent:%d\n", getpid(), getppid());

		//把自己的应用拉起来
		//execve("./hello", NULL, NULL);

		//拉起ls，通过一个应用程序执行命令 
		char *const argv[] = {"ls", "-l", NULL};
		execve("/bin/ls", argv, NULL);
		//要么拉起一个应用，要么exit

		printf("测试这个打印会不会执行\n");
	}
}