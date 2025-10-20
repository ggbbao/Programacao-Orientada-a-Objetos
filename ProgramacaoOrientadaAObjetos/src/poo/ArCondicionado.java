    package poo;

    public class ArCondicionado extends Dispositivo {
        private int BTU;
        private boolean temFiltroHEPA;

        public ArCondicionado(String marca, String modelo, int BTU, boolean temFiltroHEPA) {
            super(marca, modelo);
            this.BTU = BTU;
        this.temFiltroHEPA = temFiltroHEPA;
        }

        public void ligarResfriamento() {
    System.out.println("ligarResfriamento executado em " + this.getClass().getSimpleName() + ": " + BTU);
}

        public void ajustarTemperatura() {
    System.out.println("ajustarTemperatura executado em " + this.getClass().getSimpleName() + ": " + (temFiltroHEPA ? "true" : "false"));
}

    }
