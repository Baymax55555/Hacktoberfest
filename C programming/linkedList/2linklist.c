#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct node *first;
void create(int n)
{
    struct node *temp,*current;
    current=first;
    current->next=NULL;
    printf("Enter the value of first node");
    scanf("%d", temp->data);
    for (int i = 0; i < n; i++)
    {   temp=(struct node*)malloc(sizeof(struct node));
        printf("Enter the value of node %d", i);
        scanf("%d", temp->data);
        temp->next=NULL;
        current->next=temp;
        current=temp;
    }

}
void randomInsert(int loc, int value)
{
    struct node *t, *ptr;
    ptr = (struct node *)malloc(sizeof(struct node));
    ptr->data = value;
    t = first;
    if (loc == 0)
    { 
        //insertAtBegin();
    }
    else
    {
        for (int i = 0; i < loc; i++)
        {
            t = t->next;
            if (t = NULL)
            {
                printf("Can't Insert");
            }
        }
        ptr->next = t->next;
        t->next = ptr;
    }
}
void insertAtBegin()
{
}
int main()
{ 
    create(5);
    return 0;
}