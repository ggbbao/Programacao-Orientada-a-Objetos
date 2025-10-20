    package poo;

    public class RoteadorWiFi extends Dispositivo {
        private int velocidadeMbps;
        private int numeroAntenas;

        public RoteadorWiFi(String marca, String modelo, int velocidadeMbps, int numeroAntenas) {
            super(marca, modelo);
            this.velocidadeMbps = velocidadeMbps;
        this.numeroAntenas = numeroAntenas;
        }

        public void reiniciarRede() {
    System.out.println("reiniciarRede executado em " + this.getClass().getSimpleName() + ": " + velocidadeMbps);
}

        public void mostrarStatus() {
    System.out.println("mostrarStatus executado em " + this.getClass().getSimpleName() + ": " + numeroAntenas);
}

    }
