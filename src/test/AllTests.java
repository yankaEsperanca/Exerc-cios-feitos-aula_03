package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ClienteDAOTest.class, ClienteTest.class, ClienteTOTest.class,
		ConnectionFactoryTest.class })
public class AllTests {
//n�o esquecer de apagar no banco o cadastro com ID=13
}

