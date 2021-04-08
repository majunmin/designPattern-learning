package com.mjm.part3.flyweight.geek.demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * 棋盘 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-03-26 12:44
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
        //...省略摆放其他棋子的代码...
        chessPieces.put(1, new ChessPiece(1L, "车", ChessPiece.Color.RED, 0, 0));
        chessPieces.put(2, new ChessPiece(2L, "马", ChessPiece.Color.RED, 0, 1));
    }

    public void move(Long id, Integer toXPos, Integer toYPos) {
        // ...
    }
}
