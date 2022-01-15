import java.util.Scanner;

class Invoice
{
	private String partno;
	private String desc;
	private int quant;
	private double price;
	Invoice()
	{
		System.out.println("Hello customer");
		
	}
	void setpart(String partno)
	{
		this.partno=partno;
	}
	void setdesc(String desc)
	{
		this.desc=desc;
	}
	void setquant(int quant)
	{
		if(quant<=0)
			this.quant=0;
		else
			this.quant=quant;
	}
	void setprice(double price)
	{
		if(price<=0.0)
			this.price=0.0;
		else
			this.price=price;
	}
	String getpart()
	{
		return partno;
	}
	String getdesc()
	{
		return desc;
	}
	int getquant()
	{
		return quant;
	}
	double getprice()
	{
		return price;
	}
	double getInvoiceAmount()
	{
		return (quant*price);
	}
	
	
}

public class InvoiceTest1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Invoice I=new Invoice();
		System.out.println("Enetr the part number");
		String x=sc.next();
		I.setpart(x);
		System.out.println("Enetr the description");
		String y=sc.next();
        I.setdesc(y);
		System.out.println("Enetr the quantity");
        int w=sc.nextInt();
		I.setquant(w);
		System.out.println("Enetr the price of each item");
		double r=sc.nextDouble();
        I.setprice(r);
		
		System.out.println("Part number is:"+I.getpart());
		System.out.println("Description is:"+I.getdesc());
		System.out.println("Quantity is:"+I.getquant());
		System.out.println("Amount is"+I.getInvoiceAmount());
	}
}

		




	


