package br.senai.sp.jandira.ds1t.jokenpo.model;
import java.util.Random;
import java.util.Scanner;

public class JokenpoGameApp {
    String nomeDoAdiversario;
    int escolhaDoAdiversario;
    int escolhaDoComputador;
    String situasao;

    Scanner leitor = new Scanner(System.in);

    public void receberDadosDoOponente() {

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
        System.out.print("Qual desas opções você vai escolher " + nomeDoAdiversario + "?");
        escolhaDoAdiversario = leitor.nextInt();

        fazerRadom();
    }

    public void fazerRadom() {
        Random random = new Random();

        escolhaDoComputador = random.nextInt(3 + 1);

        ganhadorDoJokenpo();
    }

    public void ganhadorDoJokenpo() {
        if (escolhaDoAdiversario == 1 && escolhaDoComputador == 2) {
            situasao = "HAHA PERDEDOR, VOCÊ PERDEU OTARIO(A)";
        } else if (escolhaDoAdiversario == 2 && escolhaDoComputador == 3) {
            situasao = "HAHA PERDEDOR, VOCÊ PERDEU OTARIO(A)";
        } else if (escolhaDoAdiversario == 3 && escolhaDoComputador == 1) {
            situasao = "HAHA PERDEDOR, VOCÊ PERDEU OTARIO(A)";
        } else if (escolhaDoAdiversario == 2 && escolhaDoComputador == 1) {
            situasao = "NÃO ACREDITO COMO EU PERDI? VOCÊ GANHOU \uD83D\uDE21";
        } else if (escolhaDoAdiversario == 3 && escolhaDoComputador == 2) {
            situasao = "NÃO ACREDITO COMO EU PERDI? VOCÊ GANHOU \uD83D\uDE21";
        } else {
            situasao = "EITA DEU EMPATE";
        }
        mostrarResultados();
    }

    public void mostrarResultados() {

        System.out.println("------------------------------------------");
        System.out.println("Vamos lá ver quem é o campeão de JOKENPO");
        System.out.println("------------------------------------------");

        System.out.println(nomeDoAdiversario + " você escolheu " + escolhaDoAdiversario);
        System.out.println("Eu Escolhi " + escolhaDoComputador);
        System.out.println(situasao);

        System.out.println("------------------------------------------");
        System.out.print("Gostaria de jogar novamente S/N?");

    }
}
