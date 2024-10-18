import java.io.FileNotFoundException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Flota flota1= new Flota();
        NavaCroaziera sv = new NavaCroaziera(1000, "Suceava", "RO");
        System.out.print(sv + "\nUtilizare:");
        sv.utilizare();
        System.out.println();
        flota1.adaugaNava( sv);
        flota1.adaugaNava(new NavaCroaziera(5000, "Victoria", "RO"));
        System.out.println(flota1);
        flota1.utilizare();
        Flota flota2 = new Flota("flota.txt");
        System.out.println(flota2);
        flota2.utilizare();
    }
}