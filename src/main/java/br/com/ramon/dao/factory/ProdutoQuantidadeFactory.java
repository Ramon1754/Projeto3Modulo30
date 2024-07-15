package main.java.br.com.ramon.dao.factory;
import main.java.br.com.ramon.domain.Produto;
import main.java.br.com.ramon.domain.ProdutoQuantidade;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 */

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoQuantidadeFactory {

    public static ProdutoQuantidade convert(ResultSet rs) throws SQLException {
        Produto prod = ProdutoFactory.convert(rs);
        ProdutoQuantidade prodQ = new ProdutoQuantidade();
        prodQ.setProduto(prod);
        prodQ.setId(rs.getLong("ID"));
        prodQ.setQuantidade(rs.getInt("QUANTIDADE"));
        prodQ.setValorTotal(rs.getBigDecimal("VALOR_TOTAL"));
        return prodQ;
    }
}
