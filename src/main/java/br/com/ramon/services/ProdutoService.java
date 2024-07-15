package main.java.br.com.ramon.services;

import main.java.br.com.ramon.dao.IProdutoDAO;
import main.java.br.com.ramon.domain.Produto;
import main.java.br.com.ramon.services.generic.GenericService;

/**
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}
