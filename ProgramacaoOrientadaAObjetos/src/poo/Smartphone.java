    package poo;

    public class Smartphone extends Dispositivo {
        private int bateriaHoras;
        private boolean temCamera;

        public Smartphone(String marca, String modelo, int bateriaHoras, boolean temCamera) {
            super(marca, modelo);
            this.bateriaHoras = bateriaHoras;
        this.temCamera = temCamera;
        }

        public void tirarFoto() {
    System.out.println("tirarFoto executado em " + this.getClass().getSimpleName() + ": " + bateriaHoras);
}

        public void conectarWiFi() {
    System.out.println("conectarWiFi executado em " + this.getClass().getSimpleName() + ": " + (temCamera ? "true" : "false"));
}

    }
