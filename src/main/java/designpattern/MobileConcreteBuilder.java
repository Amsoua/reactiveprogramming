package designpattern;

public class MobileConcreteBuilder extends MobileBuilder{
    @Override
    public void createMemory() {
        getMobile().setMemory("32 Gb");
        System.out.println("Memory created and installed");
    }

    @Override
    public void createBattery() {
        getMobile().setBattery("4500 mAH");
        System.out.println("Battery created and installed");
    }

    @Override
    public void createWireless() {
        getMobile().setWireless("Bluetooth and Wifi");
        System.out.println("Created wireless features and installed");
    }

    @Override
    public void createScreen() {
        getMobile().setScreen("Amoled");
        System.out.println("Screen created and installed");
    }

    @Override
    public void createMetalCase() {
        getMobile().setMetalCase("Aliminium");
        System.out.println("Metal case  created and pluged every thing in it");
    }
}
