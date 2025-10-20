    package poo;

    public class Smartwatch extends Dispositivo {
        private int passosDia;
        private boolean monitorCardiaco;

        public Smartwatch(String marca, String modelo, int passosDia, boolean monitorCardiaco) {
            super(marca, modelo);
            this.passosDia = passosDia;
        this.monitorCardiaco = monitorCardiaco;
        }

        public void contarPassos() {
    System.out.println("contarPassos executado em " + this.getClass().getSimpleName() + ": " + passosDia);
}

        public void verificarBatimentos() {
    System.out.println("verificarBatimentos executado em " + this.getClass().getSimpleName() + ": " + (monitorCardiaco ? "true" : "false"));
}

    }
