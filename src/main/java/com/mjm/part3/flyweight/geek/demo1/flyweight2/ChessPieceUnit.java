package com.mjm.part3.flyweight.geek.demo1.flyweight2;


import lombok.AllArgsConstructor;

/**
 * 享元模式 </br>
 *
 *将多个对象共享的部分抽出来单独管理, 由多个对象共享
 * 减少对象数量, 从而降低内存
 *
 * @author majunmin
 * @description
 * @datetime 2021-03-26 12:49
 * @since
 */
@AllArgsConstructor
public class ChessPieceUnit {

    private Long id;
    private String type;
    private Color color;


    enum Color {
        RED, BLACK
    }

}
