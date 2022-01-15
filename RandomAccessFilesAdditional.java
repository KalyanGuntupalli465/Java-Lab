import java.io.*;
public class RandomAccessFilesAdditional {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile f1=new RandomAccessFile("C:\\Users\\mohan\\Desktop\\java.txt","rws");
		f1.seek(0);
		
		byte b[]=new byte[(int) f1.length()];
		f1.read(b);
		for(int i=0;i<b.length;i++)
			System.out.print((char)b[i]);
		f1.seek(6);
		String s="I love myself";
		f1.write(s.getBytes());
		f1.close();
			
		

	}

}
