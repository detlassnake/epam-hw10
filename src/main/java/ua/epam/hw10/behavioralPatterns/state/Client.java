package ua.epam.hw10.behavioralPatterns.state;

public class Client {
    public static void main(String[] args) {
        PlayContext playContext = new PlayContext();
        State startPlay = new StartPlay();
        State stopPlay = new StopPlay();
        playContext.setState(startPlay);
        playContext.doSomething();
        playContext.setState(stopPlay);
        playContext.doSomething();
    }
}
