package com.tp.western.model;

public class Humain implements VisagePale{

    private String nom;
    protected String boissonFavori;

    public Humain(String nom) {
        this.nom = nom;
        this.boissonFavori = "l'eau" ;
    }

    public void parler (String text){
        System.out.println(this.nom +" - "+text);
    }

    public void sePresenter() {
        this.parler("Bonjour je suis " +this.getNom()+ " et j'aime "+ this.getBoissonFavori());
    }

    public void boire (){
        System.out.println("Ah ! un bon verre de " + this.boissonFavori+ " ! GLOUPS !”");
    }

    public String getNom(){
        return nom;
    }
    public String getBoissonFavori(){
        return boissonFavori;
    }

    @Override
    public void seFareScalper() {
        this.parler("Aïe ma te^te !.");
    }
}
