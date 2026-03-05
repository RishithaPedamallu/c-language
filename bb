#include<stdio.h>
int main()
{
	char s[1000];
	int f,j,i;
	printf("enter a sentense:\n");
	scanf("%[^\n]s",s);
	for(i='0';i<='9';i++)
	{
		f=0;
		for(j=0;j<strlen(s);j++)
		{
			if(i==s[j])
			f++;
		}
		printf("%c count is:%d\n",i,f);
	}
	return 0;
}
