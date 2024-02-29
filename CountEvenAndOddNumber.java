import java.util.*;
class CountEvenAndOddNumber{
    public static void main(String[]args){
        System.out.println("Enter the Number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int even_count=1;
        int odd_count=1;
        
        while(num>0){
            int rem=num%10;
        if(rem%2==0){
            System.out.println("The Even digit count is:"+even_count++);
        }
        else{
            System.out.println("The odd digit count is:"+odd_count++);
        }
        num=num/10;
    }
    }
}
