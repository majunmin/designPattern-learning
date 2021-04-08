package com.mjm.part3.flyweight.geek.demo1.flyweight2;

import java.util.HashMap;
import java.util.Map;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-03-26 12:55
 * @since
 */
public class ChessBoard {


    private Map<Integer, ChessPiece> chessPieces = new HashMap<>();

    public ChessBoard() {
        init();
    }

    /**
     * 摆放棋子
     */
    private void init() {
        chessPieces.put(1, new ChessPiece(ChessPieceUnitFactory.getChessPieceUnit(1L), 0, 0));
        chessPieces.put(2, new ChessPiece(ChessPieceUnitFactory.getChessPieceUnit(2L), 0, 1));
        //  其他棋子摆放
    }
}
