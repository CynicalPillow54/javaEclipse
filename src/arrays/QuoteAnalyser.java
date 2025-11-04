package arrays;

public class QuoteAnalyser {

	public static void main(String[] args) {
    	int numberWords=0;
    	int numberLetters=0;
    	String smallestWord;
    	String largestWord;


    	String[] quote = {"Continuous", "effort", "not" ,"strength",
    			"nor","intelligence","is","the","key",
    			"for","unlocking","our","potential"};

    	// setting the smallest and largest words to enable a later
    	// comparison
    	smallestWord = quote[0];
    	largestWord  = quote[0];

    	for (int loop=0;loop<quote.length;loop++){
    		System.out.print(quote[loop]);
    		System.out.print(" ");

    		// gather info when doing this ..
    		numberWords++;
    		numberLetters+=quote[loop].length();

    		// is this the largest word ?
    		if (quote[loop].length() > largestWord.length()){
    			// new largest word found
    			largestWord = quote[loop];
    		}

    		// is this the smallest word ?
    		if (quote[loop].length() < smallestWord.length()){
    			// new smallest word found
    			smallestWord = quote[loop];
    		}

    	}
    	System.out.println("");
    	System.out.println("Stats ___________________________");
    	System.out.println("Number of words   : "+numberWords);
    	System.out.println("Number of letters : "+numberLetters);
    	System.out.println("Largest word : "+largestWord);
    	System.out.println("Smallest word : "+smallestWord);

	}

}
