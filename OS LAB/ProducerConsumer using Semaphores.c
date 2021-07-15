#include<stdio.h>
#include<stdlib.h>
 
int mutex=1, full=0, empty=5, qua=0;
 
int main()
{
    int n;
    void producer();
    void consumer();
    int wait(int);
    int signal(int);
    printf("\n1.Producer\n2.Consumer\n3.Exit");
    while(1)
    {
        printf("\nEnter your choice:");
        scanf("%d",&n);
        switch(n)
        {
            case 1: if((mutex==1)&&(empty!=0))
                        producer();
                    else
                        printf("Buffer is FULL...");
                    break;
            case 2: if((mutex==1)&&(full!=0))
                        consumer();
                    else
                        printf("Buffer is EMPTY...");
                    break;
            case 3:
                    exit(0);
                    break;
        }
    }
   
    return 0;
}
 
int wait(int n)
{
    return (--n);
}
 
int signal(int n)
{
    return(++n);
}
 
void producer()
{
    empty=wait(empty);
    mutex=wait(mutex);
    qua++;
    printf("Producer produces the item %d\n",qua);
    mutex=signal(mutex);
    full=signal(full);
}
 
void consumer()
{
    full=wait(full);
    mutex=wait(mutex);
    printf("Consumer consumes item %d\n",qua);
    qua--;
    mutex=signal(mutex);
    empty=signal(empty);
}
