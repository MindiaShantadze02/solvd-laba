package passenger;

public class DriverLicense {
    private String personId;
    private String type;
    private int createDate;
    private int expiringDate;

    public DriverLicense(String personId, String type, int createDate, int expiringDate) {
        this.personId = personId;
        this.type = type;
        this.createDate = createDate;
        this.expiringDate = expiringDate;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCreateDate() {
        return createDate;
    }

    public void setCreateDate(int createDate) {
        this.createDate = createDate;
    }

    public int getExpiringDate() {
        return this.expiringDate;
    }

    public void setExpiringDate(int expiringDate) {
        this.expiringDate = expiringDate;
    }
}
