package BehavioralPatterns;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}

interface Subject{
    void subscribe(Observer o);
    void unsubscribe(Observer o);
    void notifyObservers(String message);
}


class YouTubeChannel implements Subject {
    private List<Observer> observers = new ArrayList<>();
    
    @Override
    public void subscribe(Observer o) {
        observers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message){
        for(Observer o: observers){
            o.update(message);
        }
    }

    public void uploadVideo(String videoTitle) {
        System.out.println("New video uploaded: " + videoTitle);
        notifyObservers("New video: " + videoTitle);
    }
}
