package day5assignment;
import java.util.StringTokenizer;
public class StringTokenzier {

	public static void main(String[] args) {
		String str = "Java,Spring,MySQL"; 
		StringTokenizer st = new StringTokenizer(str, ",");
		while (st.hasMoreTokens()) { 
			System.out.println(st.nextToken()); 
			}

	}

}
