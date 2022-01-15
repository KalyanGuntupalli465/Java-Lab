import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class SD implements Serializable
{
	int i;
	double d;
	boolean b;
	char c;
	SD(int i,double d,boolean b,char c)
	{
		this.i=i;
		this.d=d;
		this.b=b;
		this.c=c;
	}
	void display()
	{
		System.out.print(i+"\n"+d+"\n"+b+"\n"+c);
	}
}
public class SerializationAndDeserialzation {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectOutputStream a=new ObjectOutputStream(new FileOutputStream("C:\\Users\\mohan\\Desktop\\gmk.txt") );
		SD s1=new SD(3,4.6,true,'g');
		SD s2=new SD(6,78.9,false,'m');
		a.writeObject(s1);
		a.writeObject(s2);
		a.close();
		ObjectInputStream b=new ObjectInputStream(new FileInputStream("C:\\Users\\mohan\\Desktop\\gmk.txt") );
		SD r=(SD)b.readObject();
		r.display();
		r=(SD)b.readObject();
		r.display();
		

	}

}
