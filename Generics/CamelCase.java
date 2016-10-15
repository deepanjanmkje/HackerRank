import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] cArr = s.toCharArray();
        int count = 1;
        for(char c : cArr){
            if(Character.isUpperCase(c))
                count++;
        }
        System.out.println(count);
    }
}