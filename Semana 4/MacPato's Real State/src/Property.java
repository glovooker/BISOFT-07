public class Property {

    private int propertyCode;

    private String propertyName;

    private int propertyRoomsAmount;

    private String province;

    private Double rentFee;

    public Property(int propertyCode, String propertyName, int propertyRoomsAmount, String province, Double rentFee) {
        this.propertyCode = propertyCode;
        this.propertyName = propertyName;
        this.propertyRoomsAmount = propertyRoomsAmount;
        this.province = province;
        this.rentFee = rentFee;
    }

    public int getPropertyCode() {
        return propertyCode;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public int getPropertyRoomsAmount() {
        return propertyRoomsAmount;
    }

    public String getProvince() {
        return province;
    }

    public Double getRentFee() {
        return rentFee;
    }
}
