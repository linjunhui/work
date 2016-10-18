CC=gcc
SRCS=fork.c\

OBJS=$(SRCS:.c=.o)

EXEC=fork

start:$(OBJS)
	$(CC) -o $(EXEC) $(OBJS)
.c.o:
	$(CC) -o $@ -c $<
clean:
	rm -rf $(OBJS)
