package com.mjm.part3.flyweight.geek.demo2.flyweight;

import java.awt.*;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-03-26 13:21
 * @since
 */
public class CharacterStyleFactory {

    private static Map<String, CharacterStyle> styleMap = new HashMap<>();

    public static CharacterStyle getCharacterStyle(Font font, Integer size, int colorRGB) {
        String key = MessageFormat.format("{}:{}:{}", font.toString(), size, colorRGB);
        CharacterStyle style;
        if (styleMap.containsKey(key)) {
            style = styleMap.get(key);
        } else {
            style = new CharacterStyle(font, size, colorRGB);
            styleMap.put(key, new CharacterStyle(font, size, colorRGB));
        }
        return style;
    }


}
