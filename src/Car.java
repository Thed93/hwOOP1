public class Car {
    String brand;
    String model;
    float engineVolume;
    String bodyColor;
    int year;
    String city;

    public Car(String brand, String model, float engineVolume, String bodyColor, int year, String city) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.bodyColor = bodyColor;
        this.year = year;
        this.city = city;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public int getYear() {
        return year;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + " , " + getYear() + " года выпуска, сборка в " + getCity() +
                ", " + getBodyColor() + " цвет, обьем двигателя - " + getEngineVolume() + ".";
    }
}
