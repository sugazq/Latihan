import java.util.Scanner;

public class Bola{
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Masukan nominal jari-jari angka: ");
            int jari = scanner.nextInt();
            double pangkat = Math.pow(jari, 3);
            double volume = 4.0/3.0*Math.PI*pangkat;
            System.out.println("Jadi total volume bola adalah: " + volume);
        }
    }
}