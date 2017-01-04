import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PokerClientTest {
    private PokerClient testPokerClient;

    @Before
    public void setUp() throws Exception {
        testPokerClient = new PokerClient("h3", "d2", "s3", "s4", "cq");
    }

    @Test
    public void highestCardIsMineTrue() throws Exception {
        assertEquals(true, testPokerClient.highestCardIsMine("s3", "h4", "s5", "d6", "sj"));
    }

    @Test
    public void highestCardIsMineFalse() throws Exception {
        assertEquals(false, testPokerClient.highestCardIsMine("s3", "h4", "s5", "d6", "sk"));
    }

    @After
    public void tearDown() throws Exception {
        testPokerClient = null;
    }

}