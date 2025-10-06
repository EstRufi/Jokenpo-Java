package br.senai.sp.jandira.ds1t.jokenpo;
import br.senai.sp.jandira.ds1t.jokenpo.model.JokenpoGameApp;

public class JokenpoGame {
    public static void main(String[] args) {

            System.out.println("----------------------------------------");
            System.out.println("Preparado para perder *engasgando* quer dizer jogar Jokenpo?");
            System.out.println("----------------------------------------");

            JokenpoGameApp jogandoJokenpo = new JokenpoGameApp();
            jogandoJokenpo.receberDadosDoOponente();
    }

}