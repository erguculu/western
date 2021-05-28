package com.tp.western;

public class Barman extends Humain{
    private String nomDeBar;
    public Barman(String nom) {
        super(nom);
        this.boissonFavori = "Vin";
        this.nomDeBar = "Chez"+getNom();
    }

    @Override
    public void sePresenter(){
        System.out.println("("+getNom()+") - "+"Bienvenue Chez " +getNom()+ " Coco !");
    }

    public void servir (Humain humain){
        System.out.println(getNom()+" Sert un verre de "+humain.getBoissonFavori()+" à "+humain.getNom());
    }
}
