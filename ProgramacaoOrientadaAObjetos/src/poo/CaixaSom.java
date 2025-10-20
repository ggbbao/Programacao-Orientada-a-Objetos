    package poo;

    public class CaixaSom extends Dispositivo {
        private int potenciaW;
        private boolean temBluetooth;

        public CaixaSom(String marca, String modelo, int potenciaW, boolean temBluetooth) {
            super(marca, modelo);
            this.potenciaW = potenciaW;
        this.temBluetooth = temBluetooth;
        }

        public void reproduzirAudio() {
    System.out.println("reproduzirAudio executado em " + this.getClass().getSimpleName() + ": " + potenciaW);
}

        public void ajustarVolume() {
    System.out.println("ajustarVolume executado em " + this.getClass().getSimpleName() + ": " + (temBluetooth ? "true" : "false"));
}

    }
