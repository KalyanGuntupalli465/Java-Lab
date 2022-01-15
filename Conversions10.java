import java.util.Scanner;
import CurrencyCoverter.*;
import DistanceConverter.*;
import TimeConverter.*;
public class Conversions10 {
	

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Currency c=new Currency();
		Distance d=new Distance();
		Time t=new Time();
		
		System.out.println("***MENU****");
		System.out.println("1.Dollar to Rupee");
		System.out.println("2.Rupee to Dollar");
		System.out.println("3.Euro to Rupee");
		System.out.println("4.Rupee to Euro");
		System.out.println("5.Yen to Rupee");
		System.out.println("6.Rupee to Yen");
		System.out.println("7.Meter to km");
		System.out.println("8.KM to meter");
		System.out.println("9.Miles to KM");
		System.out.println("10.KM to miles");
		System.out.println("11.Hours to minutes");
		System.out.println("12.Minutes to Hours");
		System.out.println("13.Hours to seconds");
		System.out.println("14.Seconds to hours");
		System.out.println("15.Exit");
		System.out.println("Enter your choice");
		int x=0;
		try
		{
		 x=sc.nextInt();
		 
		if(x<0)
			 throw new Exception("Choice cannot be negative");
		
		}
		catch(Exception e )
		{
			System.out.println(e+" pls re enter the choice");
			 x=sc.nextInt();
		} 
		switch(x)
		{
		case 1:
			System.out.println("Enetr the no.of dollars:");
			double y=sc.nextDouble();
			System.out.println("Rupees are:"+c.DollarToInr(y));
			break;
		case 2:
			System.out.println("Enetr the no.of rupees:");
			double z=sc.nextDouble();
			System.out.println("Dollars are:"+c.InrToDollar(z));
			break;
		case 3:
			System.out.println("Enetr the no.of Euros:");
			double w=sc.nextDouble();
			System.out.println("Rupees are:"+c.EuroToInr(w));
			break;
		case 4:
			System.out.println("Enetr the no.of Rupees:");
			double q=sc.nextDouble();
			System.out.println("Euros are:"+c.InrToEuro(q));
			break;
		case 5:
			System.out.println("Enetr the no.of Yens:");
			double e=sc.nextDouble();
			System.out.println("Rupees are:"+c.YenToInr(e));
			break;
		case 6:
			System.out.println("Enetr the no.of rupees:");
			double r=sc.nextDouble();
			System.out.println("Yens are:"+c.InrToYen(r));
			break;
		case 7:
			System.out.println("Enetr the no.of meters:");
			double C=sc.nextDouble();
			System.out.println("kilo meters are:"+d.meterToKM(C));
			break;
		case 8:
			System.out.println("Enetr the no.of kilometers:");
			double Y=sc.nextDouble();
			System.out.println("meters are:"+d.KMtoMeter(Y));
			break;
		case 9:
			System.out.println("Enetr the no.of miles:");
			double T=sc.nextDouble();
			System.out.println("kilo meters are:"+d.milesToKM(T));
			break;
		case 10:
			System.out.println("Enetr the no.of kilometers:");
			double P=sc.nextDouble();
			System.out.println("miles are:"+d.KMtoMiles(P));
			break;
		case 11:
			System.out.println("Enetr the no.of hours:");
			double L=sc.nextDouble();
			System.out.println("minutes are:"+t.hoursToMinutes(L));
			break;
		case 12:
			System.out.println("Enetr the no.of minutes:");
			double M=sc.nextDouble();
			System.out.println("Hours  are:"+t.minutesToHours(M));
			break;
		case 13:
			System.out.println("Enetr the no.of hours:");
			double N=sc.nextDouble();
			System.out.println("seconds  are:"+t.hoursToSeconds(N));
			break;
		case 14:
			System.out.println("Enetr the no.of seconds:");
			double B=sc.nextDouble();
			System.out.println("HOURS  are:"+t.secondsToHours(B));
			break;
		case 15:
			System.out.println("Have a Nice Day!");
			
			break;
		
		
		}
		
	}

}
