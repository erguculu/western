package com.tp.western;

public class Sherif extends Cowboy{
    String title;
    public Sherif(String nom) {
        super(nom);
        this.title = "Sherif";
    }

    @Override
    public void sePresenter(){
        System.out.println("("+getNom()+") - "+"Bonjour je suis "+title+ " "+getNom()+ " et j'aime "+ getBoissonFavori());
    }

    public void annonce(){
        System.out.println("("+getNom()+") - "+"OYEZ OYEZ BRAVE GENS !! 5000 $ à qui arretera Shekay le mechant mort ou vif !!");
    }

    @Override
    public void parler (String text){
        System.out.println( "("+getNom()+") - "+text);
    }

    public void cofrer () {
        System.out.println("("+getNom()+") - "+"Au nom de la loi, je vous arrête !!");
    }
}
