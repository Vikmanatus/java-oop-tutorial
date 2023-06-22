package com.vikman.enterprise.javaooptutorial;

public class Phone {
    private String name;
    private int screenZize;
    private int memoryRam;
    private int camera;

    public Phone(String name, int screenZize, int memoryRam, int camera) {
        this.name = name;
        this.screenZize = screenZize;
        this.memoryRam = memoryRam;
        this.camera = camera;
    }

    public Phone(String name, int memoryRam) {
        this.name = name;
        this.memoryRam = memoryRam;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getScreenZize() {
        return screenZize;
    }

    public void setScreenZize(int screenZize) {
        this.screenZize = screenZize;
    }

    public int getMemoryRam() {
        return memoryRam;
    }

      void setMemoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
    }

    public void playMusing(String trackName){
        System.out.println("Playing: "+ trackName);
    }


}
