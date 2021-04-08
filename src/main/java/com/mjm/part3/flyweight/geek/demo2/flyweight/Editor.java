package com.mjm.part3.flyweight.geek.demo2.flyweight;


import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

/**
 * 编辑器  </br>
 * 享元模式
 *
 * @author majunmin
 * @description
 * @datetime 2021-03-26 13:27
 * @since
 */
public class Editor {

    private List<Character> characterList = new ArrayList<>();

    public void appendCharacter(char c, Font font, int size, int colorRGB) {
        Character character = new Character(c, CharacterStyleFactory.getCharacterStyle(font, size, colorRGB));
        characterList.add(character);
    }
}
