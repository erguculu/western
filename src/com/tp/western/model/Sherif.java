package com.tp.western.model;

public class Sherif extends Cowboy{
   private String title;
    public Sherif(String nom) {
        super(nom);
        this.title = "Sherif";
    }

    @Override
    public void sePresenter(){
        this.parler("Bonjour je suis "+title+ " "+getNom()+ " et j'aime "+ getBoissonFavori());
    }

    public void annonce(){
        System.out.println("("+getNom()+") - "+"OYEZ OYEZ BRAVE GENS !! 5000 $ à qui arretera Shekay le mechant mort ou vif !!");
    }

    public void demander (String text){
        System.out.println( "("+getNom()+") - "+text);
    }

    public void cofrer (Brigand brigand) {
        this.parler("Au nom de la loi, je  t'arrête !!");
        brigand.emprisonner(this);
    }
}
