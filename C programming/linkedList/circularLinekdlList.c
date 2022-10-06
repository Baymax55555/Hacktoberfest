#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node* next;
};
struct node* head=NULL;
void create()
{   struct node *current,*temp; int n;
    printf("Enter the number of nodes in circular linked list\n");
    scanf("%d",&n);
    head=(struct node*)malloc(sizeof(struct node));
    printf("Enter the first elemnt of circluar linked list\n");
    scanf("%d",&head->data);
    head->next=NULL;
    current=head;
    printf("Enter the rest of the elements\n");
	for(int i=1;i<n;i++)
	{
		temp=(struct node*)malloc(sizeof(struct node));
		scanf("%d",&temp->data);
		temp->next=NULL;
		current->next=temp;
		current=temp;
	}	
     temp->next=head;
}
void disp()
{
    struct node* p=head;
    printf("The circular linked list is\n");
    do
    {  printf("%d->",p->data);
       p=p->next;   
    }while(p!=head);
     printf("%d\n",head->data);
    
}

int main()
{
    create();
    disp();
    return 0;
}