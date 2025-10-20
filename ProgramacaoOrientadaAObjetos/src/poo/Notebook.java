    package poo;

    public class Notebook extends Dispositivo {
        private int memoriaRAM;
        private boolean temBluetooth;

        public Notebook(String marca, String modelo, int memoriaRAM, boolean temBluetooth) {
            super(marca, modelo);
            this.memoriaRAM = memoriaRAM;
        this.temBluetooth = temBluetooth;
        }

        public void compilarCodigo() {
    System.out.println("compilarCodigo executado em " + this.getClass().getSimpleName() + ": " + memoriaRAM);
}

        public void conectarBluetooth() {
    System.out.println("conectarBluetooth executado em " + this.getClass().getSimpleName() + ": " + (temBluetooth ? "true" : "false"));
}

    }
