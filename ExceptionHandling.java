import java.util.Scanner;

import java.util.InputMismatchException;
 class Test
{
	 int a,b,c;
	 void inputvalues()
	{
		 Scanner sc =new Scanner(System.in);
		try
		{
			System.out.println("Enter  number");
			a=sc.nextInt();
			operation(a);
		}
		catch(InputMismatchException e)
		{
       System.out.println("excepted input is integer"+" "+e);
		}
	}

	 void operation(int a)
	 {
		 try
		 {
			 int c=a/0;
			 System.out.println(c);
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println("division is not possible"+" "+e);
		 }
	 }
	 
}
public class ExceptionHandling {
	

public static void main(String[] args) {
// TODO Auto-generated method stub
	Test t=new Test();
	t.inputvalues();
	
}

}