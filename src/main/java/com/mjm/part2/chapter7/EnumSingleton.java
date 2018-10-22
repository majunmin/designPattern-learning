package com.mjm.part2.chapter7;

/**
 * @author majun
 * @date 2018/10/22 17:38
 */
public enum EnumSingleton {

    INSTANCE;

    private byte[] data = new byte[1024];

    private EnumSingleton(){
        System.out.println("EnumSingleton init");
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}

class EnumHolderSingleton{
    private byte[] data = new byte[1024];
    private EnumHolderSingleton(){}
    enum Holder{
        INSTANCE;
        private EnumHolderSingleton instance;
        Holder(){
            this.instance = new EnumHolderSingleton();
        }

        public EnumHolderSingleton getInstance(){
            return instance;
        }

    }


    public static EnumHolderSingleton getInstance(){
        return Holder.INSTANCE.getInstance();
    }
}
