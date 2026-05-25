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

// --- FEMININO ---
class CalcadoFeminino extends Calcado {
    private String tipoSalto;
    public CalcadoFeminino(String nome, String marca, int numeracao, double preco, String cor, String tipoSalto) {
        super(nome, marca, numeracao, preco, cor);
        this.tipoSalto = tipoSalto;
    }
    @Override public String toString() { return super.toString() + " | Salto: " + tipoSalto; }
}

// --- MENINO ---
class CalcadoMenino extends Calcado {
    private String temaPersonagem;
    public CalcadoMenino(String nome, String marca, int numeracao, double preco, String cor, String temaPersonagem) {
        super(nome, marca, numeracao, preco, cor);
        this.temaPersonagem = temaPersonagem;
    }
    @Override public String toString() { return super.toString() + " | Tema: " + temaPersonagem; }
}

// --- MENINA ---
class CalcadoMenina extends Calcado {
    private String detalheEnfeite;
    public CalcadoMenina(String nome, String marca, int numeracao, double preco, String cor, String detalheEnfeite) {
        super(nome, marca, numeracao, preco, cor);
        this.detalheEnfeite = detalheEnfeite;
    }
    @Override public String toString() { return super.toString() + " | Detalhe: " + detalheEnfeite; }
}
