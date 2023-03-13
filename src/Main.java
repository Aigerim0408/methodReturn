import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(summashisel(num1,num2));
    }
    public static int summashisel (int a, int b){
        int sum = 0;
        for (int i = a; i <b ; i++) {
            sum+=i;
        }return sum;

    }
}