package secao15.aula178.Classes;

public class ExecptionDeConta extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ExecptionDeConta(String msg){
        super(msg);
    }
}
