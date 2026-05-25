package model;

// --- MASCULINO ---
class CalcadoMasculino extends Calcado {
    private String tipoUso;
    public CalcadoMasculino(String nome, String marca, int numeracao, double preco, String cor, String tipoUso) {
        super(nome, marca, numeracao, preco, cor);
        this.tipoUso = tipoUso;
    }
    @Override public String toString() { return super.toString() + " | Estilo: " + tipoUso; }
}
