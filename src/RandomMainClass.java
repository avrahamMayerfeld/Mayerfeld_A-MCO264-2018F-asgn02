
public class RandomMainClass {
/* one problem with this code is that if it is an Integer collection, adding 0 will be
problematic, because in order not to increase the size upon adding, i test for 0 or "empty" or
null and add to that index. I'm not sure of how to avoid that problem otherwise.
	*/
	
	public static <E> RandomizedCollection randomC(int size, Object type) {
		
		if (type instanceof Integer) 
		{
		RandomizedCollection<Integer> R = new RandomizedCollection<Integer>(size);	
			for (int i = 0; i < size; i++) { 
				 R.initialFill(0);
			}
		return R;
		}
		
		
		else if (type instanceof String)
		{
			RandomizedCollection<String> R = new RandomizedCollection<>(size);
		for (int i = 0; i < size; i++) {
			  R.initialFill("EMPTY");
			  }
			  return R;
		}
		
		else {
			RandomizedCollection<Object> R = new RandomizedCollection<>(size);
			for (int i = 0; i < size; i++) {
				  R.initialFill(null);
				}
		return R;
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		Integer intg = new Integer(6);
		String str = "this string";
		
	RandomizedCollection<Integer> RC1=randomC(5,intg);	
	RC1.seeContents();
	
	RC1.add(12); 
	 RC1.add(1); 
	 RC1.add(1987); 
	 RC1.add(387356); 
	 RC1.add(3); 
	 RC1.add(147); 
	 RC1.seeContents();
	 
RC1.remove(0); 
RC1.seeContents();
	
RC1.overwrite(0,13);
RC1.seeContents();	 
	 
    System.out.println( RC1.getRandom() ); 
System.out.println(RC1.getRandom(1,3));
	 
	
	RandomizedCollection<String> RC2 = randomC(5,str);
	 RC2.seeContents();
	
	 RC2.add("one"); 
	RC2.add("two");
	RC2.add("three");
	RC2.add("four");
	RC2.add("five");
	RC2.seeContents();
	
    RC2.remove(1); 
    RC2.seeContents();
    
	RC2.overwrite(2,"seven");
	 RC2.seeContents();
	 
    System.out.println(RC2.getRandom());
    
   System.out.println(RC2.getRandom(0,3));
	    
	}
	}
