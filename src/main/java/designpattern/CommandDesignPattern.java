package designpattern;

interface ICommandAC{
    void execute();
}

class AC {
    public void turnON(){
        System.out.println("AC is on");
    }

    public void turnOFF(){
        System.out.println("AC is off");
    }

    public void decTemp(){
        System.out.println("Decreasing temperature by 1");
    }

    public void incTemp(){
        System.out.println("Increasing temperature by 1");
    }
}

class StartACCommand implements ICommandAC{

    AC ac;

    public StartACCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("Turning on the AC");
        ac.turnON();
    }
}
class StopACCommand implements ICommandAC{

    AC ac;

    public StopACCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("Turning of the AC");
        ac.turnOFF();
    }
}

class DecTempACCommand implements ICommandAC{

    AC ac;

    public DecTempACCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("Decreasing the temperature");
        ac.decTemp();
    }
}

class IncTempACCommand implements ICommandAC{

    AC ac;

    public IncTempACCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("Increasing the temperature");
        ac.incTemp();
    }
}

class  ACAutomationRemote{
    ICommandAC command;

    public void setCommand(ICommandAC command){
        this.command = command;
    }

    public void buttonPressed(){
        command.execute();
    }
}

public class CommandDesignPattern {
    public static void main(String[] args) {
        AC acRoomOne  = new AC();
        AC acRoomTwo  = new AC();

        ACAutomationRemote acRemote = new ACAutomationRemote();
        acRemote.setCommand(new StartACCommand(acRoomOne));
        acRemote.buttonPressed();
        acRemote.setCommand(new StartACCommand(acRoomTwo));
        acRemote.buttonPressed();
        acRemote.setCommand(new DecTempACCommand(acRoomTwo));
        acRemote.buttonPressed();
        acRemote.setCommand(new IncTempACCommand(acRoomOne));
        acRemote.buttonPressed();
    }
}
