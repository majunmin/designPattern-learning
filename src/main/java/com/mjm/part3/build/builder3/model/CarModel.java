package com.mjm.part3.build.builder3.model;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majunmin on 2018/11/10.
 */
public abstract class CarModel {

    public List<String> sequence = new ArrayList<>();
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();

    public final void run(){
        for (String str : sequence) {
            if (StringUtils.equals(str, "start")){
                this.start();
            }else if(StringUtils.equals(str, "stop")){
                this.stop();
            }else if(StringUtils.equals(str, "alarm")){
                this.alarm();
            }else{
                this.engineBoom();
            }
        }
    }

    public void setSequence(List<String> sequence){
        this.sequence = sequence;
    }

 }
