package Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_01.Aplicativo;

import Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_01.Entidades.Biblioteca;
import Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_01.Entidades.Matricula;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        Matricula matricula=new Matricula("", 0);
        Biblioteca biblioteca = new Biblioteca(0,"","");
        /*Perguntar pro professor se eu não estou conseguindo usar Biblioteca biblioteca = new Biblioteca(livros, Cod_livro, emprestimo);
        pelo scanner estar depois e nao antes do construtor
         */
        System.out.println("Digite o número da sua matricula");
        matricula.setNumeroMatricula(sc.nextLine());
        if (matricula.getNumeroMatricula() != null){
            System.out.println("Quantas multas estão pendentes?");
            matricula.setMultas(sc.nextInt());
            if (matricula.getMultas() ==0){
                System.out.println("Não há multas pendentes.");

            }
            else {
                System.out.println("Você tem "+matricula.getMultas()+"multas pendentes.");
                System.out.println("Empréstimo bloqueado por multas.");
            }
            System.out.println("Digite qual e a quantidade de livros possuidos:");
            biblioteca.setLivros(sc.nextInt());
            if (biblioteca.getLivros() >= 3){
                System.out.println("Limite de empréstimo atingido");
            }
            else {
                System.out.println("Você está liberado para escolher seu livro.");
            }
            if (matricula.getMultas() ==0 && biblioteca.getLivros() <=3){
                System.out.println("Digite o codigo do livro");
                biblioteca.setCod_livro(sc.nextLine());

                if (biblioteca.getCod_livro() != null){
                    System.out.println("Livro disponível.");
                    System.out.println("Deseja concluir o empréstimo?");
                    biblioteca.setEmprestimo(sc.nextLine());

                    if (biblioteca.getEmprestimo().equalsIgnoreCase("Sim")){
                        System.out.println("Empréstimo realizado com sucesso.");
                    }
                    else if (biblioteca.getEmprestimo().equalsIgnoreCase("Não")){
                        System.out.println("Empréstimo inválido.");
                    }
                    else {
                        System.out.println("ERRO");
                    }
                }
                else {
                    System.out.println("Livro indisponível");
                }
            }
        }
        else {
            System.out.println("Aluno não encontrado.");
        }
    }
}