package loja.model;

public class ProdutoFisico extends Loja{
    private String tipo;

    public ProdutoFisico(int id, int qtd, String nome, float valor) {
        super(id, qtd, nome, valor);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
