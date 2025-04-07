package application;

import services.AparelhoTelefonico;
import services.Iphone;
import services.NavegadorInternet;
import services.ReprodutorMusical;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    while(true){
    AparelhoTelefonico meuIphone = new Iphone();
    NavegadorInternet meuIphone2 = new Iphone();
    ReprodutorMusical meuIphone3 = new Iphone();

    System.out.println("=================================");
    System.out.println("Qual serviço deseja utilizar? ");
    System.out.println("Aparelho telefonico - 1");
    System.out.println("Reprodutor Musical - 2");
    System.out.println("Navegador Internet - 3");
    System.out.println("Desligar iphone - 4");
    System.out.println("================================");
    int resp = sc.nextInt();
    if (resp == 1){
        createdAparelhoTelefonico(meuIphone);
    }
    else if (resp == 2){
        createdReprodutorMusical(meuIphone3);
    }
    else if(resp == 3){
        createdNavegadorInternet(meuIphone2);
    }
    else if(resp == 4){
        System.out.println("Desligando o iPhone");
        break;
    }
}

    }
    public static Iphone createdAparelhoTelefonico(AparelhoTelefonico aparelhoTelefonico){
        System.out.println("Deseja continuar no serviço? ");
        char resp3 = sc.next().charAt(0);

        while(resp3 == 's'){

            System.out.println("Para quem deseja fazer uma chamada? ");
            String numero = sc.next();
            System.out.println("Ligando para: ");
            aparelhoTelefonico.ligar(numero);
            System.out.println("Alguém esta te ligando atender? (1 - sim / 2 - nao)");
            int resp = sc.nextInt();

            if (resp == 1) {
                aparelhoTelefonico.atender();
            } else if (resp == 2) {
                System.out.println("Desligando telefone");
            }

            System.out.println("Iniciar um correio de voz? (1 - sim / 2 - nao)");

            int resp2 = sc.nextInt();
            if (resp2 == 1) {
                aparelhoTelefonico.iniciarCoreioVoz();
                System.out.println("Correio de voz terminou");
            } else if (resp2 == 2) {
                System.out.println("Não iniciado");
            }
            System.out.println("Quer continuar no serviço? ");
            resp3 = sc.next().charAt(0);
        }
        return new Iphone();
    }
    public static Iphone createdReprodutorMusical(ReprodutorMusical reprodutorMusical){
        System.out.println("Deseja continuar no serviço? ");
        char resp3 = sc.next().charAt(0);

        while(resp3 == 's') {
            System.out.println("Qual musica você quer ouvir? ");
            String musica = sc.next();

            reprodutorMusical.selecionarMusica(musica);
            reprodutorMusical.tocar();

            System.out.println("====Reproduzindo Musica====");
            System.out.println("Deseja pausar a musica?(s/n)");

            char resp = sc.next().charAt(0);

            if (resp == 's') {
                reprodutorMusical.pausar();
            } else {
                reprodutorMusical.tocar();
            }
            System.out.println("Quer continuar no serviço? ");
            resp3 = sc.next().charAt(0);
        }
        return new Iphone();
    }
    public static Iphone createdNavegadorInternet(NavegadorInternet navegadorInternet){
        System.out.println("Deseja continuar no serviço? ");
        char resp3 = sc.next().charAt(0);

        while(resp3 == 's') {
            System.out.println("Navegador Safari");
            System.out.println("Digite o site que deseja visitar: ");

            String url = sc.next();
            System.out.println("Atualizando a página ");
            navegadorInternet.atualizarPaginas();
            navegadorInternet.exibirPaginas(url);
            navegadorInternet.atualizarPaginas();

            System.out.println("Trocar de página? (s/n) ");
            char resp = sc.next().charAt(0);
            if (resp == 's') {

                System.out.println("Qual site voce deseja visitar agora?");
                String url2 = sc.next();
                navegadorInternet.adcionarNovaAba();
                System.out.println("===========================");
                System.out.println("Voce está no site: ");
                navegadorInternet.exibirPaginas(url2);
            } else {
                System.out.println("Obrigada por visitar nossa página");
            }
            System.out.println("Quer continuar no serviço? ");
            resp3 = sc.next().charAt(0);
        }
        return new Iphone();
    }
}
