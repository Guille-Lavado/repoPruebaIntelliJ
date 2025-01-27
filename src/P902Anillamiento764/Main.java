package P902Anillamiento764;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        int nVueltas = tcl.nextInt();
        tcl.nextLine();

        while (nVueltas != 0){
            int resultado = 0;

            for (int i = 0; i < nVueltas; i++) {
                String entrada = tcl.nextLine();

                String[] entradaArry = entrada.split(" ");

                int n1 = Integer.parseInt(entradaArry[0]);
                int n2 = Integer.parseInt(entradaArry[1]);

                resultado += n1 - n2;
            }

            System.out.println(resultado);

            nVueltas = tcl.nextInt();
            tcl.nextLine();
        }
    }
}
