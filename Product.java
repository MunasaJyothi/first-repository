
public class Product
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int i,product=1;
	int a[]= {31,4,-35,-16,89};
	for(i=0;i<a.length;i++)
	{
		if(a[i]%2==1||a[i]>0)
		{
			product=product*a[i];
		}
	}
		System.out.println("product is"+product);
	}

	}
