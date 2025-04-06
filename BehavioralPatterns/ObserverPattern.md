🔔 What is the Observer Pattern?
The Observer pattern is like a subscribe/notify system.

Imagine a YouTube channel:

You (the user) subscribe to a channel.

Whenever the channel uploads a new video, you get notified.

If you unsubscribe, you won’t receive any more notifications.

In programming, this is used when:

One object (the Subject) changes.

It needs to notify all other objects (the Observers) that are watching it.

✅ Why Use It?
Keeps objects loosely coupled.

Useful when multiple parts of your app need to react to a single change.

🧠 Key Components
Subject (Observable) – the object being watched (e.g., YouTube Channel).

Observer – the object that wants updates (e.g., Subscriber).

Notification Mechanism – the way Observers get updates when the Subject changes.
