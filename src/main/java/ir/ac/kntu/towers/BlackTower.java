package ir.ac.kntu.towers;

import java.io.Serializable;

public class BlackTower extends Tower implements Serializable {
    public BlackTower(int player) {
        super(player, TypeOfTowers.BLACK_Tower, "Black", 2000, 40, 2, 300, "G:\\991\\AP-WORKS-991\\Castle--Defence-master\\images\\black.png");
    }

}
