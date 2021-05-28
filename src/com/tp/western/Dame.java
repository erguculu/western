package com.tp.western;

public class Dame extends Humain{
    private String coleurDeRobe;
    private boolean libre = true;
    public Dame(String nom, String coleurDeRobe) {
        super(nom);
        this.boissonFavori = "lait";
        this.coleurDeRobe = coleurDeRobe;
    }

    @Override
    public void sePresenter(){
        System.out.println("("+getNom()+") - "+"Bonjour je suis Miss " +getNom()+ " et j'aime "+ getBoissonFavori());
    }

    public void seFaireKidnapper () {
        System.out.println("("+getNom()+") - "+"A l'aide je suis kidnappe");
    }

    public void seFaireLiberer () {
        System.out.println("("+getNom()+") - "+"Je vous remercie Regardez ma nouvelle robe "+this.coleurDeRobe+" !");
    }
}
