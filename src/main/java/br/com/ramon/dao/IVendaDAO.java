package main.java.br.com.ramon.dao;


import main.java.br.com.ramon.dao.generic.IGenericDAO;
import main.java.br.com.ramon.domain.Venda;
import main.java.br.com.ramon.exceptions.DAOException;
import main.java.br.com.ramon.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
