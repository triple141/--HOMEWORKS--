abstract class Notification {
    private String sender;
    private String receiver;
    private String messageText;

    public Notification(String sender, String receiver, String messageText) {
        this.sender = sender;
        this.receiver = receiver;
        this.messageText = messageText;
    }

    public String getMessageText()
    {
        return messageText;
    }
    public String getSender()
    {
        return sender;
    }
    public String getReceiver()
    {
        return receiver;
    }

    public abstract void send();
    public abstract void receive();
}