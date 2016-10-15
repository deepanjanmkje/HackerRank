import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String values = in.nextLine();
        int n = Integer.valueOf((values.split(" "))[0]);
        int d = Integer.valueOf((values.split(" "))[1]);
        int[] arr = new int[n];
        int count = 0;
        while(in.hasNext()){
            arr[count++] = Integer.valueOf(in.next());
        }
        for(int i=0; i<d; i++){
            int start = arr[0];
            int temp = n-1;
            for(int y=0; y<n-1; y++){
                arr[y] = arr[y+1];
            }
            arr[n-1] = start;
        }
        for(int x=0; x<n; x++){
            System.out.print(arr[x] + " ");
        }
    }
}