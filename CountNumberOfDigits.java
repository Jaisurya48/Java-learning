import java.util.*;
import java.util.Scanner;
class CountNumberOfDigits{
    public static void main(String[] args) {
        int count=0;
        System.out.println("Enter a digits:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        

        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("Count:"+count);
    }
}