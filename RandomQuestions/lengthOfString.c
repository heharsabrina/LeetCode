#include<stdio.h>
#include<string.h>
void main()
{
    char s[]={'L', 'e', 'e', 't', 'c', 'o', 'd', 'e'};
    int count=0;

    for(int i=0;s[i]!='\0';i++)
        count++;

    printf("%d", count);

    printf("%ld", strlen(s));
}