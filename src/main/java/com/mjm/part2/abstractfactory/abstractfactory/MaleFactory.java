package com.mjm.part2.abstractfactory.abstractfactory;

import com.mjm.part2.abstractfactory.abstractfactory.entity.Human;
import com.mjm.part2.abstractfactory.abstractfactory.entity.MaleBlackHuman;
import com.mjm.part2.abstractfactory.abstractfactory.entity.MaleWhiteHuman;
import com.mjm.part2.abstractfactory.abstractfactory.entity.MaleYellowHuman;

/**
 * @author majun
 * @date 2018/10/23 21:09
 */
public class MaleFactory implements HumanFactory {
    @Override
    public Human createYelloHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
