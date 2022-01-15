import java.io.*;



public class CharArrayReaderAndWriterDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		String s="hello ";
		char c[]=new char[s.length()];
		int l=s.length();
		s.getChars(0, s.length(), c, 0);
		CharArrayReader k=new CharArrayReader(c);
		char d[]=new char[s.length()];
		System.out.println(k.read(d));
		for(int i=0;i<d.length;i++)
		{
			System.out.print(d[i]);
		}
		System.out.print("\n");
		CharArrayWriter w=new CharArrayWriter();
		w.write(c);
		System.out.print(w);
		

	}

}
