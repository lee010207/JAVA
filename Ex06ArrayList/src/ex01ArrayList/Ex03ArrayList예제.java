package ex01ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03ArrayList예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		getMiddle("power");
		getMiddle("test");
		
	}
	
	public static void getMiddle(String word) {
		ArrayList <String> str = new ArrayList<>();
	
		for(int i = 0; i < word.length(); i++) {
			str.add(word.substring(i, i+1));
		}
		if(word.length()% 2 == 0) {
			System.out.print(str.get(str.size()/2-1));
			System.out.print(str.get(str.size()/2));
		}else {
			System.out.println(str.get(str.size()/2));
		}
	}
	
}
