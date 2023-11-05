package Program1Task;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTask {
    //Test classes
    @Test
    public  void rows(){
        Task user = new Task(0,0);//Arrange
        int expected = user.getRows();
        int actual = 5;//Act
        assertEquals(expected, actual);//Assert
    }
    @Test
    public  void characters(){
        Task user = new Task(0,0);
        int expected = user.getCharacters();
        int actual = 5;
        assertEquals(expected, actual);
    }
    @Test
    public  void line(){
        Task user = new Task(0,0);
        String expected = user.getLine();
        String actual = "hello";
        assertEquals(expected, actual);
    }

}
