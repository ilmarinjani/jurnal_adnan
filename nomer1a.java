package javaapplication1;

import java.util.Scanner;


public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int count = input.nextInt();
                
        int n1=0,n2=1,n3,i;    
        System.out.print(n1+" "+n2);//printing 0 and 1    

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
        {    
         n3=n1+n2;    
         System.out.print(" "+n3);    
         n1=n2;    
         n2=n3;    
        }    
    }  
}
