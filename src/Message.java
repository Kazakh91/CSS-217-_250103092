abstract     class Message {
    // THIS VARIABLE IS THE BRIDGE:
    // It links the Message team to the Sender team
    protected MessageSender sender;

    // You plug a sender into this slot when you create the message
    public Message(MessageSender sender) {
        // Save the chosen sender
        this.sender = sender;
    }

    // Every message type must write its own send method
    abstract void send(String content);
}
