import java.util.Scanner;

class Bill
{
	String no;
	String name;
	double pre_read;
	double cur_read;
	String EB;
	Bill(String no,String name,String EB,double pre_read,double cur_read)
	{
		this.no=no;
		this.name=name;
		this.EB=EB;
		this.pre_read=pre_read;
		this.cur_read=cur_read;
		
	}
	void show()
	{
		System.out.println("Consumer number is:"+no);
		System.out.println("Consumer name is:"+name);
		System.out.println("Connection:"+EB);
		System.out.println("Previous month reading:"+pre_read);
		System.out.println("Current month reading:"+cur_read);

	}

 double Amount()
	{
	    double p=0.0;
		double x=this.cur_read-this.pre_read;
		if(EB.equalsIgnoreCase("commercial"))
		{
			if(x<=100)
				p= x*2;
			else if(x>=101&x<=200)
			  p= (200+(x-100)*4.50);
			else if(x>=201&x<=500)
				p=(650+(x-200)*6);
			else 
				p= (2450+(x-500)*7);
		}
		else if(EB.equalsIgnoreCase("domestic"))
		{
			if(x<=100)
				p =x*1;
			else if(x>=101&x<=200)
				p =(100+(x-100)*2.50);
			else if(x>=201&x<=500)
				p= (350+(x-200)*4);
			else 
				p=(1550+(x-500)*6);
		}
		return p;
			
	}
}
public class ElectricityBill2 {
	public static void main(String args[]) {
		double f=0.0;//for current month reading
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr consumer number");
		String a=sc.next();
		System.out.println("Enetr consumer name");
		String b=sc.nextLine();
		b=sc.nextLine();
		System.out.println("Type of connection Domestic or Commercial");
		String c=sc.next();
        System.out.println("Enetr previous month reading");
		double d=sc.nextDouble();
		System.out.println("Enetr current month reading");
		try
		{
		 f=sc.nextDouble();
		if(f<d)
			throw new Exception("current month reading can't be less than previous");
		}
		catch(Exception e)
		{
			System.out.println(e+",pls re enter the current month reading");
			 f=sc.nextDouble();
		}
        Bill b1=new Bill(a,b,c,d,f);
		b1.show();
		System.out.println("Amount is:"+b1.Amount());
	}

}
