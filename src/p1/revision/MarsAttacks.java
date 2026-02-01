package p1.revision;

import java.util.Arrays;

public class MarsAttacks {
	
	public static final String REDACTED = "\u25A0";


	public static void main(String[] args) {
		String[] fullReport = {
				"FBI Report on UFOs",
				"We believe UFOs do visit our planet.",
				"Many cows have been abducted in Roswell New Mexico USA",
				"Several reports of Aliens have been made",
				"We think they come from Mars",
				"The FBI are concerend about public panic",
				"Strictly confidential",
				"For your eyes only Mr Persident",
				"God help is all and God bless America",
				"End of message..."
		};
		
		String[] wordsToRedact = {
				"FBI",
				"UFO",
				"UFOs",
				"Roswell",
				"Cow",
				"Cows",
				"Abducted",
				"Mars",
				"Alien",
				"Aliens",
				"President",
				"America"
		};
		
		System.out.println("Full version");
		printReport(fullReport);
		
		// Create redacted report
		String[] redactedReport = reportRedactor(fullReport, wordsToRedact);
		
		System.out.println("***************");
		System.out.println("Redacted version");
		printReport(redactedReport);
	}
	
	private static String[] reportRedactor(String[] fullReport, String[] redactedWords) {
		String[] finalOutput = new String[fullReport.length];
		String newLine = "";
		
		// Line array
		for (int lineCounter = 0; lineCounter < fullReport.length; lineCounter++) {
			String line = fullReport[lineCounter];
			String[] words = line.split(" ");

			// Words array
			for (int wordCounter = 0; wordCounter < words.length; wordCounter++) {	
				String word = words[wordCounter];
				int wordSize = word.length();
				
				// Redacted Word array
				for (String redactedWord : redactedWords) {
					if (redactedWord.equalsIgnoreCase(word)) {
						words[wordCounter] = charReplacer(wordSize);
						break;
					}
				}
			}
			newLine = stringBuilder(words);
			finalOutput[lineCounter] = newLine;
		}
		
		return finalOutput;
	}

	private static String stringBuilder(String[] array) {
		StringBuilder builder = new StringBuilder();
		for (String element : array) {
			builder.append(element + " ");
		}
		String output = builder.toString().trim();
		
		return output;
	}

	private static String charReplacer(int wordSize) {
		// Generate strings of wordSize of \u25A0
		String replacer = REDACTED.repeat(wordSize);
		
		return replacer;
	}

	public static void printReport(String[] array) {
		for(String element : array) {
			System.out.println(element);
		}
	}
	
	
	
	

}
