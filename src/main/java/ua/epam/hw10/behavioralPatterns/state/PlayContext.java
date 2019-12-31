package ua.epam.hw10.behavioralPatterns.state;

public class PlayContext implements State {
    private State state;
    public void setState(State state){
        this.state = state;
    }
    public void doSomething() {
        this.state.doSomething();
    }
}
