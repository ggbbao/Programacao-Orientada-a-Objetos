    package poo;

    public class Impressora extends Dispositivo {
        private int nivelTinta;
        private boolean impressoraColorida;

        public Impressora(String marca, String modelo, int nivelTinta, boolean impressoraColorida) {
            super(marca, modelo);
            this.nivelTinta = nivelTinta;
        this.impressoraColorida = impressoraColorida;
        }

        public void imprimirDocumento() {
    System.out.println("imprimirDocumento executado em " + this.getClass().getSimpleName() + ": " + nivelTinta);
}

        public void verificarNivelTinta() {
    System.out.println("verificarNivelTinta executado em " + this.getClass().getSimpleName() + ": " + (impressoraColorida ? "true" : "false"));
}

    }
