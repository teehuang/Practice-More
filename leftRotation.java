import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class leftRotation {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(int j = 0; j < k; j++){
            int temp = a[0];
            
            for(int i = 0; i < a.length-1; i++){
                a[i] = a[i+1];
            }
            a[a.length -1] = temp;
        }

        for(int i = 0; i < a.length; i++){
            if(i != a.length-1){
                System.out.print(a[i] + " ");
            }
            else{
                System.out.print(a[i]);
            }
        }
    }

}
