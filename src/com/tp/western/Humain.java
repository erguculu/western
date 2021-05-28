package com.tp.western;

public class Humain {

    private String nom;
    protected String boissonFavori;
    String title;

    public Humain(String nom) {
        this.nom = nom;
        this.boissonFavori = "de l'eau" ;
        this.title = "Humain";
    }

    public void parler (String text){
        System.out.println(this.nom +" "+text);
    }

    public void sePresenter() {
        System.out.println("Bonjour je suis " +this.nom+ " et j'aime "+ this.boissonFavori);
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
}
