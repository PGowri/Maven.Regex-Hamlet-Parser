import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        String expected = hamletText.replace("Hamlet", "Leon");
        expected = expected.replace("Hamlet", "Leon");
        String actual = hamletParser.change("Hamlet", "Leon");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testChangeHoratioToTariq() {
        String expected = hamletText.replace("Horatio", "Tariq");
        expected = expected.replace("Horatio", "Tariq");
        String actual = hamletParser.change("Horatio", "Tariq");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindHoratio() {
        boolean expected = hamletText.contains("Horatio");
        boolean actual = hamletParser.find("Horatio");
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testFindHamlet() {
        boolean expected = hamletText.contains("Hamlet");
        boolean actual = hamletParser.find("Hamlet");
        Assert.assertEquals(expected, actual);

    }
}