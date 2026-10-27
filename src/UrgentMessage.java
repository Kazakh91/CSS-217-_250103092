public class UrgentMessage extends Message {
    // Pass the sender up to the parent slot
    public UrgentMessage(MessageSender sender) {
        // Calls the parent constructor to store the sender
        super(sender);
    }

    // Urgent messages tamper with the text first
    public void send(String content) {
        // Add alert tags before passing it across the bridge
        sender.deliver("[URGENT ALERT] " + content);
    }
}
