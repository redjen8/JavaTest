public class Car {

    static String type = "car";
    private String company;

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return this.company;
    }

    public void print() {
        System.out.println("type : " + this.type);
        System.out.println("company : " + this.company);
    }
}
