#include "bits/stdc++.h"
using namespace std;

const int N=1e5+20;

int b,l,d,x;

struct book
{
	int i,score;
}books[N];

struct library
{
	int i,n,t,m;
	vector <int> books;
}libraries[N];

bool cmp(library &a,library &b)
{
	if(a.t!=b.t) return a.t<b.t;
	return a.n>b.n;
}

bool book_cmp(int &a,int &b)
{
	return books[a].score>books[b].score;
}

int main()
{
	scanf("%d%d%d",&b,&l,&d);
	for(int i=0;i<b;i++)
	{
		scanf("%d",&books[i].score);
		books[i].i=i;
	}

	for(int i=0;i<l;i++)
	{
		scanf("%d%d%d",&libraries[i].n,&libraries[i].t,&libraries[i].m);
		libraries[i].i=i;
		for(int j=0;j<libraries[i].n;j++)
		{
			scanf("%d",&x);
			libraries[i].books.push_back(x);
		}
	}

	sort(libraries,libraries+l,cmp);

	printf("%d\n",l);
	for(int i=0;i<l;i++)
	{
		printf("%d %d\n",libraries[i].i,libraries[i].n);
		sort(libraries[i].books.begin(),libraries[i].books.end(),book_cmp);
		for(int j=0;j<libraries[i].n;j++) printf("%d ",libraries[i].books[j]);
		printf("\n");
	}
}