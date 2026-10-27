public class NormalMessage extends Message {
    // Pass the sender up to the parent slot
    public NormalMessage(MessageSender sender) {
        // Calls the parent constructor to store the sender
        super(sender);
    }

    // Normal messages send text as-is
    public void send(String content) {
        // Use the bridge to deliver the untouched text
        sender.deliver(content);
    }
}
