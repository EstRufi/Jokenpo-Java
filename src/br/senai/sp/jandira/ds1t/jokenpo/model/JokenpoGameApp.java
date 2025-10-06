package br.senai.sp.jandira.ds1t.jokenpo.model;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class JokenpoGameApp {
    String nomeDoAdiversario;
    int escolhaDoAdiversario;

    public void receberDadosDoOponente(){
    Scanner leitor = new Scanner(System.in);

    System.out.print("Meu caro oponente me diga seu nome por favor:");
    nomeDoAdiversario = leitor.nextLine();

    System.out.println("-----------------------------------------------------------------");
    System.out.println("Beleza " + nomeDoAdiversario + " vamos começar a jogar JOKENPÔ");
    System.out.println("-----------------------------------------------------------------");
    System.out.println("Das seguintes opções abaixo qual você vai escolher?");
    System.out.println("(1) Pedra");
    System.out.println("(2) Papel");
    System.out.println("(3) Tesoura");
    System.out.println("-----------------------------------------------------------------");
    System.out.print("Qual desas opções você vai escolher "+ nomeDoAdiversario + "?");
    escolhaDoAdiversario = leitor.nextInt();
    }
}
