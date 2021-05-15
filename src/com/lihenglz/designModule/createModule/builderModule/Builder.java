package com.lihenglz.designModule.createModule.builderModule;

/**
 * 声明了建造者的公共方法
 */
public interface Builder {

    /**
     * 细节方法
     */
    void buildCpu();
    void buildMainBoard();
    void buildDisk();
    void buildPower();
    void buildMemory();

    Computer createComputer();
}
