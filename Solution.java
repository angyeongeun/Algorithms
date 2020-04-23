import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    // Complete the jumpingOnClouds function below
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int jump = 0;
        int c = 0; //start at 0 cloud

        int num = sc.nextInt();
        int[] n = new int[num];
        

        for(int i = 0; i < n.length; i++){
      
            n[i] = sc.nextInt();
           
        
           
            

        }

       

        while(c < num -2){


            if(n[c+1] == 0 && n[c+2] ==0){
                c = c + 2;
                jump++;
            }else if(n[c+1] == 0 && n[c+2] ==1){
                c = c + 1;
                jump++;
            }else if(n[c+1] ==1 && n[c+2] ==0){
                c = c + 2;
                jump++;
            }

            if(c == num-2){jump++;}
            

        }

        if(1< num && num < 3){ jump++;}


        System.out.println(jump);
        





    }

}
