package poo;

public class Dispositivo {
    protected String marca;
    protected String modelo;
    protected boolean ligado;

    public Dispositivo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println(this.getClass().getSimpleName() + " ligado");
    }

    public void desligar() {
        ligado = false;
        System.out.println(this.getClass().getSimpleName() + " desligado");
    }

    public void exibirInfo() {
        System.out.println("Classe: " + this.getClass().getSimpleName());
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
    }
}
