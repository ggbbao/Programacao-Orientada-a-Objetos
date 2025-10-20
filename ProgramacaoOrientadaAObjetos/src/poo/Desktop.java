    package poo;

    public class Desktop extends Dispositivo {
        private int capacidadeHD;
        private boolean temGPU;

        public Desktop(String marca, String modelo, int capacidadeHD, boolean temGPU) {
            super(marca, modelo);
            this.capacidadeHD = capacidadeHD;
        this.temGPU = temGPU;
        }

        public void rodarJogo() {
    System.out.println("rodarJogo executado em " + this.getClass().getSimpleName() + ": " + capacidadeHD);
}

        public void executarBackup() {
    System.out.println("executarBackup executado em " + this.getClass().getSimpleName() + ": " + (temGPU ? "true" : "false"));
}

    }
