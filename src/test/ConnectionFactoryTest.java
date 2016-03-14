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
			assertNotNull("testa se a conexao nao e nula", conn);//s� verifica se pegou alguma conex�o 
			assertTrue("é um objeto conexao", conn instanceof Connection ); // testa se o conn � uma instancia do connection
		} catch (SQLException e) {
			e.printStackTrace();
			fail("gerou SQLException");
		}
	}

}
