package com.tp.western;

public class Brigand extends Humain implements HorLaLoi {
    private String type;
    private int nbDameEnleve;
    private boolean enPrison;

    public Brigand(String nom, int nbDameEnleve) {
        super(nom);
        this.boissonFavori = "tord-boyaux";
        this.type = "Méchant";
        this.nbDameEnleve = nbDameEnleve;
        this.title = "le méchant";

    }

    @Override
    public void sePresenter(){
        System.out.println("("+getNom()+") - "+"Bonjour je suis " +getNom()+ " et j'aime "+ getBoissonFavori());
        System.out.println("("+getNom()+") - "+"J’ai l’air méchant et j’ai déejà kidnappé "+nbDameEnleve +"dames !" );
        System.out.println("("+getNom()+") - "+"Ma tête est mise à prix 100 $ !");

    }

    @Override
    public void parler (String text){
        System.out.println( "("+getNom()+") - "+text);
    }

    @Override
    public int getMisAPrix() {
        return misAPrix();
    }

    @Override
    public void kidnapper (Dame dame) {
        System.out.println("("+getNom()+") - "+"Ah ah ! "+dame.getNom() +" tu es mienne désormais !");
    }

    public void emprisonner (Cowboy cowboy){
        System.out.println("("+getNom()+") - "+"Damned, je suis fait ! Sherif "+cowboy.getNom() +" tu m’as eu !" );
    }

    public int misAPrix () {
        return 100 ;
    }

    @Override
    public void emprisonne() {

    }
}
