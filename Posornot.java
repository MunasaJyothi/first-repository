public class Posornot 
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	//int a[]=new int[10];
	int i,j,n;
	//System.out.println("enter the size of a array");
	//n=sc.nextInt();
	int a[]= {31,4,-35,-16,89,4,6,5};
	for(i=0;i<a.length;i++)
	{
		if(a[i]>0)
		{
			System.out.println("positive");
		}
		else
		{
			System.out.println("not positive");
		}
	}
	}
}