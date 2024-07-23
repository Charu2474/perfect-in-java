import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int num=r.nextInt();
        int tot=0;
        if(num>0)
        {
            for(int i=1;i<num;i++)
            {
                if(num%i==0)
                {
                    tot+=i;
                }
            }
            if(tot==num){
                System.out.println("The Number "+(float)num+" is a Perfect Number.");
            }
            else
            {
                System.out.println("The Number "+(float)num+" is a Not Perfect Number.");
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }
            
    }
}
