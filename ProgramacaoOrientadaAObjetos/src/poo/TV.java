    package poo;

    public class TV extends Dispositivo {
        private double tamanhoTela;
        private String resolucao;

        public TV(String marca, String modelo, double tamanhoTela, String resolucao) {
            super(marca, modelo);
            this.tamanhoTela = tamanhoTela;
        this.resolucao = resolucao;
        }

        public void mudarCanal() {
    System.out.println("mudarCanal executado em " + this.getClass().getSimpleName() + ": " + tamanhoTela);
}

        public void aumentarVolume() {
    System.out.println("aumentarVolume executado em " + this.getClass().getSimpleName() + ": " + resolucao);
}

    }
