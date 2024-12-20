package Java_Advanced.ArrayList;
/*
Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un Java_Advanced.ArrayList con 12 elementi e stamparlo in console.
Mettere in ordine la collezione e stampare il risultato
 */
class Student2 implements Comparable<Student2> { //Implementazione del metodo Comparable
    String name;
    int age;

    // Costruttore della classe
    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Metodi getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Override del metodo toString per una rappresentazione stringa
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }

    // Implementazione del metodo compareTo per ordinare in base all'età
    @Override
    public int compareTo(Student2 other) {
        return Integer.compare(this.age, other.age);
    }
}