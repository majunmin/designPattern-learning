package com.mjm.part2.chapter9.abstractfactory;

import com.mjm.part2.chapter9.abstractfactory.entity.FemaleBlackHuman;
import com.mjm.part2.chapter9.abstractfactory.entity.FemaleWhiteHuman;
import com.mjm.part2.chapter9.abstractfactory.entity.FemaleYellowHuaman;
import com.mjm.part2.chapter9.abstractfactory.entity.Human;

/**
 * @author majun
 * @date 2018/10/23 21:08
 */
public class FemaleFactory implements HumanFactory {
    @Override
    public Human createYelloHuman() {
        return new FemaleYellowHuaman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
