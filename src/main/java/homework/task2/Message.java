package homework.task2;

abstract public class Message {
    private final String content;

    public Message(String content) {
        this.content = content;
    }

    abstract public String send();

    public boolean canSend() {
        return !content.isEmpty() && !content.isBlank() && content.length() >= 5;
    }
}