package com.tp.western.model;

public class Indien extends Humain{
    private int nombrePlumes;
    private String totem;


    public Indien(String nom) {
        super(nom);
        this.boissonFavori = "jus de racine";
        this.totem = "Coyote";
    }
    @Override
    public void parler (String text) {
        System.out.println(this.getNom() + " - " + text+ " Ugh ! et j'ai "+this.nombrePlumes +" plume(s)" );
    }

    public void scalper (Humain humain){
        nombrePlumes++;
    }
}
