package com.mjm.principle.abstraction;


/**
 * 利用 Java 中的 interface 接口语法来实现抽象特性。
 * 调用者在使用图片存储功能的时候,只需要了解 IPictureStorage 这个接口类暴露了哪些方法就可以了
 * 不需要去查看 PictureStorage 类里的具体实现逻辑
 */
public interface IPictureStorage {

    void savePicture(Picture picture);

    Picture getPicture(String pictureId);

    void deletePicture(String pictureId);

    void modifyMetaInfo(String pictureId, PictureMetaInfo metaInfo);
}
