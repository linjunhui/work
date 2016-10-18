CC=gcc

SRCS=dm03_fork.c\

OBJS=$(SRCS:.c=.o)

EXEC=myapp
start:$(OBJS)
	$(CC) -o $(EXEC) $(OBJS)
.c.o:
	$(CC) -o $@ -c $<
clean:
	rm -rf $(OBJS)
