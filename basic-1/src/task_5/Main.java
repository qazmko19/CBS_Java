package task_5;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();

        address.setIndex("02000");
        address.setCountry("Ukraine");
        address.setCity("Kyiv");
        address.setStreet("Khreshchatyk");
        address.setHouse("1");
        address.setApartment("123");

        System.out.printf("Country: %s; city: %s; street: %s; house: %s; apartment: %s; index: %s.",
                address.getCountry(), address.getCity(), address.getStreet(), address.getHouse(), address.getApartment(),
                address.getIndex());
    }
}
