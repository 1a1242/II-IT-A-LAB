#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <sys/wait.h>
char* msg1 = "Hello World #1";
char* msg2 = "Hello World #2";
char* msg3 = "Hello World #3";
int main()
{
char inbuf[16];
int p[2], pid, nbytes;
if (pipe(p) < 0)
exit(1);
if ((pid = fork()) > 0) {
write(p[1], msg1, 16);
write(p[1], msg2, 16);
write(p[1], msg3, 16);
close(p[1]);
wait(NULL);
}
else {
close(p[1]);
while ((nbytes = read(p[0], inbuf, 16)) > 0)
printf("%s\n", inbuf);
if (nbytes != 0)
exit(2);
printf("Finished reading\n");
}
