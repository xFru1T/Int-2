import java.util.Scanner;
class Int {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.print("Print number: ");
        int num = scanner.nextInt();
        for (int i = 1; i<=num; i++) {
            if (num % i == 0) {
                count = count + 1;
                }
            }
        if (count == 2) {
            System.out.println("Number is prime number");
            }
        else {
            System.out.println("Number is not prime number");
            }
        }
    }
