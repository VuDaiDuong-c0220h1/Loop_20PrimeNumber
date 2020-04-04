import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Nhập số lượng số cần hiển thị:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 1;
        for ( int n = 2; count <= number; n++) {
            boolean checkPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    checkPrime = false;
                    break;
                }
            }
            if (checkPrime) {
                System.out.println(n);
                count++;
            }
        }
    }
}

