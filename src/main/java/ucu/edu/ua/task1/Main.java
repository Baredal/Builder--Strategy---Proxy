package ucu.edu.ua.task1;



public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                        .name("Vaso")
                        .age(32)
                        .gender("MALE")
                        .weight(75)
                        .height(175)
                        .build();
        System.out.println(user);
    }
}