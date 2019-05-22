import java.util.*;
import java.util.stream.IntStream;
public  class  RandomizedCollection<E>   {
	
	ArrayList<E> AL;
	
	public RandomizedCollection(int size)
	{
	 	AL=new ArrayList<>(size);
		
	}
   

	public void initialFill(E o)
	{AL.add(o);}

	public void add(E o) 
	{
     		for(int i=0; i< AL.size();i++)
     		{
		
    			if(AL.get(i).equals(0)||AL.get(i).equals("EMPTY")||AL.get(i).equals(null))
    	 		{
				AL.set(i,o);
    				break;
    	 		}
     		}
     	}
	
	
	public void remove(int index)
	{
		AL.remove(index);
	}
	
	public void overwrite(int index, E newElement) 
	{
		AL.set(index, newElement);
	}
	public void seeContents() 
	{
		for (int i=0; i< AL.size();i++)
		{
		System.out.println(AL.get(i).toString());
		}
	}
	public E getRandom() {
		Random r = new Random();
		int rNum = r.nextInt(AL.size());
		E randomItem;
		randomItem = AL.get(rNum);
		return randomItem;
	}
	public E getRandom(int start, int end) {
		if(end> AL.size()|| start> AL.size())
			try {
				throw new Exception();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		
		Random r = new Random();
		IntStream iS = r.ints(1, start, end+1);
		int rNum = iS.findFirst().getAsInt();
		E randomItem;
		randomItem = AL.get(rNum);
		return randomItem;
	}

	
	
}


