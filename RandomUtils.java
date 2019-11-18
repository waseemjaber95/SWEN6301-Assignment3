package com.swen6301.builder;

import java.util.Random;

public class RandomUtils {
	
	/**
	 * An instance of {@link Random} that will be used in generating random identifiers in encolsed methods.
	 */
	private final static Random RANDOM = new Random(System.currentTimeMillis());
	
	/**
	 * A private constructor to prevent accidental instantiations of this class.
	 */
	private RandomUtils() {
		throw new IllegalAccessError("Cannot instantiate instance for RandomUtils class");
	}

	/**
	 * Retrieves a randomized {@link String} of size between 5-10 and the first letter is capitalized.
	 * 
	 * @return A random {@link String}. The returned {@link String} could be <code>null</code>.
	 */
	public static String randomIdentifier() {
		String lexicon = "abcdefghijklmnopqrstuvwxyz";
		if(RANDOM.nextBoolean()) {
			return null;
		}
		int length = RANDOM.nextInt(6) + 5;
	    StringBuilder builder = new StringBuilder();
	    for(int i = 0; i < length; i++) {
	    	int position = RANDOM.nextInt(lexicon.length());
	    	char c = lexicon.charAt(position);
	    	if(i == 0) {
	    		c = Character.toUpperCase(c);
	    	}
	    	builder.append(c);
	    }
	    
	    return builder.toString();
	}
	
	/**
	 * Generates a random number within the given <code>bound</code>.
	 * 
	 * @param bound An integer to bound the random generations (exclusive).
	 * @return An random number.
	 */
	public static int randomNumber(int bound) {
		return RANDOM.nextInt(bound);
	}
	
	/**
	 * Generates a random boolean.
	 * 
	 * @return a random boolean.
	 */
	public static boolean randomBoolean() {
		return RANDOM.nextBoolean();
	}
	
	/**
	 * Generates a random {@link String} for blood type.
	 * 
	 * @return a random blood type {@link String}.
	 */
        
     
   // I create enum for  BloodType !   
enum BloodType 
{ 
    Apositive("A+"),
    Anegative("A-"),
    Bpositive("B+"),
    Bnegative("B-"),
    ABpositive("AB+"),
    ABnegative("AB-"),
    Onegative("O-"),
    Opositive("O+");
  
    private String type; 
  
    public String getType() 
    { 
        return this.type; 
    } 
  
    private BloodType(String type) 
    { 
        this.type = type; 
    } 
}

public static String randomBloodType() {
            BloodType[] Btypes = BloodType.values(); 
  String name = null ; 
        for (BloodType Btype : Btypes) 
        { 
                name = Btype.name() + " symbol: " + Btype.getType(); 
        } 
            return name;	
	}
	
	/**
	 * Generates a random {@link String} for sex types.
	 * 
	 * @return a random sex type {@link String}.
	 */

	// I created enum for SexType
enum SexType 
{ 
    Male("Male"),
  Female("FeMale");
  
    private String type; 
  
    public String getType() 
    { 
        return this.type; 
    } 
  
    private SexType(String type) 
    { 
        this.type = type; 
    } 
}
  

public static String randomSexString() {
    
        
        SexType[] Stypes = SexType.values(); 
    String name = null ; 

        for (SexType Stype : Stypes) 
        { 
            name =  "name : " + Stype.name() + " Type: " + Stype.getType() ; 
        } 
         return name;
    } 
	
}

	

