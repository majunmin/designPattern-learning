package com.mjm.part3.template.model3extends;

public class Hummer2Model extends HummerModel {

    private Boolean alarmFlag;
    @Override
    public void strat() {
        System.out.println("hummer2 start");
    }

    @Override
    public void stop() {
        System.out.println("hummer2 stop!");
    }

    @Override
    public void alarm() {
        System.out.println("humhummer2mer1 alarm!");
    }

    @Override
    public void engineBoom() {
        System.out.println("hummer2 Boom boom");
    }

    public void setAlarmFlag(boolean alarmFlag){
        this.alarmFlag = alarmFlag;
    }

    @Override
    protected Boolean isAlarm() {
        return this.alarmFlag;
    }
}
