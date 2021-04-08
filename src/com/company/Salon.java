package com.company;

public class ColorCar extends Car {
    String color;

    public ColorCar(String color, String MODEL, int YEAR, int wheel_size,
                    double ENGINE_VOLUME, String transmission,
                    int horsepower, String color1
    ) {
        super(color, MODEL, YEAR, wheel_size, ENGINE_VOLUME, transmission, horsepower);
        this.color = color1;
    }

    /* Автосалон  (Должен быть создан в методе "mein"). Используется для заказа
    автомобиля на заводе, илиже изменения уже существующего авто на сервисе.*/
    public static void main(String[] args) {
        Car car = new Car("Pink");
        ColorCar colorCar = new ColorCar("Grey", "Audi", 2021, 19, 3.2,
                "Automatic", 123, "Black");
        Car colorCar2 = new Car("White");




    }
}
