package Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_01.Entidades;

public class Biblioteca {
    private int livros;
    private String Cod_livro;
    private String emprestimo;

    public Biblioteca (int livros, String Cod_livro, String emprestimo){
        this.livros=livros;
        this.Cod_livro=Cod_livro;
        this.emprestimo=emprestimo;
    }
    public void setLivros(int livros){
        this.livros=livros;
    }
    public int getLivros(){
        return livros;
    }
    public void setCod_livro(String Cod_livro){
        this.Cod_livro=Cod_livro;
    }
    public String getCod_livro() {
        return Cod_livro;
    }
    public void setEmprestimo(String emprestimo) {
        this.emprestimo = emprestimo;
    }
    public String getEmprestimo(){
        return emprestimo;
    }
}

