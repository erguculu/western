package com.tp.western;

public class Cowboy extends Humain {
    int popularite = 0;
    String type;
    public Cowboy(String nom) {
        super(nom);
        this.boissonFavori = "Whisky";
        this.type = "Vaillant";
    }

    public void tirer (Cowboy cowboy, Brigand brigand){
        System.out.println(cowboy.type +" "+cowboy.getNom()+" tire sur "+ brigand.getNom()+ "méchant). PAN ! ");
        System.out.println("("+getNom()+") - Prend ca, ¸ rascal !");
    }

    public void liberer () {
        System.out.println("("+getNom()+") - "+"Je vous liber cher madame");
    }

}
