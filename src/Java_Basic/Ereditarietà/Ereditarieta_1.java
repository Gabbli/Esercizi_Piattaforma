package Java_Basic.Ereditarietà;
/*
Scrivere un programma che contenga una classe chiamata Animale ed un metodo chiamato faiIlVerso() che stampi il verso dell'animale.
Crea poi una sottoclasse chiamata Gatto che fa override del metodo faiIlVerso() per miagolare.
Prova quindi a far stampare il verso di Animale e di Gatto.
 */
public class Ereditarieta_1 {
    public static void main(String[] args) {

        Animale animale = new Animale();
        Gatto gatto = new Gatto();

        System.out.println("L'animale: "+ animale.faiIlVerso());
        System.out.println("Il gatto: "+ gatto.faiIlVerso());

    }
}
