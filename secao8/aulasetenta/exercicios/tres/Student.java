package secao8.aulasetenta.exercicios.tres;

public class Student {
    String nome;
    double nota1, nota2, nota3;

    public double notaFinal(){
        return nota1 + nota2 + nota3;
    }

    public boolean aprovedOrNot(double notaFinal){
        if(notaFinal >= 60.00){
            return true;
        } else {
            return false;
        }
    }

}
