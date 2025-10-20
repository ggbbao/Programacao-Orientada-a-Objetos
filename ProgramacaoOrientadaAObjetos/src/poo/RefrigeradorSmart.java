    package poo;

    public class RefrigeradorSmart extends Dispositivo {
        private int capacidadeLitros;
        private boolean modoEco;

        public RefrigeradorSmart(String marca, String modelo, int capacidadeLitros, boolean modoEco) {
            super(marca, modelo);
            this.capacidadeLitros = capacidadeLitros;
        this.modoEco = modoEco;
        }

        public void ajustarTemperatura() {
    System.out.println("ajustarTemperatura executado em " + this.getClass().getSimpleName() + ": " + capacidadeLitros);
}

        public void ativarModoEco() {
    System.out.println("ativarModoEco executado em " + this.getClass().getSimpleName() + ": " + (modoEco ? "true" : "false"));
}

    }
