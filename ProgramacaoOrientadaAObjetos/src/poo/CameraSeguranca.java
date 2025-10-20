    package poo;

    public class CameraSeguranca extends Dispositivo {
        private int resolucaoMP;
        private boolean visaoNoturna;

        public CameraSeguranca(String marca, String modelo, int resolucaoMP, boolean visaoNoturna) {
            super(marca, modelo);
            this.resolucaoMP = resolucaoMP;
        this.visaoNoturna = visaoNoturna;
        }

        public void gravar() {
    System.out.println("gravar executado em " + this.getClass().getSimpleName() + ": " + resolucaoMP);
}

        public void ativarAlerta() {
    System.out.println("ativarAlerta executado em " + this.getClass().getSimpleName() + ": " + (visaoNoturna ? "true" : "false"));
}

    }
