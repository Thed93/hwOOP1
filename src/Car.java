public class Car {
    String brand;
    String model;
    float engineVolume;
    String bodyColor;
    int year;
    String city;

    public Car(String brand, String model, float engineVolume, String bodyColor, int year, String city) {
        if (brand == null){
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume == 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (bodyColor == null) {
            this.bodyColor = "белый";
        } else {
            this.bodyColor = bodyColor;
        }
        if (year == 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (city == null) {
            this.city = "default";
        } else {
            this.city = city;
        }
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
