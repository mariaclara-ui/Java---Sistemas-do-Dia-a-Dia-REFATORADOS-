package Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_02.Entidades;

import java.util.Scanner;


public class Compra {
    Scanner sc = new Scanner(System.in);

    private String adicionar;
    private double valor;
    private double total;
    private double frete;
    private String forma_pagamento;
    private String pagamento_aceito;
    private int cod_pedido;
    private String confirmacao_compra;

    public Compra(String adicionar,double valor,double total,double frete,String forma_pagamento,String pagamento_aceito,int cod_pedido,String confirmacao_compra){
        this.valor=valor;
        this.adicionar=adicionar;
        this.total=total;
        this.frete=frete;
        this.forma_pagamento=forma_pagamento;
        this.pagamento_aceito=pagamento_aceito;
        this.cod_pedido=cod_pedido;
        this.confirmacao_compra=confirmacao_compra;
    }
    public String getAdicionar() {
        return adicionar;
    }
    public void setAdicionar(String adicionar) {
        this.adicionar = adicionar;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public double getFrete() {
        return frete;
    }
    public void setFrete(double frete) {
        this.frete = frete;
    }
    public String getForma_pagamento() {
        return forma_pagamento;
    }
    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }
    public String getPagamento_aceito() {
        return pagamento_aceito;
    }
    public void setPagamento_aceito(String pagamento_aceito) {
        this.pagamento_aceito = pagamento_aceito;
    }
    public int getCod_pedido() {
        return cod_pedido;
    }
    public void setCod_pedido(int cod_pedido) {
        this.cod_pedido = cod_pedido;
    }
    public String getConfirmacao_compra() {
        return confirmacao_compra;
    }
    public void setConfirmacao_compra(String confirmacao_compra) {
        this.confirmacao_compra = confirmacao_compra;
    }
    public void adicinoraitem() {
        do {
            System.out.println("Deseja colocar itens no carrinho?");
            adicionar = sc.nextLine();


            if (adicionar.equalsIgnoreCase("Sim")) {

                System.out.println("Digite o valor do item:");
                valor = sc.nextDouble();

                total += valor;

                sc.nextLine();
            }

        } while (adicionar.equalsIgnoreCase("Sim"));
        System.out.println("O valor total da compra será de " + total);

        System.out.println("O pagamento foi concluido?");
        pagamento_aceito=sc.nextLine();
       if (pagamento_aceito.equalsIgnoreCase("sim")){
           System.out.println("Pagamento concluido.");

       }else {
           System.out.println("Erro em finalizar a compra.");
           System.exit(0);
       }
    }
    public void calcularfrete(){
        if (total>500){
        System.out.println("Frte grátis.");
    }
        else {
            frete = total + 25.00;
            System.out.println("O valor atualizado da compra será: " + frete);
        }
    }
}


