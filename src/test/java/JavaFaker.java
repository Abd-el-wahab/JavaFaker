import com.github.javafaker.Faker;

public class JavaFaker {

    public static void main(String[] args) {
        Faker faker = new Faker();
        String name = faker.name().fullName();
        String streetAddress = faker.address().streetAddress();
        System.out.println(name + streetAddress);
    }
}
