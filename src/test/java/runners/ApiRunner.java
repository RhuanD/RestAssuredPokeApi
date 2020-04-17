package runners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import reports.Report;
import testcases.PokeApiTestCase;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                PokeApiTestCase.class,
        }
)
public class ApiRunner {

    @BeforeClass
    public static void start(){
        Report.create("PokeAPI", "Teste de API da PokeAPI");
    }

    @AfterClass
    public static void close(){
        Report.close();
    }
}
