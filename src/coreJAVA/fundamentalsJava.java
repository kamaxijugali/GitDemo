package coreJAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fundamentalsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables in Java
		/*int var = 10;
		String webstire = "Rahul Shetty Academy";
		boolean java=true;
		double number=10.99;
		char c = 'k';
		
		System.out.println (var + "is number to be displayed");*/
		
		
		
		//************************************************************************************
		//Array declaration and initialization
		/*int[] arr1 = new int[5];
		arr1[0]=10;
				
		int[] arr2= {1,2,3,4,5};
		System.out.println(arr2[0]);
		
		
		for (int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		
		String[] names = {"rahu", "shetty", "academy"};
		for (int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		
		
		for (String s:names)
		{
			System.out.println(s);
		}*/
		
		/*int[] list1 = {1,2,3,4,5,6};
		
		for (int i =0; i<list1.length;i++)
		{
			if (list1[i]%2 == 0)
			{
				System.out.println(list1[i]);
				break;
			}
			else
			{
				System.out.println(list1[i] + "is not even number");
			}
		}*/
		
		
		//************************************************************************************
		//Array List
		/*ArrayList<String> arr3= new ArrayList<String>();
		arr3.add("hi");
		arr3.add("hello");
		arr3.add("you");
		arr3.add("there");
		
		arr3.remove(2);
		arr3.get(0);
		System.out.println(arr3);
		
		for (int i=0;i<arr3.size();i++)
		{
			System.out.println(arr3.get(i));
		}
		
		System.out.println(arr3.contains("hello"));
		
		String[] names = {"rahu", "shetty", "academy"};
		List<String> arr4 = Arrays.asList(names);
		System.out.println(arr4);*/
		
		
		
		//************************************************************************************
		//String object and functions
		String s1="hello";
		String s2="hello";
		
		String s3= new String("hello");
		String s4= new String("hello hi you there");
		
		String[] arr5=s4.split("you");
		for (int i=0;i<arr5.length;i++)
		{
			System.out.println(arr5[i]);
		}
		
		System.out.println(s4.length()-1);
		for (int j=(s4.length()-1); j>0; j--)
		{
			System.out.println(s4.charAt(j));
		}
	}

}
