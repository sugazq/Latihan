import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Celcius yang diinginkan : ");
        int celcius = scanner.nextInt();
        int fahrenheit = (celcius * 9/5) + 32;
        System.out.println(celcius + " Celcius sama dengan " + fahrenheit + " Fahrenheit");

    }
}
 