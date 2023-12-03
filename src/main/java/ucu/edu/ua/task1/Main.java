package ucu.edu.ua.task1;



public class Main {
    public static void main(String[] args) {
        User user = Student.builder()
                        .name("Oles")
                        .age(32)
                        .gender("MALE")
                        .mark(61)
                        .mark(100)
                        .mark(62)
                        .build();
        System.out.println(user);
    }
}