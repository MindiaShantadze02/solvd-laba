package passenger;

public class Passenger {
    private String id;
    private String name;
    private String lastName;
    private int age;
    private int phoneNumber;
    private DriverLicense driverLicense;

    public Passenger() {
        this.id = null;
        this.name = null;
        this.lastName = null;
        this.age = 0;
        this.phoneNumber = 0;
        this.driverLicense = null;
    }

    public Passenger(String id, String name, String lastName, int age, int phoneNumber, DriverLicense driverLicense) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.driverLicense = driverLicense;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int number) {
        this.phoneNumber = number;
    }

    public DriverLicense getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(DriverLicense driverLicense) {
        this.driverLicense = driverLicense;
    }
}
