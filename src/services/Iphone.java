package services;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    public Iphone(){
        
    }

    @Override
    public void ligar(String numero) {
        System.out.println(numero);
    }

    @Override
    public void atender() {
        if (true){
            System.out.println("Atendendo o telefone!");
        }
       else {
            System.out.println("Não atender o telefone");
        }
    }
    @Override
    public void iniciarCoreioVoz() {

        System.out.println("Iniciando o correio de voz...");
    }

    @Override
    public void exibirPaginas(String url) {

        System.out.println("www."+url+".com");
    }

    @Override
    public void adcionarNovaAba() {

        System.out.println("Adcionando NovaPágina");
    }

    @Override
    public void atualizarPaginas() {
        System.out.println("Loading...");
        System.out.println("Pagina atualizada: ");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a musica!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica: "+ musica);
    }
}
