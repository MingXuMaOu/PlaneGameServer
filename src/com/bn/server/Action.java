package com.bn.server;

/**
 * @author liuming
 * @description
 * @date 2022/3/15
 */
public class Action {
    private int redOrYellow;
    private float keyX;
    private float keyY;
    int span = 20;

    public Action(int redOrYellow,float keyX,float keyY){
        this.redOrYellow = redOrYellow;
        this.keyX = keyX;
        this.keyY = keyY;
    }

    public void doAction(){
        float xx = 0;
        float yy = 0;
        if(Math.sqrt(keyX * keyX + keyY * keyY) != 0){
            xx = (float) (keyX / Math.sqrt(keyX * keyX + keyY * keyY));
            yy = (float) (keyY / Math.sqrt(keyX * keyX + keyY * keyY));
        }
        if(redOrYellow == 0){   //红色飞机

        }else {                 //黄色飞机

        }
    }

}
