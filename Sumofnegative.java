
public class Sumofnegative 
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int i,sum=0;
	int a[]= {31,4,-35,-16,89};
	for(i=0;i<a.length;i++)
	{
		if(a[i]<0)
		{
			sum=sum+a[i];
			System.out.println("sum"+sum);
		}
	}
}
}
