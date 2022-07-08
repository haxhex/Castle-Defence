package ir.ac.kntu.towers;

import java.io.Serializable;

public class ElectricTower extends Tower implements Serializable {
    public ElectricTower(int player) {
        super(player, TypeOfTowers.ELECTRIC_TOWER,"Electric",1500,45,3,250,"G:\\991\\AP-WORKS-991\\Castle--Defence-master\\images\\electric.png");
    }

}
