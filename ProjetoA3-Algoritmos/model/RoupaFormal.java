package model;

// --- FORMAL ---
class RoupaFormal extends Roupa {
    private String tipoTecido;
    public RoupaFormal(String nome, String marca, String tamanho, double preco, String cor, String tipoTecido) {
        super(nome, marca, tamanho, preco, cor);
        this.tipoTecido = tipoTecido;
    }
    @Override public String toString() { return super.toString() + " | Tecido: " + tipoTecido; }
}
