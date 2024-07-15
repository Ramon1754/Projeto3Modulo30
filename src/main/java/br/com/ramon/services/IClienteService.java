package main.java.br.com.ramon.services;

import main.java.br.com.ramon.domain.Cliente;
import main.java.br.com.ramon.exceptions.DAOException;
import main.java.br.com.ramon.services.generic.IGenericService;

/**

 */
public interface IClienteService extends IGenericService<Cliente, Long> {

    //	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
    Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
