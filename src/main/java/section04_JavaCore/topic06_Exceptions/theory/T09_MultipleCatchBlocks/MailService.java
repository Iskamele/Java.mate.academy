package section04_JavaCore.topic06_Exceptions.theory.T09_MultipleCatchBlocks;

public class MailService {
    public void sentMessage(String message, String from, String to)
            throws MailSendingException, MessageProcessingException {
        if (from == null || to == null) {
            throw new MailSendingException();
        }
        if (message == null || message.length() > 1000) {
            throw new MessageProcessingException();
        }
        System.out.println("Sending ...");
    }
}
