package day8assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {
		try(BufferedReader bf=new BufferedReader(new FileReader("src/day8assignment/ThrowThrowsDemo.java")
)){
			String line;
			while((line=bf.readLine())!=null) {
				System.out.println(line);
			}
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
