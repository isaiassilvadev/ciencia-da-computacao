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

// --- FEMININA ---
class RoupaFeminina extends Roupa {
    private String categoriaFeminina;
    public RoupaFeminina(String nome, String marca, String tamanho, double preco, String cor, String categoriaFeminina) {
        super(nome, marca, tamanho, preco, cor);
        this.categoriaFeminina = categoriaFeminina;
    }
    @Override public String toString() { return super.toString() + " | Categoria: " + categoriaFeminina; }
}

// --- MASCULINA ---
class RoupaMasculina extends Roupa {
    private String tipoCorte;
    public RoupaMasculina(String nome, String marca, String tamanho, double preco, String cor, String tipoCorte) {
        super(nome, marca, tamanho, preco, cor);
        this.tipoCorte = tipoCorte;
    }
    @Override public String toString() { return super.toString() + " | Corte: " + tipoCorte; }
}

// --- INFANTIL ---
class RoupaInfantil extends Roupa {
    private String faixaEtaria;
    public RoupaInfantil(String nome, String marca, String tamanho, double preco, String cor, String faixaEtaria) {
        super(nome, marca, tamanho, preco, cor);
        this.faixaEtaria = faixaEtaria;
    }
    @Override public String toString() { return super.toString() + " | Idade: " + faixaEtaria; }
}
