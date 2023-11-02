package Program1Task;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTask {
    @Test
    public  void rows(){
        Task user = new Task(0,0);
        int expected = user.getRows();
        int actual = 5;
        assertEquals(expected, actual);
    }
    @Test
    public  void characters(){
        Task user = new Task(0,0);
        int expected = user.getCharacters();
        int actual = 5;
        assertEquals(expected, actual);
    }
    @Test
    public  void words(){
        Task user = new Task(0,0);
        int expected = user.getWords();
        int actual = 5;
        assertEquals(expected, actual);
    }

}
