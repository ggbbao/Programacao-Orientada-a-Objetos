    package poo;

    public class Projetor extends Dispositivo {
        private int luminosidadeLumens;
        private boolean suporta1080p;

        public Projetor(String marca, String modelo, int luminosidadeLumens, boolean suporta1080p) {
            super(marca, modelo);
            this.luminosidadeLumens = luminosidadeLumens;
        this.suporta1080p = suporta1080p;
        }

        public void projetarImagem() {
    System.out.println("projetarImagem executado em " + this.getClass().getSimpleName() + ": " + luminosidadeLumens);
}

        public void ajustarFoco() {
    System.out.println("ajustarFoco executado em " + this.getClass().getSimpleName() + ": " + (suporta1080p ? "true" : "false"));
}

    }
