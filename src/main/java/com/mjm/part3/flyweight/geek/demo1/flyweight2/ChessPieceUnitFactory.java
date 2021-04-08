package com.mjm.part3.flyweight.geek.demo1.flyweight2;

import java.util.HashMap;
import java.util.Map;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-03-26 12:56
 * @since
 */
public class ChessPieceUnitFactory {

    private static final Map<Long, ChessPieceUnit> pieces = new HashMap<>();

    static {
        pieces.put(1L, new ChessPieceUnit(1L, "车", ChessPieceUnit.Color.RED));
        pieces.put(2L, new ChessPieceUnit(2L, "车", ChessPieceUnit.Color.BLACK));
    }


    private ChessPieceUnitFactory() {
    }

    public static ChessPieceUnit getChessPieceUnit(Long id) {
        return pieces.get(id);
    }
}
