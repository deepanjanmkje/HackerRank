import java.io.*;
import java.util.*;

public class Pangrams {

    public static void main(String[] args) {
        char[] a = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
        Scanner in = new Scanner(System.in);
        String s = "";
        while(in.hasNext()){
            s += in.next();
        }
        boolean flag = true;
        s = s.toLowerCase();
        for(char c : a){
            if(!s.contains(String.valueOf(c))){
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("pangram");
        else
            System.out.println("not pangram");
        
    }
}