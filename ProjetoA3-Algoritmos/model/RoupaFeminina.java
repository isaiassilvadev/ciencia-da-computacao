// --- FEMININA ---
class RoupaFeminina extends Roupa {
    private String categoriaFeminina;
    public RoupaFeminina(String nome, String marca, String tamanho, double preco, String cor, String categoriaFeminina) {
        super(nome, marca, tamanho, preco, cor);
        this.categoriaFeminina = categoriaFeminina;
    }
    @Override public String toString() { return super.toString() + " | Categoria: " + categoriaFeminina; }
}
