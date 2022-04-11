package designpattern;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public abstract class MobileBuilder {

    Mobile mobile;

    public abstract void createMemory();
    public abstract void createBattery();
    public abstract void createWireless();
    public abstract void createScreen();
    public abstract void createMetalCase();

    public final Mobile  buildMobile(){
        Mobile mob= new Mobile();
        setMobile(mob);

        createMemory();
        createBattery();
        createWireless();
        createScreen();
        createMetalCase();

        return mob;
    }
}
