#include <stdio.h>
#include <errno.h>
#include <sys/types.h>
#include <unistd.h>
#include <signal.h>
#include <fcntl.h>
//子进程 父进程都是在各自的内存空间中返回
//父进程挂掉，托孤给1号进程
int main01() {
	pid_t pid;
	printf("fork前的进程id %d \n", getpid());

	int abc = 100;
	pid = fork();
	if(pid == -1) {
		perror("title");
		return -1;
	}
	if(pid > 0) {
		abc++;
		//父进程挂掉，托孤给1号进程
		printf("parent: pid:%d\n", getpid());
		printf("abc = %d\n", abc);
	} else if(pid == 0) {
		abc++;
		printf("child: %d, parent: %d \n", getpid(), getppid());
		printf("abc = %d\n", abc);
		sleep(100);
	}

	return 0;
}

//子进程挂掉的时候，父进程没有给子进程收尸，产生僵尸进程
//signal(SIGCHLD, SIG_IGN) 父进程告诉内核自己不收尸，让内核收尸
int main02() {
	pid_t pid;
	signal(SIGCHLD, SIG_IGN); //忽略子进程消失的信号
	printf("fork前的进程id %d \n", getpid());

	int abc = 100;
	pid = fork();
	if(pid == -1) {
		perror("title");
		return -1;
	}
	if(pid > 0) {
		abc++;
		
		printf("parent: pid:%d\n", getpid());
		printf("abc = %d\n", abc);
		sleep(1000);
	} else if(pid == 0) {
		abc++;
		printf("child: %d, parent: %d \n", getpid(), getppid());
		printf("abc = %d\n", abc);
		//sleep(100);
	}

	return 0;
}

int main03() {
	//会产生8个进程分之
	fork();
	fork();
	fork();

	printf("hello\n");

	return 0;
}

//多进程下的文件描述符
//子进程拷贝了父进程的文件描述符，在父子进程都要关闭文件描述符

//fd 0 标准输出，1 标准输入，2标准错误，创建文件从3开始
int main() {
	pid_t pid;
	int fd;
	signal(SIGCHLD, SIG_IGN); //忽略子进程消失的信号
	printf("fork前的进程id %d \n", getpid());

	int abc = 100;
	pid = fork();

	fd = open("./1.txt", O_RDWR);
	if(fd == -1) {
		perror("myopen");
	}

	if(pid == -1) {
		perror("title");
		return -1;
	}
	if(pid > 0) {
		abc++;
		
		printf("parent: pid:%d\n", getpid());
		printf("abc = %d\n", abc);

		write(fd, "parent", 6);
		close(fd);
		//sleep(1000);
	} else if(pid == 0) {
		abc++;
		printf("child: %d, parent: %d \n", getpid(), getppid());
		printf("abc = %d\n", abc);
		write(fd, "child", 5);
		close(fd);
		//sleep(100);
	}

	return 0;
}
