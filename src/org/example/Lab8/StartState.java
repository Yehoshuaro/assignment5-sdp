package org.example.Lab8;

class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }


    public String toString() {
        return "Start State";
    }
}

class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }


    public String toString() {
        return "Stop State";
    }
}