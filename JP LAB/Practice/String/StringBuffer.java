class StringBuffer
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello");  
	    	System.out.println(sb.length());
	    	System.out.println(sb.capacity());//default 16  
        	sb.append("Hello ");  
        	System.out.println(sb.capacity());//now 16  
        	sb.append("the language used is java");  
    	    	System.out.println(sb.capacity());
       		StringBuffer sb1 = new StringBuffer("Wellcome to ");
	    	sb1.append("Java");  
       		System.out.println(sb1);
       		sb1.insert(0, "Hello!! ");
       		System.out.println(sb1);
		System.out.println(sb);
       		sb.delete(0,5); 
       		System.out.println(sb);
       		sb1.deleteCharAt(0);
       		System.out.println(sb1);
       		StringBuffer sb2 = new StringBuffer("Hello world!"); 
        	sb2.reverse();
        	System.out.println(sb2);
       	 	//StringBuffer sb3 = new StringBuffer("Hello world! "); 
        	
	}
}
