package Java_Basic.Incapsulamento_e_Modificatori;

public class Auto_1 {
    private float cilindrata;
    private String targa;
    private String marca;
    private String modello;

    public Auto_1(float cilindrata, String targa, String marca, String modello) {
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
    }

    public double getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(float cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }
}

