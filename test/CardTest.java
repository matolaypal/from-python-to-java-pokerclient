import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CardTest {

    @Test
    public void createWell() throws Exception {
        Card card1 = new Card("hk");
        Card card2 = new Card("s10");
    }

    @Test(expected = IllegalArgumentException.class)
    public void createWithWrongColor() throws Exception {
        Card failCard = new Card("p9");
    }

    @Test(expected = IllegalArgumentException.class)
    public void createWithHeightNumber() throws Exception {
        Card failCard = new Card("h90");
    }

    @Test(expected = IllegalArgumentException.class)
    public void createWithSmallNumber() throws Exception {
        Card failCard = new Card("d0");
    }

    @Test(expected = NumberFormatException.class)
    public void createWithWrongString() throws Exception {
        Card failCard = new Card("hf");
    }

    @Test
    public void checkCardCode() throws Exception {
        Card card = new Card("hj");
        assertEquals("hj", card.cardCode);
    }

    @org.junit.Test
    public void getValue() throws Exception {
        Card card1 = new Card("hj");
        Card card2 = new Card("h5");
        assertEquals(11, card1.getValue());
        assertEquals(5, card2.getValue());
    }
}
