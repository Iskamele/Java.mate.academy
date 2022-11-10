package section04_JavaCore.topic06_Exceptions.theory.T09_MultipleCatchBlocks;

public class Main {
    public static void main(String[] args) {
        // catch blocks

        try {
            MailService service = new MailService();
            service.sentMessage(null, "abd", "xyz");
        } catch (MessageProcessingException | MailSendingException e) {
            System.out.println("Exception");
        }
    }
}
