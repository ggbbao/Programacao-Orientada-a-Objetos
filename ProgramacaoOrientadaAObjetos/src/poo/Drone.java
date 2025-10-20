    package poo;

    public class Drone extends Dispositivo {
        private int alturaMax;
        private boolean temCamera;

        public Drone(String marca, String modelo, int alturaMax, boolean temCamera) {
            super(marca, modelo);
            this.alturaMax = alturaMax;
        this.temCamera = temCamera;
        }

        public void voar() {
    System.out.println("voar executado em " + this.getClass().getSimpleName() + ": " + alturaMax);
}

        public void gravarVideo() {
    System.out.println("gravarVideo executado em " + this.getClass().getSimpleName() + ": " + (temCamera ? "true" : "false"));
}

    }
