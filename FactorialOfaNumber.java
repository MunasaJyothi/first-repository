
public class FactorialOfaNumber
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int n=sc.nextInt();
	int product=1;
	
	while(n>0)
	{
		product=product*n;
		n--;
	}
	System.out.println("factorial is"+product);
}
}