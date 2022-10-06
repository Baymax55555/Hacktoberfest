#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *next;
    struct node *prev;
};
struct node *head = NULL;
void create()
{
    int n, i;
    struct node *temp, *current;
    head = (struct node *)malloc(sizeof(struct node));
    printf("Enter the number of elements in the doubally linked list\n");
    scanf("%d", &n);
    printf("Enter the data of first element\n");
    scanf("%d", &head->data);
    head->next = NULL;
    head->prev = NULL;
    current = head;
    printf("Enter the rest of the elements\n");
    for (i = 1; i < n; i++)
    {
        temp = (struct node *)malloc(sizeof(struct node));
        scanf("%d", &temp->data);
        temp->prev = current;
        temp->next = NULL;
        current->next = temp;
        current = temp;
    }
}
void disp()
{
    struct node *p = head;
    printf("The doublly linked list is:\n");
    while (p != NULL)
    {
        printf("%d->", p->data);
        p = p->next;
    }
    printf("NULL\n");
}
int count()
{
    struct node *temp = head;
    int flag = 0;
    while (temp != NULL)
    {
        flag++;
        temp = temp->next;
    }
    return flag;
}
void rdisp()
{   struct node* p=head;
    while (p->next != NULL)
    {  p=p->next;
    }
    for (int i = 0; i < count(); i++)
    { printf("%d->",p->data);
      p=p->prev;
    }
    printf("NULL\n");
}
void insertAtBegin()
{ struct node* temp=(struct node*)malloc(sizeof(struct node));
  printf("Enter the data to be inserted in beginning\n");
  scanf("%d",&temp->data);
  temp->prev=NULL;
  head->prev=temp;
  temp->next=head;
  head=temp;
}
void insertAtEnd()
{
    struct node *p,*temp;
    temp=(struct node*)malloc(sizeof(struct node));
    printf("Enter the data to be inserted at the end\n");
    scanf("%d",&temp->data);
    p=head;
    while(p->next!=NULL)
    {
     p=p->next;
    }
    temp->next=NULL;
    p->next=temp;
    temp->prev=p;
}
void insertAtAny()
{   struct node *p=head,*item; int n;
    printf("Enter the positon after which you want to insert an element\n");
    scanf("%d",&n);
    if(n<count()&&n>0)
        {
            item=(struct node*)malloc(sizeof(struct node));
            printf("Enter the value to be inserted\n");
            scanf("%d",&item->data);
            for(int i=0;i<n-1;i++)
            {
                 p=p->next;
            }
            item->next=p->next;
            p->next->prev=item;
            item->prev=p;
            p->next=item;
        }
    else if(n==0)
    {
        insertAtBegin();
    }
    else if(n==count())
    {
        insertAtEnd();
    }
}
void deleteAtBegin()
{
    struct node *temp,*p;
    temp=p=head; 
    p=p->next;
    p->prev=NULL;
    head=p;
    free(temp);
}
void deleteAtEnd()
{ 
  struct node* p=head;
  while(p->next!=NULL)
  {
    p=p->next;
  }
  p->prev->next=NULL;
  free(p);
}
void deleteAtAny()
{
    struct node *p,*temp; int n;
    printf("Enter the postion after which you want to delete\n");
    scanf("%d",&n);
    if(n<count()-1&&n>0)
    {
    p=head;
    for(int i=0;i<n-1;i++)
    {
        p=p->next;
    }
    temp=p->next;
    p->next->next->prev=p;
    p->next=p->next->next;
    free(temp);
    }
    else if(n==0)
    {
        deleteAtBegin();
    }
    else if(n==count()||n==count()-1)
    {
        deleteAtEnd();
    }
}
int main()
{
    create();
    disp();
    //printf("%d\n", count());
    deleteAtAny();
    disp();
    //printf("%d\n", count());
    rdisp();
    return 0;
}