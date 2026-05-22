package Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_03.Aplicativo;
import Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_03.Entidades.Clinica;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite o seu CPF:");
        String cpf = sc.nextLine();

        System.out.println("Qual a especialidade desejada?");
        String especialidade = sc.nextLine();

        System.out.println("Horários disponíveis: 13:00 16:00 20:00");
        System.out.println("Digite o horário escolhido:");
        String horario = sc.nextLine();

        System.out.println("Deseja confirmar a consulta?");
        String consulta = sc.nextLine();

        Clinica clinica = new Clinica(nome, cpf, especialidade, horario, consulta);

        ArrayList<String> cpfsCadastrados = new ArrayList<>();

        cpfsCadastrados.add("15003557639");
        cpfsCadastrados.add("01973839636");

        if (cpfsCadastrados.contains(clinica.getCpf())) {

            System.out.println("Paciente cadastrado");

        } else {

            System.out.println("Paciente não cadastrado");
        }

        if (clinica.getHorario().equals("13:00") ||
                clinica.getHorario().equals("16:00") ||
                clinica.getHorario().equals("20:00")) {

            System.out.println("Horário disponível");

        } else {

            System.out.println("Horário indisponível");
        }

        if (clinica.getConsulta().equalsIgnoreCase("sim")) {

            System.out.println("Consulta confirmada");

        } else {

            System.out.println("Atendimento encerrado");
        }
    }
}