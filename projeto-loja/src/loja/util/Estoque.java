package loja.util;

import loja.model.Loja;
import loja.model.ProdutoFisico;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<ProdutoFisico> estoque = new ArrayList<ProdutoFisico>();


    ProdutoFisico p1 = new ProdutoFisico(1,4,"desodorante",14.99f);
        ProdutoFisico p2 = new ProdutoFisico(2,10, "sabonete", 5.99f);
        ProdutoFisico p3 = new ProdutoFisico(3,15,"Escova de dente", 3.99f);
        ProdutoFisico p4 = new ProdutoFisico(4, 5, "saboteira",9.99f);


    public void listaEstoque(){
        estoque.add(p1);
        estoque.add(p2);
        estoque.add(p3);
        estoque.add(p4);

    }

}
