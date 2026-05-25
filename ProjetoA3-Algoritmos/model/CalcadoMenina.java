// --- MENINA ---
class CalcadoMenina extends Calcado {
    private String detalheEnfeite;
    public CalcadoMenina(String nome, String marca, int numeracao, double preco, String cor, String detalheEnfeite) {
        super(nome, marca, numeracao, preco, cor);
        this.detalheEnfeite = detalheEnfeite;
    }
    @Override public String toString() { return super.toString() + " | Detalhe: " + detalheEnfeite; }
}
