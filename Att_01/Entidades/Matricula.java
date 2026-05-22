package Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_01.Entidades;

public class Matricula {

    private String numeroMatricula;
    private int multas;

    public Matricula(String numeroMatricula, int multas){
        this.numeroMatricula=numeroMatricula;
        this.multas=multas;
    }
    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
    public String getNumeroMatricula() {
        return numeroMatricula;
    }
    public void setMultas(int multas) {
        this.multas = multas;
    }
    public int getMultas() {
        return multas;
    }
}
