package day5assignment;

public class SplitMethod {

	public static void main(String[] args) {
		String sentence = "Java is easy to learn"; 
		String words[] = sentence.split("\\s+");
		for (int i = 0; i < words.length; i++) { 
			System.out.println(words[i]); }

	}

}
