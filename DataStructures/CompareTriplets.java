import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CompareTriplets {

    static int acs = 0;
    static int bcs = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        comparator(a0,b0);
        comparator(a1,b1);
        comparator(a2,b2);
        System.out.println(acs + " " + bcs);
    }
    
    private static void comparator(int a, int b){
        if(a>b)
            acs++;
        else if(a<b)
            bcs++;
    }
}