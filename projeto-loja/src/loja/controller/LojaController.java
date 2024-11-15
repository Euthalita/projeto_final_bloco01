package loja.controller;

import loja.model.Loja;
import loja.repository.LojaRepository;
import loja.util.Estoque;

import java.util.ArrayList;
import java.util.Optional;


public class LojaController implements LojaRepository {
    ArrayList<Loja> listaProdutos = new ArrayList<Loja>();
    ArrayList<Estoque> listaEstoque = new ArrayList<>();

    @Override
    public void pesquisarPorId(int id) {
        var produto = buscarNaCollection(id);
        if (produto != null)
            produto.visualizar();
        else
            System.out.println("Produto: " + id + " não foi encontrado!");
    }

    @Override
    public void listarTodas() {
        for (var estoque :listaEstoque){
            estoque.listaEstoque();
        }
        for (var produto : listaProdutos) {
            produto.visualizar();
        }
    }

    @Override
    public void cadastrar(Loja produto) {
        listaProdutos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");

    }

    @Override
    public void atualizar(Loja produto) {
        var buscaProduto = buscarNaCollection(produto.getId());

        if(buscaProduto != null){
            listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
            System.out.println("Produto número " + produto.getId()+" foi atualizada com sucesso!");
        }else
            System.out.println("Produto número "+ produto.getId()+ " não foi encontrado!");
    }

    @Override
    public void deletar(int id) {
        Optional<Integer> produto = Optional.ofNullable(id);

        if( produto.isPresent()){
            if(listaProdutos.remove(produto)==true)
                System.out.println("Produto removido com sucesso!");
            else
                System.out.println("Produto não encontrado");
        }
    }

    public Loja buscarNaCollection(int id) {
        for (var produto : listaProdutos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

}
