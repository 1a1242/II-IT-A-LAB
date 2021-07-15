class PowerOfNum
{
  public static void main(String arg[])	
  {
    int n=5, p=3, r=1;
 
    if(n>=0 && p==0)
     {
        r = 1;
     }
    else if(n==0&&p>=1)
      { 
         r = 0;
      }
    else
     {
         for(int i=1; i<=p; i++)
	 {
            r = r*n;
 	 }	    
     }
    System.out.println(n+"^"+p+"="+r);
  }
}
