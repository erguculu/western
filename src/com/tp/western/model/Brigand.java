package com.tp.western.model;

public class Brigand extends Humain implements HorLaLoi {
    private String look;
    private int nbDameEnleve;
    private int recompenseOfferte;
    private boolean enPrison;

    public Brigand(String nom) {
        super(nom);
        this.look = "le méchant";
        this.nbDameEnleve = 0;
        this.recompenseOfferte = 100;
        this.boissonFavori = "Tord boyaux" ;

    }

    @Override
    public void kidnapper (Dame dame) {
        this.parler("Ah ah ! "+dame.getNom() +" tu es mienne désormais !");
        dame.seFaireKidnapper();
        this.nbDameEnleve++;
    }

    @Override
    public void sePresenter(){
        this.parler("Bonjour je suis " +getNom()+ " et j'aime "+ getBoissonFavori());
        this.parler("J’ai l’air méchant et j’ai déjà kidnappé "+nbDameEnleve +" dames !" );
        this.parler("Ma tête est mise à "+this.getMisAPrix() +" $ !");

    }

    @Override
    public int getMisAPrix() {

        return misAPrix();
    }

    public void emprisonner (Cowboy cowboy){
        this.parler("Damned, je suis fait ! Sherif "+cowboy.getNom() +" tu m’as eu !" );
        this.enPrison = true;
    }

    public int misAPrix () {
        return this.nbDameEnleve * this.recompenseOfferte;
    }

    @Override
    public void emprisonne() {

    }

    public String getNom(){
        return super.getNom()+ " "+this.look ;
    }
}
