package algo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class Pairs {
	
	public static void main(String args[])
	{
	Integer[] arr = {2,1,3,0};
	
	
	Pairs Obj = new Pairs();
	Obj.findCombination(arr);
	
	}
	public void findCombination(Integer[] a)
	{
		int count=0;
		
		Queue<Integer> q = new LinkedList<Integer>();
		
	    Collections.addAll(q,a );
	    System.out.println(q);
	    int[] output = new int[12];
	    Map<Integer,Integer> m = new HashMap<Integer,Integer>();
	   ArrayList<Integer> oq = new ArrayList<Integer>();
		while(!q.isEmpty())
		{
	    int n = q.poll();
	    System.out.println(n);
	    count++; 
	    
	    for(int i = count ; i<a.length ; i++)
	    {
	    	
	    	output[i]= a[i];
	    	System.out.println("in for " +a[i]);
	    	
	    	int sum = n +a[i];
	    	int val = 0;
	    	if(count==1) 
	    	{
	    		oq.add(sum);
	    		oq.add(n);
	    		oq.add(a[i]);  // for adding first sums in queue .
	    	}
	    	if(!m.containsKey(sum))
	    	{
	    	m.put(sum,val);  //  
	    	
	    	}
	    	else
	    	{
	    		m.put(sum, m.get(sum)+1 );
	    		oq.add(sum);
	    		oq.add(n);
	    		oq.add(a[i]);
	    		
	    	}
	    	System.out.println("oq is" +oq);
	    }
	    
	    System.out.println("sum"+m);
	    
	   
		}
		System.out.println("oq is" +oq);
	
	int found =0;
	for (Map.Entry<Integer, Integer> entryinmap : m.entrySet()) 
	{
		int index1=0;
		if(entryinmap.getValue()>=1)
		{
			found = entryinmap.getKey();
			System.out.println("found sum is" +found);
		
			for(int j =0 ; j<oq.size() ; j++)
			{
				System.out.println("% 3 " + oq.indexOf(found));
				if( oq.get(j) == found && oq.indexOf(found)%3 == 0)
				{
				
				// System.out.println(oq.get(j));
					
						
					
			      index1 = oq.indexOf(oq.get(j));
			     
			     System.out.println("Index at " + index1);
			     
				}
				
				if( index1<=oq.size()-3 && oq.get(index1+1) + oq.get(index1+2) == found ) {
					
					System.out.println("Pair is"+oq.get(index1+1)+ " " + oq.get(index1+2));
					System.out.println("remove" +oq.remove(index1));
					int n  = index1 + 1 ;
					System.out.println("remove" +oq.remove(index1));
					System.out.println("remove " +oq.remove(index1));
					System.out.print("new" +oq);
					
				}
			}
			
			
		}
		
		
		
		
	}
	
	}

}
