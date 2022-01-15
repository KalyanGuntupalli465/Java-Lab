import java.util.Scanner;
class StackTest
{
	
	int top=-1, n=1000;
	Scanner sc=new Scanner(System.in);
	

	int stack[]=new int[n];
	
	
	void push()
	{
		System.out.println("enter how many elements you want to push");
		int k= sc.nextInt();
		System.out.println("enter the elemnts");
	
		for (int i=0;i<k;i++)
		{
			if(isFull())
			{
				System.out.println("Stack is full");
				
				
			}
			else {
				int e[]=new int[k];
			 e[i]=sc.nextInt();
			stack[++top]=e[i];
			}
			
		}
		
	}
	int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return 0;
			
		}
		else {
		return stack[top--];
		}
	}
	

	boolean isFull()
	{
		return ((top==n-1)?true:false);
	}
	 boolean isEmpty() {

		return ((top==-1)?true:false);
	 }
	 void display()
	 {
		 if(isEmpty())
		 {
	 	System.out.println("there is no content");
	 	return ;
		 }
		 System.out.println("contents are");
		 for(int j=top;j>=0;j--)
		 {
			 System.out.println(stack[j]);
		 }
	 }
	
}
public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackTest k=new StackTest();
		
		Scanner p=new Scanner(System.in);
		
		first:while(true)
		{
			System.out.println("****MENU****");
			System.out.println("1.push\n"+"2.pop\n"+"3.viewstack\n"+"4.exit\n");
			System.out.println("enter choice");
			int x=p.nextInt();
			switch(x)
			{
			case 1:
				k.push();
				break;
			case 2:
				System.out.println("the popped element is"+k.pop());
				break;
			case 3:
				k.display();
				break;
			case 4:
				System.out.println("Have a nice day");
				
				break first;
				
				
			}
		}

	}

}
