import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Excercise {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		String name;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name to check");
		name = s.nextLine();
		StringBuilder rev = new StringBuilder();
		for(int i=0;i<name.length();i++){
			boolean isNumber = false;
			for(char ch='a';ch<='z';ch++){
				if(name.charAt(i) == ch){
					isNumber = true;
					break;
				}else{
					isNumber = false;
				}
			}
			if(isNumber){
				rev = rev.append(name.charAt(i));
			}else{
				int number=Character.getNumericValue(name.charAt(i));
					for(int j=1;j<=number;j++){
						rev = rev.append(name.charAt(i-1));
					}
			}
		}
		System.out.println(rev);

	}
}
