package com.mjm.part3.flyweight.geek.demo1;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 初版 棋子 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-03-26 10:31
 * @since
 */
@Getter
@AllArgsConstructor
public class ChessPiece {

    private Long id;
    private String type;
    private Color color;
    private Integer xPosition;
    private Integer yPosition;


    enum Color{
        RED, BLACK
    }


}


