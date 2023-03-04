package coreJava2;

import coreJAVA.methodsDemo;

public class methodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodsDemo m = new methodsDemo();
		m.getData();
		getData2();
		String s= m.getData4();
		System.out.println(s);
		
		methodsDemo2 m3 = new methodsDemo2();
		m3.getData3();
		
		
	}
	
	public void getData() 
	{
		System.out.println("Hi there");
		
	}

	public static void getData2() 
	{
		System.out.println("GetData2 Hi there");
		
	}
	
	public String getData4() 
	{
		System.out.println("Hiiiiiiiiiii");
		return ("YOU");
		
	}

	
}


