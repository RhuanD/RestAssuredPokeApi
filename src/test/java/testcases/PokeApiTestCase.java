package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import reports.Report;
import tasks.PokeApiTask;

public class PokeApiTestCase {
    private PokeApiTask pokeApiTask;
    @Before
    public void init(){
        pokeApiTask = new PokeApiTask();
        Report.startTest("Teste do Charizard");
    }

    @Test
    public void mainTest(){
        pokeApiTask.makeRequest("charizard");
    }

    @After
    public void close(){
        //TODO: finish this
    }
}
