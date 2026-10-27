public class Main {
    public static void main(String[] args) {
        Image photo = new ProxyImage("dog.png");

        System.out.println("Step 1 done: Proxy created. Still zero disk activity.\n");

        System.out.println("Step 2: Calling show() for the FIRST time:");
        photo.show();

        System.out.println("\nStep 3: Calling show() for the SECOND time:");
        photo.show();

        Video video1 = new ProxyVideo("Cat_Memes_4K.mp4");
        Video video2 = new ProxyVideo("Java_Tutorial_4K.mp4");
        Video video3 = new ProxyVideo("LoFi_Study_Beats_4K.mp4");

        System.out.println("Step 1: Created 3 videos. Zero data downloaded so far.\n");

        System.out.println("Step 2: User clicks play on Cat Memes for the FIRST time:");
        video1.play();

        System.out.println("\nStep 3: User clicks play on Cat Memes for the SECOND time:");
        video1.play();

        System.out.println("\nStep 4: Check video 2 and video 3:");
        System.out.println("Notice: 'Java_Tutorial_4K.mp4' and 'LoFi_Study_Beats_4K.mp4' were NEVER downloaded!");
        // Mix and match 1: Normal message via Email
        Message msg1 = new NormalMessage(new EmailSender());
        // Deliver it
        msg1.send("Server backup finished.");

        // Mix and match 2: Urgent message via SMS
        Message msg2 = new UrgentMessage(new SmsSender());
        // Deliver it
        msg2.send("Server is on fire!");

        // Mix and match 3: Urgent message via Email
        Message msg3 = new UrgentMessage(new EmailSender());
        // Deliver it
        msg3.send("Database connection lost!");

        // --- DEMO 1: Basic Remote controlling a TV ---
        System.out.println("--- 1. Testing Basic Remote with a TV ---");
        // Create a TV
        device myTv = new Tv();
        // Give that TV to the basic remote
        BasicRemote remote1 = new BasicRemote(myTv);
        // Click the remote's power button
        remote1.powerOn();


        // --- DEMO 2: Basic Remote controlling a Radio ---
        System.out.println("\n--- 2. Testing the SAME Basic Remote with a Radio ---");
        // Create a Radio
        device myRadio = new Radio();
        // Give that Radio to another basic remote
        BasicRemote remote2 = new BasicRemote(myRadio);
        // Click power
        remote2.powerOn();


        // --- DEMO 3: Advanced Remote controlling the TV ---
        System.out.println("\n--- 3. Testing Advanced Remote with the TV ---");
        // Give the TV to the advanced remote with the mute button
        AdvancedRemote smartRemote = new AdvancedRemote(myTv);
        // Click the mute button on the remote
        smartRemote.mute();
    }
}