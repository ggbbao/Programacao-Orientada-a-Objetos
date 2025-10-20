    package poo;

    public class MicroondasSmart extends Dispositivo {
        private int potenciaW;
        private boolean temTemporizador;

        public MicroondasSmart(String marca, String modelo, int potenciaW, boolean temTemporizador) {
            super(marca, modelo);
            this.potenciaW = potenciaW;
        this.temTemporizador = temTemporizador;
        }

        public void aquecer() {
    System.out.println("aquecer executado em " + this.getClass().getSimpleName() + ": " + potenciaW);
}

        public void programarTempo() {
    System.out.println("programarTempo executado em " + this.getClass().getSimpleName() + ": " + (temTemporizador ? "true" : "false"));
}

    }
