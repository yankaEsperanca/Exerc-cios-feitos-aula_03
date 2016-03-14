package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import factory.ConnectionFactory;

public class ConnectionFactoryTest {

	@Test
	public void testObterConexao() {
		try {
			Connection conn = ConnectionFactory.obtemConexao();
			assertNotNull("testa se a conexao nao e nula", conn);//só verifica se pegou alguma conexão 
			assertTrue("Ã© um objeto conexao", conn instanceof Connection ); // testa se o conn é uma instancia do connection
		} catch (SQLException e) {
			e.printStackTrace();
			fail("gerou SQLException");
		}
	}

}
