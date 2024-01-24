import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Arithmetic_operators {
    public static void main(String[] args){
        int a,b,result;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a value of a and b");
        a= scanner.nextInt();
        b= scanner.nextInt();

        result=a+b;
        System.out.println("Result after addition:"+result);

        result=a-b;
        System.out.println("Result after subtraction:"+result);

        result=a*b;
        System.out.println("Result after multiplication:"+result);

        result=a/b;
        System.out.println("Result after division:"+result);

        result=a%b;
        System.out.println("Result after modulo:"+result);

        scanner.close();
    }
        }