
public class StringEXample {

	public static void main(String[] args) {
		
		String s1="Login successful";
		String s2="Login successful";
		//equals()
		if (s1.equals(s2)) 
			System.out.println("strings are same");
		else
			System.out.println("strings are not same");
		if (s1==s2)
			System.out.println("both  strings are same");
		else
			System.out.println("both strings are not same");
		String s3=new String("Login successful");	
		String s4=new String("Login successful");
		if (s3.equals(s4)) 
			System.out.println("login strings are same");
		else
			System.out.println("login strings not same");
		if (s3==s4)
			System.out.println("both login are same--==");
		else
			System.out.println("both login not same--== because referencrs/address are comparing here");
		//trim()
		String s5="   Login successful  ";
		if (s1.equals(s5.trim()) )
			System.out.println("after trim strings are same");
		else
			System.out.println("not same");
		
		System.out.println(s5);
		System.out.println(s5.trim());//trim() is working here
		
		if (s1==s5.trim())//not working trim here
			System.out.println("both are same after trim");
		else
			System.out.println("not same after trim");//this is displaying instead
		
		//contains()
		
		String s9="Login successful";//String s9=new String("Login successful");
		String s10="Login successful James"	;//String s10=new String("Login successful James");
		if (s10.contains(s9))
		
		System.out.println("yes");
		else
			System.out.println("no");
		//split()
		/*String str1="120/150/60/225";
		String str1Array[]=str1.split("/");
		*/
		//when use dot delimeter in split() ,we need to use escape characters (two back slashes)  or regular expression [.] 
		String str1="120.150.60.225";
		
		//String str1Array[]=str1.split("\\."); or
		
		String str1Array[]=str1.split("[.]");
		
		System.out.println(str1Array[0]);
		System.out.println(str1Array[1]);
		System.out.println(str1Array[2]);
		System.out.println(str1Array[3]);
		/*String actual="Doctor Name:  david";
		String actualArray[]=actual.split(":");
		System.out.println(actualArray[0]);
		
		System.out.println(actualArray[1]);
System.out.println("Hi");
		
		String str = new String("28/12/2013");
		
		String array1[]= str.split("/");
		for (String temp: array1){
		      System.out.println(temp);
		}*/
		String s6="Hello";
		String s7="HELLO";
		
		if (s6.equalsIgnoreCase(s7)) 
			System.out.println("strings are same");
		else
			System.out.println("not same");
			
			String s8="Login successfull hentry";
			
			System.out.println(s8.split(" ")[2]);
			
		System.out.println(s8.substring(18,24));
		
		//replace()
		
		String str3=new String("Hello,Wellcome");
		System.out.println(str3.replace('l', 'a'));
		System.out.println(str3.replace("l", "c"));
		System.out.println(str3.replaceFirst("ll", "a"));	
		System.out.println(str3.replaceAll("l", "c"));
		
		//concat()
		String ss="Begin";
		ss=ss.concat(" learning").concat(" by").concat(" reading").concat(" text book");
		System.out.println(ss);
		
		//compareTo()
		
		String str11 = "String method tutorial";
	       String str22 = "compareTo method example";
	       String str33 = "String method tutorial";
		
		System.out.println(str11.compareTo(str22));
		System.out.println(str11.compareTo(str33));
		
	       System.out.println(str22.compareTo("compareTo method examp"));
	       
	       //compareTo used to find length
	       String str12 = "Cow"; 
	   	//This is an empty string
	   	String str23= "";
	   	String str32 = "Goat";
	   		
	   	System.out.println(str12.compareTo(str23));

	   	System.out.println(str32.compareTo(str23));
	   	
	   	//compareToIgnoreCase
	       
	   	String str20 = "HELLO"; 
		
		String str21 = "hello";;
			
		System.out.println(str21.compareTo(str20)); 
		System.out.println(str21.compareToIgnoreCase(str20));  
		
		//indexOf()
		
		String si=new String("Welcome to the class");
		System.out.println(si.indexOf('c'));
		
		System.out.println(si.indexOf("com"));
		System.out.println(si.indexOf('c',4));
		
		
		
		
	       
	       
		}
	}


