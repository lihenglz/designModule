package com.lihenglz.designModule.createModule.builderModule;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        Computer lowComputer = director.create(new LowComputerBuilder());
        System.out.println(lowComputer);
        Computer highComputer = director.create(new HighComputerBuilder());
        System.out.println(highComputer);

    }
}
