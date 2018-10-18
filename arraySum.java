import java.util.*;
 public class A {
     public static void main(String[] args){
        int[] a={1,2,4,5};
        int[] b={9,9,9,9};
        int[] val= new int[b.length];
        int carry = 1;
        for(int i=b.length-1 ; i>=0 ; i--){
            int sum = b[i] + carry;
            if(sum ==10) carry =1;
            else carry = 0;
            val[i] = sum %10;
        }
        if(carry ==1){
            val =new int[b.length+1];
            val[0] = 1;
            
        }
        for(int v : val)
            System.out.println(v);
		
     }
     
}