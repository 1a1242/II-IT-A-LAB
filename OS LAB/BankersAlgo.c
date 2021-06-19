#include<stdio.h>
int main()
{
	int m, n, i, j, k;
	//m -> processes, n -> resources
	printf("Enter no. of processes\n");	
	scanf("%d", &m);
	printf("Enter no. of resourses\n");
	scanf("%d", &n);
	int allocate[m][n], max[m][n], need[m][n], available[n];
	printf("Enter allocation matrix\n");
	for(i = 0; i < m; i++)
	{
		for(j = 0; j < n; j++)
			scanf("%d", &allocate[i][j]);
	}
	printf("Enter max matrix\n");
	for(i = 0; i < m; i++)
	{
		for(j = 0; j  < n; j++)
			scanf("%d", &max[i][j]);
	}
	printf("Enter available resources\n");
	for(i = 0; i < n; i++)
		scanf("%d", &available[i]);
	for(i = 0; i < m; i++)
	{
		for(j = 0; j < n; j++)
			need[i][j] = max[i][j] - allocate[i][j];
	}
	int f[m], res[m], index = 0;
	for(i = 0; i < m; i++)
		f[i] = 0;
	int x = 0;
	for(k = 0; k < m; k++)
	{
		for(i = 0; i < m; i++)
		{
			if(f[i] == 0)
			{
				int flag = 0;
				for(j = 0; j < n; j++)
				{
					if(need[i][j] > available[j])
					{
						flag = 1;
						break;
					}
				}
				if(flag == 0)
				{
					res[index++] = i;
					for(x = 0; x < n; x++)
						available[x] += allocate[i][x];
					f[i] = 1;
				}
			}
		}
	}
	printf("Safe Sequence\n");
	printf("< ");
	for(i = 0; i < m; i++)
		printf("p%d,", res[i]);
	printf(">\n");
	return 0;
}
