import  java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Flota {
    protected Nava[] nave;
    protected int nrNave;

    public Flota() {
        nave=new Nava[10];
        nrNave=0;
    }

    @Override
    public String toString() {
        String text="";
        for (int i=0;i<nrNave;i++)
            text=text+String.valueOf(i+1)+"."+nave[i].toString();
        return "Flota:\n" +text;
    }
    public void adaugaNava(Nava x) {
        if (nrNave >= nave.length) {
            nave = Arrays.copyOf(nave, nave.length * 2);
        }
        nave[nrNave++] = x;
    }

    public Flota(String numeFisier) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(numeFisier));
        int numarNave = sc.nextInt();
        sc.nextLine();
        nave = new Nava[numarNave];
        this.nrNave = 0;

        while (sc.hasNextLine()) {
            String linie = sc.nextLine();
            String[] info = linie.split(", ");
            String nume = info[0];
            String pavilion = info[1];
            String tip = info[2];

            switch (tip) {
                case "NavaCroaziera":
                    adaugaNava(new NavaCroaziera(Integer.parseInt(info[3]), nume, pavilion));
                    break;
                case "Cargo":
                    adaugaNava(new Cargo( Integer.parseInt(info[3]),nume, pavilion));
                    break;
                case "Feribot":
                    adaugaNava(new Feribot(Integer.parseInt(info[3]), nume, pavilion, Integer.parseInt(info[4])));
                    break;
            }
        }
        sc.close();
    }


    public Nava[] getNave() {
        return nave;
    }
    public void utilizare() {
        System.out.println("Utilizare flota:");
        for (int i = 0; i < nrNave; i++) {
            System.out.print(nave[i].nume + " - ");
            nave[i].utilizare();
        }
    }
}
