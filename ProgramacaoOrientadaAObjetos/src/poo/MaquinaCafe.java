    package poo;

    public class MaquinaCafe extends Dispositivo {
        private int capacidadeCapsulas;
        private boolean temMoedor;

        public MaquinaCafe(String marca, String modelo, int capacidadeCapsulas, boolean temMoedor) {
            super(marca, modelo);
            this.capacidadeCapsulas = capacidadeCapsulas;
        this.temMoedor = temMoedor;
        }

        public void fazerCafe() {
    System.out.println("fazerCafe executado em " + this.getClass().getSimpleName() + ": " + capacidadeCapsulas);
}

        public void limparReservatorio() {
    System.out.println("limparReservatorio executado em " + this.getClass().getSimpleName() + ": " + (temMoedor ? "true" : "false"));
}

    }
