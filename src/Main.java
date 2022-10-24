public class Main {


    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7f, "желтый", 2015, "Россия", null, null, null, 0, null);
        Car audi = new Car("Audi", "A8 50 L", 3.0f, "черный", 2020, "Германия", null, null, null, 0, null);
        Car bmw = new Car("BMW", "Z8", 3.0f, "черный", 2021, "Германия", null, null, null, 0, null);
        Car kia = new Car("KIA", "Sportage", 2.4f, "красный", 2018, "Южная Корея", null, null, null, 0, null);
        Car hyundai = new Car("Hyundai", "Avante", 1.6f, "оранжевый", 2016, "Южная Корея", null, null, null, 0, null);


        System.out.println(lada + "\n" + audi + "\n" + bmw + "\n" + kia + "\n" + hyundai );






    }
}