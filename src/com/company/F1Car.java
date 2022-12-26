package com.company;

    public class F1Car extends Car {

        public F1Car(String model, int maxSpeed, int yearOfManufacture) {
            super(model, maxSpeed, yearOfManufacture);
        }

        public void pitStop() {

            //...пит-стоп делают только гоночные автомобили
        }

        public static void main(String[] args) {
            F1Car formula1Car = new F1Car("Lada", 360, 45);
            formula1Car.gas();
            formula1Car.pitStop();
            formula1Car.brake();
        }
    }

