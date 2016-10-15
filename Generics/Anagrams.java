import java.io.*;
import java.util.*;

public class Anagrams {
	static boolean isAnagram(String a, String b) {
        
        char[] arrA = a.toLowerCase().toCharArray();
        char[] arrB = b.toLowerCase().toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        return ((String.valueOf(arrA)).equalsIgnoreCase(String.valueOf(arrB)));
    }
	
	public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}