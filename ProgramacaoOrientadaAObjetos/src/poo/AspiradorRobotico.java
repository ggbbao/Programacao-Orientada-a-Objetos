    package poo;

    public class AspiradorRobotico extends Dispositivo {
        private int duracaoBateria;
        private boolean temSensorProximidade;

        public AspiradorRobotico(String marca, String modelo, int duracaoBateria, boolean temSensorProximidade) {
            super(marca, modelo);
            this.duracaoBateria = duracaoBateria;
        this.temSensorProximidade = temSensorProximidade;
        }

        public void limparCasa() {
    System.out.println("limparCasa executado em " + this.getClass().getSimpleName() + ": " + duracaoBateria);
}

        public void retornarBase() {
    System.out.println("retornarBase executado em " + this.getClass().getSimpleName() + ": " + (temSensorProximidade ? "true" : "false"));
}

    }
