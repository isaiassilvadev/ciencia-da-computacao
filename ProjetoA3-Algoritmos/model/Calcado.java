package model;

public class Calcado {
    private static int contadorCalcado = 100; // Iniciando em 100 apenas para diferenciar os IDs de calçados das roupas no console
    private int id;
    private String nome;
    private String marca;
    private int numeracao;
    private double preco;
    private String cor;

    public Calcado() {}

    public Calcado(String nome, String marca, int numeracao, double preco, String cor) {
        this.id = contadorCalcado++;
        this.nome = nome;
        this.marca = marca;
        this.numeracao = numeracao;
        this.preco = preco;
        this.cor = cor;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public int getNumeracao() { return numeracao; }
    public void setNumeracao(int numeracao) { this.numeracao = numeracao; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    @Override
    public String toString() {
        return "ID: " + id + " | Calçado: " + nome + " | Marca: " + marca + " | Nº: " + numeracao + " | Preço: R$ " + preco + " | Cor: " + cor;
    }
}
