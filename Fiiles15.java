import java.io.File;
import java.util.Scanner;
public class Fiiles15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name of the file");
		String s=sc.next();
       File f1 = new File (s);

		System.out.println (f1.exists ()?"File exists":"File not exists");
		System.out.println ("name of the file is "+f1.getName ());
	
		System.out.println (f1.canWrite ()? "Writable": "not writable");
		System.out.println (f1.canRead ()? "Readable": "not readable");
		System.out.println("file size is "+f1.length()+" bystes");
		
	
	  
	}

}
