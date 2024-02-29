import java.util.*;
class Calculator{
    public static void main(String[] args) {
        System.out.println("Enter the value of a:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        //Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        System.out.println("choice");
        int ch=sc.nextInt();

        switch (ch) {
            case 1:System.out.println("The answer is:"+(a+b)); break;
            case 2:System.out.println("The answer is:"+(a-b)); break;
            case 3:System.out.println("The answer is:"+(a*b)); break;
            case 4:System.out.println("The answer is:"+(a/b)); break;
            case 5:System.out.println("The answer is:"+(a%b)); break;
            default:System.out.println("Invalid"); break;
        }
    }
}