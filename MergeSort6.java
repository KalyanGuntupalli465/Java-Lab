import java.util.Scanner;

class Sort
{
	void msort(int a[],int lb,int ub)
	{
		if(lb!=ub)
		{
			int mid=(lb+ub)/2;
			msort(a,lb,mid);
			msort(a,mid+1,ub);
			mpass(a,lb,mid,ub);
			
		}
	}
	void mpass(int a[],int lb,int mid,int ub)
	{
		int temp[]=new int[100];
		int i=lb;
		int j=mid+1;
		int k=lb;
		while((i<=mid)&&(j<=ub))
		{
			if(a[i]>a[j])
				temp[k++]=a[j++];
			else
				temp[k++]=a[i++];
			
						
		}
		while(i<=mid)
			temp[k++]=a[i++];
		while(j<=ub)
			temp[k++]=a[j++];
		for(i=lb;i<=ub;i++)
			a[i]=temp[i];
		
	}
}

public class MergeSort6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements you want to sort");
		int n =sc.nextInt();
		int p[]=new int[n];
		System.out.println("Enetr the elemnts");
		for( i=0;i<n;i++)
			p[i]=sc.nextInt();
		System.out.println("Before sorting");
		for(i=0;i<n;i++)
			System.out.println(p[i]);
		Sort s=new Sort();
		s.msort(p,0,n-1);
		System.out.println("Afetr sorting sorting");
		for(i=0;i<n;i++)
			System.out.println(p[i]);
		
		

	}

}
