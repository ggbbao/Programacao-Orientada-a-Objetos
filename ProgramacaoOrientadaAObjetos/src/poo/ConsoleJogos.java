    package poo;

    public class ConsoleJogos extends Dispositivo {
        private int armazenamentoGB;
        private boolean temControleSemFio;

        public ConsoleJogos(String marca, String modelo, int armazenamentoGB, boolean temControleSemFio) {
            super(marca, modelo);
            this.armazenamentoGB = armazenamentoGB;
        this.temControleSemFio = temControleSemFio;
        }

        public void iniciarJogo() {
    System.out.println("iniciarJogo executado em " + this.getClass().getSimpleName() + ": " + armazenamentoGB);
}

        public void conectarControle() {
    System.out.println("conectarControle executado em " + this.getClass().getSimpleName() + ": " + (temControleSemFio ? "true" : "false"));
}

    }
