package com.xqbase.jvm.stats.internal.stats;

/**
 * Classes stats of jvm.
 *
 * @author Tony He
 */
public class ClassStats implements Stats {

    private int currentClassCount;
    private long beenLoadedClassCount;
    private long beenUnloadedClassCount;

    public int getCurrentClassCount() {
        return currentClassCount;
    }

    public void setCurrentClassCount(int currentClassCount) {
        this.currentClassCount = currentClassCount;
    }

    public long getBeenLoadedClassCount() {
        return beenLoadedClassCount;
    }

    public void setBeenLoadedClassCount(long beenLoadedClassCount) {
        this.beenLoadedClassCount = beenLoadedClassCount;
    }

    public long getBeenUnloadedClassCount() {
        return beenUnloadedClassCount;
    }

    public void setBeenUnloadedClassCount(long beenUnloadedClassCount) {
        this.beenUnloadedClassCount = beenUnloadedClassCount;
    }

    @Override
    public String toJsonStr() {
        return "{\"currentClassCount\":\"" + this.currentClassCount + "\", \"beenLoadedClassCount\":\"" +
                this.beenLoadedClassCount + "\", \"beenUnloadedClassCount\":\"" + this.beenUnloadedClassCount + "\"}";
    }
}
