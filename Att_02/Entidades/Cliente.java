package Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_02.Entidades;

public class Cliente {
    private String nome;
    private String CPF;
    private String rua;
    private String bairro;
    private int numero_Casa;

    public Cliente(String nome,String CPF,String rua,String bairro,int numero_Casa){
        this.nome=nome;
        this.CPF=CPF;
        this.rua=rua;
        this.bairro=bairro;
        this.numero_Casa=numero_Casa;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public int getNumero_Casa() {
        return numero_Casa;
    }
    public void setNumero_Casa(int numero_Casa) {
        this.numero_Casa = numero_Casa;
    }
}
