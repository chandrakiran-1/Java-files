import java.util.*;
class Monocept2
{
	public   static void main(String[]args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println(" enter N : ");
		int arr[] = new int[N-1];
		for(int i=0; i<N-1; i++)
		{	
		arr[i]=s.nextInt();
		}
		int total= (N*(N+1)/2);
		int sum=0;
		for(int i =0; i<N-1; i++)
		{
			sum+=arr[i];
		}
		int missing= Total- sum;
		System.out.println(missing);
	}
}
		
		