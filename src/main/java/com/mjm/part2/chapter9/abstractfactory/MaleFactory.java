package com.mjm.part2.chapter9.abstractfactory;

import com.mjm.part2.chapter9.abstractfactory.entity.Human;
import com.mjm.part2.chapter9.abstractfactory.entity.MaleBlackHuman;
import com.mjm.part2.chapter9.abstractfactory.entity.MaleWhiteHuman;
import com.mjm.part2.chapter9.abstractfactory.entity.MaleYellowHuman;

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
