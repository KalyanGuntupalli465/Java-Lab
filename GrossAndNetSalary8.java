import java.util.Scanner;
import java.util.concurrent.Flow.Processor;

import AssociativeProfessor.Professor;
class Employee
{
	String name;
	String ID;
	String mailID;
	long mobile_number;
	String adress;
	Employee(String a,String b, String c,long d,String e)
	{
		name=a;
		ID=b;
		mailID=c;
		mobile_number=d;
		adress=e;
	}
	void details()
	{
		System.out.println("Name is: "+name);
		System.out.println("ID is: "+ID);
		System.out.println("Mobile number is: "+mobile_number);
		System.out.println("mail ID is: "+mailID);
		System.out.println("Adress is: "+adress);
		

		
	}
}
class Programmer extends Employee
{
	int basic_pay;
	Programmer(String a,String b, String c,long d,String e)
	{
		super(a,b,c,d,e);
	}
	void calculate(int b)
	{
		double da=b*0.97;
		double hra=b*0.1;
		double pf=b*0.12;
		double s=b*0.001;
		double gross= da+hra+pf;
		double net=gross-pf-s;
		details();
		System.out.println("DA:"+da);
		System.out.println("HRA:"+hra);
		System.out.println("PF:"+pf);
		System.out.println("staff club fund:"+s);
		System.out.println("Gross salary:"+gross);
		System.out.println("net salary:"+net);


		
	}
}
class AssistantProfessor extends Employee
{
	int basic_pay;
	AssistantProfessor(String a,String b, String c,long d,String e)
	{
		super(a,b,c,d,e);
	}
	void calculate(int b)
	{
		double da=b*0.92;
		double hra=b*0.1;
		double pf=b*0.1;
		double s=b*0.001;
		double gross= da+hra+pf;
		double net=gross-pf-s;
		details();
		System.out.println("DA:"+da);
		System.out.println("HRA:"+hra);
		System.out.println("PF:"+pf);
		System.out.println("staff club fund:"+s);
		System.out.println("Gross salary:"+gross);
		System.out.println("net salary:"+net);


		
	}
}
class AssociativeProfessor extends Employee
{
	int basic_pay;
	AssociativeProfessor(String a,String b, String c,long d,String e)
	{
		super(a,b,c,d,e);
	}
	void calculate(int b)
	{
		double da=b*0.94;
		double hra=b*0.1;
		double pf=b*0.15;
		double s=b*0.001;
		double gross= da+hra+pf;
		double net=gross-pf-s;
		details();
		System.out.println("DA:"+da);
		System.out.println("HRA:"+hra);
		System.out.println("PF:"+pf);
		System.out.println("staff club fund:"+s);
		System.out.println("Gross salary:"+gross);
		System.out.println("net salary:"+net);


		
	}
}
	class Professor extends Employee
	{
		int basic_pay;
		Professor(String a,String b, String c,long d,String e)
		{
			super(a,b,c,d,e);
		}
		void calculate(int b)
		{
			double da=b*0.98;
			double hra=b*0.25;
			double pf=b*0.12;
			double s=b*0.001;
			double gross= da+hra+pf;
			double net=gross-pf-s;
			details();
			System.out.println("DA:"+da);
			System.out.println("HRA:"+hra);
			System.out.println("PF:"+pf);
			System.out.println("staff club fund:"+s);
			System.out.println("Gross salary:"+gross);
			System.out.println("net salary:"+net);


			
		}
	}

public class GrossAndNetSalary8 {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Programmer");
		System.out.println("2.Assistant Proffesor");
		System.out.println("3.Associative professor");
		System.out.println("4.Professor");
		System.out.println("5.Exit");
		System.out.println("");
		System.out.println("select the designation:");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Enetr employee name:");
			String name=sc.nextLine();
			 name=sc.nextLine();
			 System.out.println("Enter employee id:");
			 String id=sc.next();
			 System.out.println("Enter employee mail id :");
			 String mailid=sc.next();
			 System.out.println("Enter employee mobile number:");
			 long number=sc.nextLong();
			 System.out.println("Enter employee adress:");
			 String adress=sc.nextLine();
			 adress=sc.nextLine();
			 System.out.println("Enter employee basic pay:");
			 int q=sc.nextInt();

			 System.out.println("Designation is:Programmer");
			 Programmer p=new Programmer(name,id,mailid,number,adress);
			 p.calculate(q);
			 break;
		case 2:
			System.out.println("Enetr employee name:");
			String name1=sc.nextLine();
			 name1=sc.nextLine();
			 System.out.println("Enter employee id:");
			 String id1=sc.next();
			 System.out.println("Enter employee mail id :");
			 String mailid1=sc.next();
			 System.out.println("Enter employee mobile number:");
			 long number1=sc.nextLong();
			 System.out.println("Enter employee adress:");
			 String adress1=sc.nextLine();
			 adress=sc.nextLine();
			 System.out.println("Enter employee basic pay:");
			 int q1=sc.nextInt();

			 System.out.println("Designation is:Assistant professor");
			 AssistantProfessor e=new AssistantProfessor(name1,id1,mailid1,number1,adress1);
			 e.calculate(q1);
			 break;
		case 3:
			System.out.println("Enetr employee name:");
			String name2=sc.nextLine();
			 name2=sc.nextLine();
			 System.out.println("Enter employee id:");
			 String id2=sc.next();
			 System.out.println("Enter employee mail id :");
			 String mailid2=sc.next();
			 System.out.println("Enter employee mobile number:");
			 long number2=sc.nextLong();
			 System.out.println("Enter employee adress:");
			 String adress2=sc.nextLine();
			 adress2=sc.nextLine();
			 System.out.println("Enter employee basic pay:");
			 int q2=sc.nextInt();

			 System.out.println("Designation is:Associative professor");
			 AssociativeProfessor w=new AssociativeProfessor(name2,id2,mailid2,number2,adress2);
			 w.calculate(q2);
			 break;
		case 4:
			System.out.println("Enetr employee name:");
			String name3=sc.nextLine();
			 name3=sc.nextLine();
			 System.out.println("Enter employee id:");
			 String id3=sc.next();
			 System.out.println("Enter employee mail id :");
			 String mailid3=sc.next();
			 System.out.println("Enter employee mobile number:");
			 long number3=sc.nextLong();
			 System.out.println("Enter employee adress:");
			 String adress3=sc.nextLine();
			 adress3=sc.nextLine();
			 System.out.println("Enter employee basic pay:");
			 int q3=sc.nextInt();

			 System.out.println("Designation is:Professor");
			 Professor p1=new Professor(name3,id3,mailid3,number3,adress3);
			 p1.calculate(q3);
			 break;
		case 5:
			System.out.println("Have a nice day");
			break;




			 

			
		}


	}

}
