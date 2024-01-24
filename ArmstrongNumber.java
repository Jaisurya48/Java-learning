import java.util.*;

class ArmstrongNumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");

        int num=sc.nextInt();
        int new_num=num;
        double rev=0;

        while(num!=0){
            rev+=Math.pow(num%10,3);
            num=num/10;

        }

        if(new_num==rev){
            System.out.println(new_num+"is a palindrome number");
        }
        else{
            System.out.println(new_num+"is not a palindrome number");
        }
    }
}