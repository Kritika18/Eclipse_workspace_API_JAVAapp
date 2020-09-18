package algo;

import java.util.LinkedList;
import java.util.Stack;

public class NoOfAppendsPalindrome {

	public static void main(String[] args)
	{
	StringBuffer str = new StringBuffer("dadca");  //problem with other strings 
	NoOfAppendsPalindrome Obj = new NoOfAppendsPalindrome();
	Obj.appendToPalindrome(str);
	}

	
	private void appendToPalindrome(StringBuffer str) {
		// TODO Auto-generated method stub
		int i =1 , found=0;
		char foundMid ;
		int size = str.length();
		System.out.println(size);
		Stack<String> left = new Stack<String>();
		Stack<String> right = new Stack<String>();
		for( i =1 ; i<size-1 ; i++)
		{
			//System.out.print(i);
			if(str.charAt(i+1) == str.charAt(i-1))
			{
				
				foundMid = str.charAt(i);
				System.out.println(foundMid);
				found = 1;
				break;
				
			}
			
		
			
		}
		if(found==0)
		{
			foundMid = str.charAt(i);
			System.out.println(foundMid);
		}
	    
		System.out.print(i);
		for(int j = 0 ; j < i ; j++ )
		{
			char s =  str.charAt(j);
			String myStr = Character.toString(s);
			
			left.push(myStr);
			
		}
		for(int j = i+1 ; j < str.length() ; j++ )
		{
			char c =  str.charAt(j);
			String myStr = Character.toString(c);
			System.out.println("right" +myStr);
			right.push(myStr);
			
		}
		System.out.println("left" +left);
		System.out.println("right" + right);
		
		String lefthead =left.peek() ;
		String righthead = right.peek();
		while(!right.isEmpty() || !left.isEmpty())
		{
			
			if(!left.isEmpty())
			{
			lefthead = left.peek();
			System.out.println("not empty" +lefthead);
			
			}
			else
			{
				lefthead = null;
				System.out.println("in else" +lefthead);
			}
			if(!right.isEmpty())
			{
			 righthead = right.peek();
			 System.out.println("not empty" +righthead);
			}
			else
			{
				righthead=null;
				System.out.println("in else" +righthead);
			}
			
			// here add 
			System.out.println("left in while " +left);
			System.out.println("right" + right);
	if(lefthead!=null && righthead!=null)		
	{
		 if(lefthead.contentEquals(righthead))   // problem here 
		 {
			 System.out.println(lefthead.contentEquals(righthead));
			left.pop();
			right.pop();
			System.out.println("inside equal" + left);
		 }
		 else if(left.size()>right.size())
		 {
			for(int k = 0 ; k< left.size();k++)
			{
			String append= left.pop();
			//System.out.println("after pop" +left.peek());
			str.append(append);
			}
		 }
		 else if (right.size()>left.size())
		 {
			for(int k = 0 ; k< right.size();k++)
			{
			String append= right.pop();
			System.out.println("hi"+append);
			str.insert(k,append);
			//count++;
			}
		 }
	}
//	if(righthead!=null)		
//	{
//		 if(righthead.contentEquals(lefthead))   // problem here 
//		 {
//			 System.out.println(righthead.contentEquals(lefthead));
//			left.pop();
//			right.pop();
//			System.out.println("inside equal" + left);
//		 }
//	}
//	
	else
	{ 
	  if(left.size()>right.size())
		 {
			for(int k = 0 ; k< left.size();k++)
			{
			String append= left.pop();
			//System.out.println("after pop" +left.peek());
			str.append(append);
			}
		 }
		 else if(right.size()>left.size())
		 {
			for(int k = 0 ; k< right.size();k++)
			{
			String append= right.pop();
			System.out.println("hi"+append);
			str.insert(k,append);
			//count++;
			}
		 }
		 System.out.println(right.isEmpty());
		}
	}
			
		System.out.println(str);
		
		}
	
	
	
}

