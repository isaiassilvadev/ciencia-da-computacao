packpage model;

// --- MASCULINA ---
class RoupaMasculina extends Roupa {
    private String tipoCorte;
    public RoupaMasculina(String nome, String marca, String tamanho, double preco, String cor, String tipoCorte) {
        super(nome, marca, tamanho, preco, cor);
        this.tipoCorte = tipoCorte;
    }
    @Override public String toString() { return super.toString() + " | Corte: " + tipoCorte; }
}
