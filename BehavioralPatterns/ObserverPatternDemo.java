package BehavioralPatterns;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel();
        Observer user1 = new Subscriber("Alice");
        Observer user2 = new Subscriber("Bob");

        channel.subscribe(user1);
        channel.subscribe(user2);

        channel.uploadVideo("Observer Pattern Explained");
        channel.unsubscribe(user1);
        channel.uploadVideo("Another Video");
    }
    
}
