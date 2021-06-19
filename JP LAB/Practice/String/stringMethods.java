class stringMethods
{
	public static void main(String[] args)
	{   
	    	String s = "Welcome, To, Java, Programming!";
	    	String s1 = "Hello";
	    	String s2 = " World!";
        String s4 = "HELLO";
	    	String s3 = s1.concat(s2);
	    	System.out.println(s3);
	    	int l = s3.length();
	    	System.out.println(l);
	    	char ch = s3.charAt(0);
	    	System.out.println(ch);
	    	int comp = s1.compareTo(s2);
	    	System.out.println("Comparision of the strings is: "+comp);
		if (comp >= 0)
		{
			if (comp == 0)
			{
				System.out.println("Two strings are identical");
			}
			else
				System.out.println("S1 > S2");
		}
		else 
			  System.out.println("S1 < S2");

	    	System.out.println(s1.equals(s2));
		    System.out.println(s1.equalsIgnoreCase(s4));
	    	System.out.println("The starting char of string s1 is: " +s1.startsWith("k"));
	    	System.out.println("The string s1 ends with: " +s1.endsWith("o"));
	    	System.out.println("The index value is: "+s1.indexOf("o"));
	    	System.out.println("The last index: "+s1.lastIndexOf("l"));
	    	System.out.println("The substring: "+s1.substring(1, 4));
		    System.out.println("The uppercase of S1 string is : "+s1.toUpperCase());
		    System.out.println("The lower case of string S1 is : "+s1.toLowerCase());
		    System.out.println("trim: "+s2.trim());
		    System.out.println(s2.equalsIgnoreCase(s1));
		    System.out.println(s2.compareToIgnoreCase(s1));
	}
}
