import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное чило");
        int n = scanner.nextInt();
        int sum = 0;
        int currentDigit;
        for (int i = 0; i < n; n = n / 10) {
            currentDigit = n % 10;
            sum = sum + currentDigit;
        }
        sum = sum + n;
        System.out.println("Сумма всех цифр равна " + sum);

    }
}
