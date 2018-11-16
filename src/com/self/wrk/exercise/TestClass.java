package com.self.wrk.exercise;
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes */
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    
    private static int sort(int[] arr,int n) {
        int swapCount = 0;
        
        for(int i=0; i<n;i++) {
            
            for(int j=0;j<n-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapCount++;
                }
            }
        }
        return swapCount;
    }
    
    
    
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
        //Scanner
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        int[] inputArr = new int[count];
        // Reading input from STDIN
        for(int i=0;i<count;i++){
            Scanner input = new Scanner(System.in);
            inputArr[i] = input.nextInt();
        }
        System.out.println(sort(inputArr,count));
           // Writing output to STDOUT

        

        // Write your code here

    }
}
