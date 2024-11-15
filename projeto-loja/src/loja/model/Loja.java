package loja.model;

public class Loja {
    private int id, qtd;
    private String nome;
    private float valor;

    public Loja(int id, int qtd, String nome, float valor) {
        this.id = id;
        this.qtd = qtd;
        this.nome = nome;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void visualizar(){
        System.out.println("Dados do produto: ");
        System.out.println("Id: "+this.getId());
        System.out.println("Quantidade: "+ getQtd());
        System.out.println("Nome: "+ getNome());
        System.out.println("Valor: "+ getValor());
    }
}
