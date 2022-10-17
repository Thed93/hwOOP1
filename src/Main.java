public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7f, "желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L", 3.0f, "черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0f, "черный", 2021, "Германия");
        Car kia = new Car("KIA", "Sportage", 2.4f, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6f, "оранжевый", 2016, "Южная Корея");

        System.out.println(lada + "\n" + audi + "\n" + bmw + "\n" + kia + "\n" + hyundai );




    }
}