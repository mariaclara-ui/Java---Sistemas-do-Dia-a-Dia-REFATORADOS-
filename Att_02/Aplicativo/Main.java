package Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_02.Aplicativo;

import Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_02.Entidades.Cliente;
import Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_02.Entidades.Compra;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        Cliente cliente = new Cliente("","","","",0);
        Compra compra= new Compra("", 0, 0, 0, "", "", 0, "");
        /*ainda nao entendi o que está dando errado aqui*/
        /*o que eu faço com os que nao foram mencionados no main?*/
        Random random=new Random();

        System.out.println("Qual e a forma de pagamento?");
        compra.setForma_pagamento(sc.nextLine());

        System.out.println("Digite seu nome:");
        cliente.setNome(sc.nextLine());

        System.out.println("Digite seu CPF:");
        cliente.setCPF(sc.nextLine());

        System.out.println("Digite sua rua:");
        cliente.setRua(sc.nextLine());

        System.out.println("Digite seu bairro:");
        cliente.setBairro(sc.nextLine());

        System.out.println("Digite o número da sua casa:");
        cliente.setNumero_Casa(sc.nextInt());
        sc.nextLine();

        compra.adicinoraitem();

        compra.calcularfrete();

        if (compra.getPagamento_aceito().equalsIgnoreCase("Sim")){
            compra.setCod_pedido(random.nextInt(1000));

            System.out.println("O código do pegido será: "+compra.getCod_pedido());
            System.out.println("Deseja concluir essa compra?");
            compra.setConfirmacao_compra(sc.nextLine());

            if (compra.getConfirmacao_compra().equalsIgnoreCase("Sim")){
                System.out.println("Compra realizada com sucesso.");
            }
            else {
                System.out.println("Compra cancelada.");
            }
        }
        else {
            System.out.println("Pagamento não autorizado.");
        }
    }
}
