public class Automobil {

    int NumOfDoors;
    int Horsepower;
    String brand;
    String model;
    String colour;

    public void honk() {
        System.out.println("honk, honk");

    }
}
    class Car extends Automobil {
        int vin;

        public void honk() {
            System.out.println("hoooooooooonk");
        }

        public static void main(String[] args) {
            Car a =new Car();
            a.honk();
            a.vin=12213125;
            a.brand="bmw";
            a.model ="320i";
            a.colour = "black";
            a.Horsepower = 177;
            a.NumOfDoors = 5;

            Automobil b = new Automobil();
            b.honk();
        }
    }

