
public class Sum 
{
	public static void main(String args[])
	{
	
	Scanner sc=new Scanner(System.in);
	char i,j;
	int sum=0;
	char ch[]= {'$','@','t','h','@','T','e','c','h','2','7','Y','E','a','r','$','2','4','/','7'};
	for(i=0;i<ch.length;i++)
	{
		/*for(j='0';j<='9';j++)
		{
			if(ch[i]==j)
			{
				
				sum=sum+ch[i];
		}System.out.println(ch[i]+" ");*/

		if(ch[i]>='0'&&ch[i]<='9') 
		{
			sum=sum+ch[i];
		}
		System.out.println("sum is"+sum);
		
	}
}
}
