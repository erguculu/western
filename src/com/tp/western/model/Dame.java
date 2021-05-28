package com.tp.western.model;

public class Dame extends Humain{

    private String couleurDeRobe;
    private boolean isCaptive;

    public Dame(String nom) {
        super(nom);
        this.boissonFavori = "lait" ;
    }

    @Override
    public void sePresenter(){
        this.parler("Bonjour je suis Miss " +getNom()+ " et j'aime "+ getBoissonFavori());
    }

    public void seFaireKidnapper () {
        this.isCaptive = true;
        System.out.println("("+getNom()+") - "+"A l'aide je suis kidnappe");
    }

    public void seFaireLiberer () {
        this.isCaptive = false;
        this.parler("Merci mon héro");

    }

    public void changerDeRobe (String couleurDeRobe) {
        this.couleurDeRobe = couleurDeRobe;
        this.parler("Regardez ma nouvelle robe "+this.couleurDeRobe+" !");
    }
    public String getNom(){
        return "Miss "+super.getNom();
    }
}
