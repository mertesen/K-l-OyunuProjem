package constants;

import java.util.Arrays;
import java.util.List;

public enum CARD_SUITS {
    SPADE("Maça"),
    HEARTHS("Kupa"),
    CLUBS("Sinek"),
    DIAMONDS("Karo");

    private final String suitName;

    CARD_SUITS(String suitName) {
        this.suitName = suitName;
    }

    public String getSuitName() {
        return this.suitName;
    }

    public static List<CARD_SUITS> getSuitList() {
        return Arrays.asList(CARD_SUITS.values());
    }
}
