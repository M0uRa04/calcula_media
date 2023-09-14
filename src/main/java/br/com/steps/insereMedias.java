package br.com.steps;

import java.util.Scanner;

public class insereMedias {

    private double notaPortugues;
    private double notaMatematica;
    private double notaIngles;
    private double notaCiencias;

    private double media = calculaMedia();

    public double getNotaPortugues() {
        return notaPortugues;
    }

    public void setNotaPortugues(double notaPortugues) {
        this.notaPortugues = notaPortugues;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaIngles() {
        return notaIngles;
    }

    public void setNotaIngles(double notaIngles) {
        this.notaIngles = notaIngles;
    }

    public double getNotaCiencias() {
        return notaCiencias;
    }

    public void setNotaCiencias(double notaCiencias) {
        this.notaCiencias = notaCiencias;
    }

    Scanner teclado = new Scanner(System.in);
    public void menu(){
        System.out.println("-------------------------------");
        System.out.println("**** Menu Escolar ****");
        System.out.println("Seja bem vindo professor(a), você é um orgulho para o Brasil!!");
        System.out.println("Começando com o cálculo de notas...");
    }

    public void recebeNotas(){
        System.out.println("Por favor preencha as notas: ");

        System.out.println("Português: ");
        this.notaPortugues = teclado.nextDouble();

        System.out.println("Matemática: ");
        this.notaMatematica = teclado.nextDouble();

        System.out.println("Ciências: ");
        this.notaCiencias = teclado.nextDouble();

        System.out.println("Inglês: ");
        this.notaIngles = teclado.nextDouble();

        System.out.println("-------------------------------");

    }

    public double calculaMedia(){
        System.out.println("-------------------------------");
        System.out.println("Iniciando o Calculo de médias...");
        this.media = (getNotaIngles() + getNotaCiencias() + getNotaPortugues() + getNotaMatematica()) / 4;
        System.out.println("A media foi: " + media);
        System.out.println("-------------------------------");
        return media;
    }

    public void status(){
        if(this.media < 5){
            System.out.println("O aluno teve a média total de: " + this.media + " e foi reprovado!");
        } else {
            System.out.println("O aluno teve a média total de: " + this.media + " e foi aprovado!");
        }

    }

}
