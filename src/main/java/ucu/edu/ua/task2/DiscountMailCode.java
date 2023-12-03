package ucu.edu.ua.task2;

public class DiscountMailCode implements MailCode {

    @Override
    public String generateText(Client client) {
        return "Hello! "
        + client.getName()
        + ", You have a discount id № "
        + client.getId()
        + ". Congratulations!";
    }

    @Override
    public String getSubject() {
        return "NEW DISCOUNT";
    }
    
}
