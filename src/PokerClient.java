import java.util.ArrayList;
import java.util.List;

class PokerClient {

    private final Card card1;
    private final Card card2;
    private final Card card3;
    private final Card card4;
    private final Card card5;

    PokerClient(String ... c) {
        this.card1 = new Card(c[0].toUpperCase());
        this.card2 = new Card(c[1].toUpperCase());
        this.card3 = new Card(c[2].toUpperCase());
        this.card4 = new Card(c[3].toUpperCase());
        this.card5 = new Card(c[4].toUpperCase());
    }

    boolean highestCardIsMine(String ... c) {
        Card hc = new Card("s2");
        List<Card> o = new ArrayList<>();
        List<Card> m = new ArrayList<>();
        o.add(new Card(c[0].toUpperCase()));
        o.add(new Card(c[1].toUpperCase()));
        o.add(new Card(c[2].toUpperCase()));
        o.add(new Card(c[3].toUpperCase()));
        o.add(new Card(c[4].toUpperCase()));
        m.add(card1);
        m.add(card2);
        m.add(card3);
        m.add(card4);
        m.add(card5);

        for (int i = 0; i < o.size(); i++) {
            Card mc = m.get(i);
            for (Card oc : o) {
                if (oc.getValue() > mc.getValue()) {
                    if (oc.getValue() > hc.getValue()) {
                        hc = oc;
                    }
                } else {
                    if (mc.getValue() > hc.getValue()) {
                        hc = mc;
                    }
                }
            }
        }

        return m.contains(hc);
    }

}