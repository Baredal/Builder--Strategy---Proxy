package ucu.edu.ua.task2;

public class BirthdayMailcode implements MailCode{

    @Override
    public String generateText(Client client) {
        return "Happy Birthday, " 
        + client.getName() 
        + "! " + "Now you are " 
        + client.getAge() 
        + " years old!";

    }

    public String getSubject() {
        return "BIRTHDAY";
    }
}
