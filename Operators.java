import java.util.*;

public class Operators{
    public static void main(String[]args){
        int a=23;
        int b=48;

        System.out.println("---------Arithmetic operators---------");

        System.out.println("Addition of digits:"+(a+b));
        System.out.println("Subtraction of digits:"+(b-a));
        System.out.println("Multiplication of digits:"+(a*b));
        System.out.println("Division of digits:"+(a/b));
        System.out.println("Modulus of digits:"+(a%b));

        System.out.println("---------Arithmetic operators---------");

        System.out.println(a==b); //false
        System.out.println(a!=b); //true
        System.out.println(a<b);  //true
        System.out.println(a>b);  //false
        System.out.println(a<=b); //true
        System.out.println(a>=b); //false

        boolean x=true;
        boolean y=false;
        System.out.println("---------Logical operators---------");

        System.out.println(x&&y);
        System.out.println(x||y);
        System.out.println(!x);

        System.out.println("---------incremental operators---------");

        a--; //a-- is equal to a=a-1
        System.out.println(a);
        
        a++; //a++ is equal to a=a+1
        System.out.println(a);

        a--; //a-- is equal to a=a-1
        System.out.println(a);
    }
}