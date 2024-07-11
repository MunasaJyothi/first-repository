
public class Twodimentionalarray 
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	//int a[]= {31,4,-35,-16,89,4,6,5};
		int a[][]=new int[5][5];
		int i,j,n,row,col;
		System.out.println("enter the size of 2-d array");
		row=sc.nextInt();
		col=sc.nextInt();
		
		System.out.println("Enetre the elements of 2-d");
		for(i=0;i<row;i++);
		
		{
			for(j=0;j<col;j++);
			{
				a[i][j]=sc.nextInt();
			}
		}
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
			System.out.println(a[i][j]+" ");
				}
		System.out.println(" ");
			}
		}
}