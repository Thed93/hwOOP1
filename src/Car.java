public class Car {



    private String brand;
    private String model;
    private float engineVolume;
    private String bodyColor;
    private int year;
    private String city;

    private String transmission;

    private String registrationNumber;
    private String bodyType;

    private int numberOfSeats;

    private String tireType;

    private boolean correctRegistrationNumber = true;

    public Car(String brand, String model, float engineVolume, String bodyColor, int year, String city,
               String transmission, String registrationNumber, String bodyType, int numberOfSeats, String tireType) {
        if (brand == null) {
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
        if (transmission == null) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }

        if (bodyType == null) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }


        if (registrationNumber == null) {
            this.registrationNumber = "x000xx000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (this.registrationNumber.length() != 9) {
            correctRegistrationNumber = false;
        }
        char[] chars = this.registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || (!Character.isAlphabetic(chars[4])) || (!Character.isAlphabetic(chars[5]))) {
            correctRegistrationNumber = false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8]) ) {
            correctRegistrationNumber = false;
        }
        if (!correctRegistrationNumber) {
            throw new RuntimeException("Некорекно указан номер авто");
        }
        if (numberOfSeats <= 0) {
            this.numberOfSeats = 5;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        if (tireType == "Летние" || tireType == "Зимние") {
            this.tireType = tireType;
        } else {
            this.tireType = "Летние";
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

    public String getTransmission() {
        return transmission;
    }

    public boolean isCorrectRegistrationNumber() {
        return correctRegistrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTireType() {
        return tireType;
    }


    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + " , " + getYear() + " года выпуска, сборка в " + getCity() +
                ", " + getBodyColor() + " цвет, обьем двигателя - " + getEngineVolume() + ",  коробка передач - "
                 + getTransmission() + ", тип кузова - " + getBodyType() + " , регистрационный номер - " + getRegistrationNumber()
                 + ", колличество мест - " + getNumberOfSeats() + ", шины - " + tireType ;
    }

    public static void changeTireTipe (Car car) {
        if (car.getTireType() == "Зимние") {
            car.tireType = "Летние";
        } else {
            car.tireType = "Зимние";
        }

    }


}




