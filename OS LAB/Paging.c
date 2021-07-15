#include <stdio.h>
struct pstruct
{
	int fno;
	int pbit;
}ptab[10];
int pmsize,lmsize,psize,f,p,ftab[20],frano;
	
void info()
{
	printf("\nEnter the Size of Physical memory: ");
	scanf("%d",&pmsize);
	printf("\nEnter the size of Logical memory: ");
	scanf("%d",&lmsize);
	printf("\nEnter the partition size: ");
	scanf("%d",&psize);
	f = (int) pmsize/psize;
	p = (int) lmsize/psize;
	printf("\nThe physical memory is divided into %d no.of frames\n",f);
	printf("\nThe Logical memory is divided into %d no.ofpages",p);
}

void assign()
{
	int i;
	for (i=0;i<p;i++)
	{
	    ptab[i].fno = -1;
	    ptab[i].pbit= -1;
	}
	for(i=0; i<f;i++)
		ftab[i] = 32555;
	for (i=0;i<p;i++)
	{
	    printf("\nEnter the Frame number where page %d must be placed: ",i);
		scanf("%d",&frano);
		ftab[frano] = i;
		if(ptab[i].pbit == -1)
		{
			ptab[i].fno = frano;
			ptab[i].pbit = 1;
		}
	}
	printf("\nPAGE TABLE\n\n");
	printf("PageAddress FrameNo. PresenceBit\n");
	for (i=0;i<p;i++)
		printf("%d\t\t%d\t\t%d\n",i,ptab[i].fno,ptab[i].pbit);
}

void main()
{
	system("clear");
	info();
	assign();
}
