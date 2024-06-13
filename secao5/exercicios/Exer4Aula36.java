package secao5.exercicios;
import java.util.Scanner;

public class Exer4Aula36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, diferenca;
        
        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
			diferenca = horaFinal - horaInicial;
		} else {
            diferenca = 24 - horaInicial + horaFinal;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", diferenca);

        sc.close();
    }
}
