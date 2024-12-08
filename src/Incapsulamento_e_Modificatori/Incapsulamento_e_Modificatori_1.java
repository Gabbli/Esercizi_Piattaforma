package Incapsulamento_e_Modificatori;

import Gli_Oggetti_Il_Costruttore_Getter_e_Setter.Auto_2;
/*
Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata, targa, marca e modello.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Auto.
In questo caso la nota importante è rendere le proprietà della classe auto accessibili solo attraverso i metodi.
 */
public class Incapsulamento_e_Modificatori_1 {
    public static void main(String[] args) {

        Auto_2 auto = new Auto_2(2.993, "AF 123PA","BMW", "Serie 3 M3 Competition");

        auto.setCilindrata(2.933F);
        auto.setTarga("AF 123PA");
        auto.setMarca("BMW");
        auto.setModello("Serie 3 M3 Competition");

        System.out.println("La cilindrata è: "+ auto.getCilindrata());
        System.out.println("La targa è: "+ auto.getTarga());
        System.out.println("La marca è: "+ auto.getMarca());
        System.out.println("Modello: "+ auto.getModello());
    }
}
