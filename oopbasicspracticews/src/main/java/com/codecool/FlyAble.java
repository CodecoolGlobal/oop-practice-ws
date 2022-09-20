package com.codecool;

public interface FlyAble {
    void fly();

    default int myMethod(){
        return 5;
    };

    default int myMethod2(){
        return 8;
    };
}
