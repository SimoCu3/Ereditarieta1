/*
Scrivere un programma che contenga una classe chiamata Animale ed un metodo chiamato faiIlVerso() che stampi il verso dell'animale.
Crea poi una sottoclasse chiamata Gatto che fa override del metodo faiIlVerso() per miagolare.
Prova quindi a far stampare il verso di Animale e di Gatto.
*/

public class Ereditarietà1 {
    public static void main(String[] args) {

        Animale animale = new Animale();
        Gatto gatto = new Gatto();
        Cane cane = new Cane();

        animale.faiIlVerso();

        System.out.println("");
        gatto.faiIlVerso();
        System.out.println("");
        cane.faiIlVerso();

    }

}

/*
CORREZIONE:

*/