packpage model;

// --- MENINO ---
class CalcadoMenino extends Calcado {
    private String temaPersonagem;
    public CalcadoMenino(String nome, String marca, int numeracao, double preco, String cor, String temaPersonagem) {
        super(nome, marca, numeracao, preco, cor);
        this.temaPersonagem = temaPersonagem;
    }
    @Override public String toString() { return super.toString() + " | Tema: " + temaPersonagem; }
}
