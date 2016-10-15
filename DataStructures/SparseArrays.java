import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SparseArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.valueOf(in.nextLine());					// total no of data strings
        HashMap<String, Integer> dataMap = new HashMap<>();		// map hold the final tally of string ad their count
        int count = 0;											// used to segregate data and query strings
        int q = 0;												// total no of query strings
        while(in.hasNext()){									// fetch all the data sequentially
            while(count<n){										// load only the data strings
                String key = in.nextLine();
                if(!dataMap.containsKey(key)){					
                    dataMap.put(key, 1);						// add first occurance of data string in map
                }
                else{
                    dataMap.put(key, (dataMap.get(key))+1);		// increament remaining occurances of data string
                }
                count++;										// ensure loop runs only n times
            }
            q = Integer.valueOf(in.nextLine());
            count = 0;											// referesh counter
            while(count<q){										// load only query strings
                String qString = in.nextLine();
                if(dataMap.containsKey(qString)){
                    System.out.println(dataMap.get(qString));	// print total occurances of query string from map
                }
                else{
                    System.out.println("0");					// print 0 if no occurances found
                }
                count++;
            }
        }        
    }
}