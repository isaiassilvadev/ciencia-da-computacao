packpage model;

// --- INFANTIL ---
class RoupaInfantil extends Roupa {
    private String faixaEtaria;
    public RoupaInfantil(String nome, String marca, String tamanho, double preco, String cor, String faixaEtaria) {
        super(nome, marca, tamanho, preco, cor);
        this.faixaEtaria = faixaEtaria;
    }
    @Override public String toString() { return super.toString() + " | Idade: " + faixaEtaria; }
}
