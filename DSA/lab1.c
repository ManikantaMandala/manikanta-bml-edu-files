#include<stdio.h>
#include<stdlib.h>


struct node
{
	int data;
	struct node * next;
	
}*head;

void createnode(int n);
void display();

int main()
{
	int n ;
	printf("Enter number of nodes");
	scanf("%d",&n);
	
	createnode(n);
	display();
	head= reverse(head,NULL);
	display();
	return 0;
}

void createnode(int n)
{
	struct node *newnode, *temp;
	int d1,i;
	
	head = (struct node *)malloc(sizeof(struct node));

	printf("Enter data of node 1: ");
	scanf("%d", &d1);
	
	head -> data = d1;
	head -> next = NULL;
	
	temp = head;
	for(i=2; i<=n ; i++)
	{
		newnode = (struct node *)malloc(sizeof(struct node));
		
		printf("Enter the data of node %d: ", i);
		scanf("%d",&d1);
		
		newnode -> data =d1;
		newnode -> next = NULL;
		
		temp ->next = newnode;
		temp = temp -> next; 
	}

}

void display()
{
	struct node *temp;
	temp = head;
	while(temp !=NULL)
	{
		printf("Data = %d\n", temp->data);
		temp = temp->next;
	}
	
	
}

struct node* reverse(struct node* head, struct node* prev)
{

    if (head == NULL)
        return NULL;
 

    struct Node* temp;

    struct Node* curr = malloc(sizeof(struct Node));
    curr = head;
 
    while (curr != NULL && curr->data % 2 == 0) {
	temp = curr->next;
	curr->next = prev;
	prev = curr;
	curr = temp;
    }

    if (curr != head) {
 head->next = curr;
curr = reverse(curr, NULL);
return prev;

    }

    else {
head->next = reverse(head->next, head);
return head;

    }
}