
public class SwapLnumSnum {

	public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in);
       
       int a[]=new int[10];
       int i = 0,lar,lind,sml,sind,temp;
       System.out.println("entet size of a array");
       int n=sc.nextInt();
       
       System.out.println("enter array elements");
      
       a[i]=sc.nextInt();
      
       for(i=0;i<n;i++)
       {
    	  
    	   lar=a[0];
    	   
    	   if(a[i]>lar)
    	   {
    		   lar=a[i];
    		  // lind=i;
    	   }
       }
       for(i=0;i<n;i++)
       {
    	   sml=a[0];
    	   if(a[i]<sml)
    	   {
    		   sml=a[i];
    		   //sind=i;
    	   }
       
     
	}

}
}