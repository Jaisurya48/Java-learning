import java.util.*;
public class largestNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The value of a:");
        int a=sc.nextInt();
        System.out.println("The value of b:");
        int b=sc.nextInt();
        if (a>b) {
            System.out.println("a should be greater than b");
        }
        else{
            System.out.println("b should be greater than a");
        }
    }
}