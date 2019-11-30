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
        String hamlet = "This is Hamlet";
        String expected = "This is Leon";
        Converter convert = new Converter(hamlet);

        convert.replace(hamlet,expected);
        String actual = convert.toString();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testChangeHoratioToTariq() {
        String haratio = "This is Horatio";
        String expected = "This is Tarig";
        Converter convert = new Converter(haratio);

        convert.replace(haratio,expected);
        String actual = convert.toString();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFindHoratio() {
    }

    @Test
    public void testFindHamlet() {
    }
}