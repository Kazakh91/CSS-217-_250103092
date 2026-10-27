class SmsSender implements MessageSender {
    // Implementation for sending a text message
    public void deliver(String text) {
        // Pretend this sends an actual SMS
        System.out.println("Sending via SMS: " + text);
    }
}
