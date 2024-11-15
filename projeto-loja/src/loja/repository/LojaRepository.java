package loja.repository;

import loja.model.Loja;

public interface LojaRepository {
    public void pesquisarPorId(int id);
    public void listarTodas();
    public void cadastrar(Loja produto);
    public void atualizar(Loja produto);
    public void deletar(int produto);

}
