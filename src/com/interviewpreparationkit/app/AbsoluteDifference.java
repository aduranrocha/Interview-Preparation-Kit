package com.interviewpreparationkit.app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class AbsoluteDifference {

    // Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifference(int[] arr) {
        int diff = Integer.MAX_VALUE; 
        int n = arr.length;
        for (int i = 0; i<n-1; i++) 
            for (int j = i+1; j < n; j++) 
                if (Math.abs((arr[i] - arr[j]) ) < diff) 
                    diff = Math.abs((arr[i] - arr[j]));   
        return diff; 

    }
    
    static int minimumAbsoluteDifferenceImprove(int[] arr) {
        Arrays.sort(arr);
        int min = Math.abs(arr[0] - arr [1]);
        for(int i = 1 ; i < arr.length-1 ; i++){
            if(Math.abs(arr[i] - arr[i+1]) < min)
            min = Math.abs(arr[i] - arr[i+1]);
        }
    return min;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = minimumAbsoluteDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
