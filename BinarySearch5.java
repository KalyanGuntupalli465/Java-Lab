import java.util.Scanner;
class Binary
{
	int bsearch(int a[],int n,int key)
	{
		int lb=0;
		int ub=n-1;
		while(lb<=ub)
		{
			int mid=(lb+ub)/2;
			if(a[mid]==key)
			    return mid;
				
			
			else if(a[mid]<key)
				lb=mid+1;
			else 
				ub=mid+1;
			
		}
		return -1;
	}
}
public class BinarySearch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of elements");
		int n=sc.nextInt();

		
		int a[]=new int[n];
		System.out.println("enter elements in sorted order");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		Binary  b1=new Binary();
		System.out.println("enter the element you want to search");
		int p=sc.nextInt();
		int z=b1.bsearch(a, n, p);
		if(z!=-1)
			System.out.println("element is at"+z+"index poisition");
		else
			System.out.println("Element not found");
	}
}


		
		
		 