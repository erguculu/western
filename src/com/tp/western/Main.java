package com.tp.western;

import com.tp.western.model.*;

public class Main {

    public static void main(String[] args) {


        Dame fleur = new Dame("Fleur");

        Brigand bob = new Brigand("Bob");
        Cowboy clint = new Sherif("Clint");
        Barman michel = new Barman("Michel");

//        fleur.sePresenter();
//          bob.kidnapper(fleur);
//        fleur.seFaireKidnapper();

//        clint.sePresenter();
//        michel.sePresenter();
//        clint.parler("Barman ! une verre ! ");
//        michel.servir(clint);
//        bob.parler("Barman ! une verre ! ");
//        michel.servir(bob);
//        ((Sherif) clint).cofrer(bob);
//        clint.liberer();
//       fleur.seFaireLiberer();

        Ripoux mike = new Ripoux("Mike");
        mike.kidnapper(fleur);
        mike.kidnapper(fleur);

        mike.sePresenter();
        FemmeBrigand calamity = new FemmeBrigand("Calamity Jane");
        calamity.kidnapper(fleur);
        calamity.sePresenter();

        Indien ugh = new Indien("Ugh");
        ugh.scalper(fleur);
        ugh.sePresenter();

    }
}
