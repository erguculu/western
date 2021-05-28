package com.tp.western.model;

public class Barman extends Humain {
    private String nomDeBar;
    public Barman(String nom) {
        super(nom);
        this.nomDeBar = "Chez"+getNom();
        this.boissonFavori = "Vin" ;
    }

    @Override
    public void sePresenter(){
        this.parler("Bienvenue Chez " +getNom()+ " Coco !");
    }

    public void servir (Humain humain){
        System.out.println(getNom()+" Sert un verre de "+humain.getBoissonFavori()+" à "+humain.getNom());
    }
}
