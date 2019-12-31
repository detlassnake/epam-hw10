package ua.epam.hw10.behavioralPatterns.command;

public class LampInvoker {
    public Command command;
    public LampInvoker(Command command){
        this.command = command;
    }
    public void execute(){
        this.command.execute();
    }
}
