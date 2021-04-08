package com.mjm.part3.flyweight.geek.demo2.flyweight;

import java.awt.*;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-03-26 13:21
 * @since
 */
public class CharacterStyle {

    private Font font;
    private Integer size;
    private int ColorRGB;

    public CharacterStyle(Font font, Integer size, int colorRGB) {
        this.font = font;
        this.size = size;
        ColorRGB = colorRGB;
    }
}
