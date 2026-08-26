import java.util.Scanner;

public class Factorial{
    public static int Factorial1(int n){
        int fact = 1;
        for (int i = 1; i<=n; i++){
            fact*= i;

        }
        return fact;
    }
    public static int Factorial2(int n){
        int fact = 1;
        while (n!= 0){
            fact *= n;
        }
        return fact;
    }
    public static int FactorialRecursion(int n){
        if (n == 0 || n == 1 ){
            return 1;
        }
        else {
            return n*FactorialRecursion(n-1);
        }
    }
    public static void main(String[] args){
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num>1) {

            System.out.println(Factorial1(num));
            System.out.println(Factorial2(num));
            System.out.println(FactorialRecursion(num));
        }
        else if (num==0 || num==1){
            System.out.println("1");
        }
        else {
            System.out.println("input is not valid");
        }
        sc.close();

    }
}