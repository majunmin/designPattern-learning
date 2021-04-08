package com.mjm.part3.flyweight.geek.demo2;

import java.awt.*;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-03-26 13:17
 * @since
 */
public class Character {

    private char c;
    private Font font;
    private Integer size;
    private int ColorRGB;


    public Character(char c, Font font, Integer size, int colorRGB) {
        this.c = c;
        this.font = font;
        this.size = size;
        ColorRGB = colorRGB;
    }


}
