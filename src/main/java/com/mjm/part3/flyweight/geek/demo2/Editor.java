package com.mjm.part3.flyweight.geek.demo2;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-03-26 13:18
 * @since
 */
public class Editor {

    private List<Character> characterList = new ArrayList<>();

    public void appendCharacter(char c, Font font, int size, int colorRGB) {
        Character character = new Character(c, font, size, colorRGB);
        characterList.add(character);
    }
}
