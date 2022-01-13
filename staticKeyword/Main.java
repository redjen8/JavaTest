public class Main {

    public static void main(String[] args) {

        Car kiaCar = new Car();
        kiaCar.setCompany("KIA");

        Car hyundaiCar = new Car();
        hyundaiCar.setCompany("Hyundai");

        kiaCar.print();
        hyundaiCar.print();

        Car.type = "airplane";
        System.out.println("------- After Change -------");

        kiaCar.print();
        hyundaiCar.print();
    }
}