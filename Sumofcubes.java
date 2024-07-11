
public class Sumofcubes 
{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	int a[]=new int[10];
	int n,i,sum=0;
	System.out.println("Enter the size of a array ");
	n=sc.nextInt();
	System.out.println("Enter the array elements");
	for(i=0;i<n;i++)
		a[i]=sc.nextInt();
	for(i=0;i<n;i++)
	{
		
	//System.out.println((int)Math.cbrt(i));
		sum=sum+a[i]*a[i]*a[i];
	}
	System.out.println(sum);
}
}