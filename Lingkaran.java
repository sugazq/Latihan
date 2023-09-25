public class Lingkaran {
    public static void main(String[] args) {
        int jariJari = 4;
        double luas = Math.PI * jariJari * jariJari;
        double keliling = 2 * Math.PI * jariJari;

        System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " adalah " + luas);
        System.out.println("Keliling lingkaran dengan jari-jari " + jariJari + " adalah " + keliling);
    }
}
