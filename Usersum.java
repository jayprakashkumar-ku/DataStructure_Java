import java.util.Scanner;

public class Usersum {
    public static void main(String[] args) {
        int a,b,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a= ");
        a=sc.nextInt();
        System.out.println("Enter the value of b: ");
        b=sc.nextInt();
        sum=a+b;
        System.out.println("Sum of the Given Number Is "+sum);
    }
    
}
