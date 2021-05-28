package com.tp.western;

public class Main {

    public static void main(String[] args) {


        Dame fleur = new Dame("Fleur",  "Rouge");

        Brigand bob = new Brigand("Bob",1);
        Cowboy clint = new Sherif("Clint");
        Barman michel = new Barman("Michel");

        fleur.sePresenter();
        bob.kidnapper(fleur);
        fleur.seFaireKidnapper();
        bob.sePresenter();
        clint.sePresenter();
        michel.sePresenter();
        clint.parler("Barman ! une verre ! ");
        michel.servir(clint);
        bob.parler("Barman ! une verre ! ");
        michel.servir(bob);
        clint.tirer(clint,bob);



        ((Sherif) clint).cofrer();
        bob.emprisonner(clint);
        clint.liberer();
       fleur.seFaireLiberer();
    }
}
