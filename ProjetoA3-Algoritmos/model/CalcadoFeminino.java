packpage model;

// --- FEMININO ---
class CalcadoFeminino extends Calcado {
    private String tipoSalto;
    public CalcadoFeminino(String nome, String marca, int numeracao, double preco, String cor, String tipoSalto) {
        super(nome, marca, numeracao, preco, cor);
        this.tipoSalto = tipoSalto;
    }
    @Override public String toString() { return super.toString() + " | Salto: " + tipoSalto; }
}
