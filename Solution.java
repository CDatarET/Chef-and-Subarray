import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
	    int l = scan.nextInt();
	    int[] arr = new int[l];
        for(int i = 0; i < l; i++){
            int t = scan.nextInt();
            arr[i] = t;
        }
        
        int n = 0;
        int max = 0;
        for(int i = 0; i < l; i++){
            if(arr[i] == 0){
                n = 0;
            }
            else{
                n++;
            }
            if(n > max){
                max = n;
            }
        }
        System.out.println(max);
	}
}
