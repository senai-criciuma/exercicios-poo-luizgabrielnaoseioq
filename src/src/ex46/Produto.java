package ex46;

public class Produto extends Loja{
    private String nome;
    private String categoria;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void adicionarProdutos() {
        super.adicionarProdutos();
    }

    @Override
    public void removerProdutos() {
        super.removerProdutos();
    }

    @Override
    public void moverProduto() {
        super.moverProduto();
    }
}
