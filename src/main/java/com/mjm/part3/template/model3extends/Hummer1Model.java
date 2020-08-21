package com.mjm.part3.template.model3extends;

public class Hummer1Model extends HummerModel {

    private Boolean alarmFlag;

    @Override
    public void strat() {
        System.out.println("hummer1 start");
    }

    @Override
    public void stop() {
        System.out.println("hummer1 stop!");
    }

    @Override
    public void alarm() {
        System.out.println("hummer1 alarm!");
    }

    @Override
    public void engineBoom() {
        System.out.println("hummer1 Boom boom");
    }

    public void setAlarmFlag(boolean alarmFlag){
        this.alarmFlag = alarmFlag;
    }

    @Override
    protected Boolean isAlarm() {
        return this.alarmFlag;
    }
}
