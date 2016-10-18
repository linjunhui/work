CC=g++
SRCS=main.cpp\
	 	a.cpp
OBJS=$(SRCS:.cpp=.o)

EXEC=myapp
start: $(OBJS)
	$(CC) -o $(EXEC) $(OBJS)
.cpp.o:
	$(CC) -o $@ -c $<
clean:
	rm -rf $(OBJS)