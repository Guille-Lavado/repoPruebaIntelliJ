package E901CasasColgadas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        int nVueltas = tcl.nextInt();
        tcl.nextLine();

        for (int i = 0; i < nVueltas; i++) {
            String palabraEntrada = tcl.nextLine();

            if (palabraEntrada.equalsIgnoreCase("colgadas")) {
                System.out.println("Bien");
            } else {
                System.out.println("Mal");
            }
        }
    }
}
