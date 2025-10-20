    package poo;

    public class Monitor extends Dispositivo {
        private double tamanhoPolegadas;
        private String resolucao;

        public Monitor(String marca, String modelo, double tamanhoPolegadas, String resolucao) {
            super(marca, modelo);
            this.tamanhoPolegadas = tamanhoPolegadas;
        this.resolucao = resolucao;
        }

        public void ajustarBrilho() {
    System.out.println("ajustarBrilho executado em " + this.getClass().getSimpleName() + ": " + tamanhoPolegadas);
}

        public void mudarEntrada() {
    System.out.println("mudarEntrada executado em " + this.getClass().getSimpleName() + ": " + resolucao);
}

    }
