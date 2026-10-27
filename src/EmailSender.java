class EmailSender implements MessageSender {
    // Implementation for sending an email
    public void deliver(String text) {
        // Pretend this sends an actual email
        System.out.println("Sending via Email: " + text);
    }
}
