import java.util.Scanner;

public class Fibonacci{
     static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n = sc.nextInt();
        if(n>0) {
            int first = 0, second = 1;
            for (int i = 1; i <= n; i++) {
                System.out.print(first+ " ");
                int next = first + second;
                first = second;
                second = next;
            }
        }
        else{
            System.out.println("invalid input");

        }
        sc.close();
    }
}