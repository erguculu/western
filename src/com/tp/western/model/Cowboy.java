package com.tp.western.model;

public class Cowboy extends Humain {
    int popularite;
    private String type;
    public Cowboy(String nom) {
        super(nom);
        this.popularite =0;
        this.type = "Vaillant";
        this.boissonFavori = "Whisky" ;
    }

    public void tirer ( Brigand brigand){
        System.out.println("Le "+ this.type +" "+this.getNom()+" tire sur "+ brigand.getNom()+ " le méchant). PAN ! ");
        this.parler("Prend ca, rascal !");

    }

    public void liberer () {
        this.popularite++;
        this.parler("Vous êtes liberée cher madame");
    }

}
