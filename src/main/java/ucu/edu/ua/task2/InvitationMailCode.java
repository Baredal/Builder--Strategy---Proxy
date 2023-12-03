package ucu.edu.ua.task2;

public class InvitationMailCode implements MailCode {

    @Override
    public String generateText(Client client) {
        return "Hello "
        + client.getName()
        + "! You are invited to a festival! "
        + "Good luck!";
    }

    @Override
    public String getSubject() {
        return "NEW INVITATION";
    }

    
}