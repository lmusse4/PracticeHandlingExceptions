package application;

public class Main {
    public static void main(String[] args) {
        //testing classes
        StandardSensor ten = new StandardSensor(10);
        StandardSensor minusFive = new StandardSensor(-5);
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        System.out.println(ten.read());
        System.out.println(minusFive.read());

        System.out.println(ten.isOn());
        ten.setOff();
        System.out.println(ten.isOn());

        temperatureSensor.setOn();
        System.out.println(temperatureSensor.read());
        System.out.println(temperatureSensor.isOn());
        temperatureSensor.setOff();
        System.out.println(temperatureSensor.isOn());
//        System.out.println(temperatureSensor.read());


        Sensor kumpula = new TemperatureSensor();
        kumpula.setOn();
        System.out.println("temperature in Kumpula " + kumpula.read() + " degrees Celsius");

        Sensor kaisaniemi = new TemperatureSensor();
        Sensor helsinkiVantaaAirport = new TemperatureSensor();

        AverageSensor helsinkiRegion = new AverageSensor();
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiVantaaAirport);

        helsinkiRegion.setOn();
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");

        System.out.println("temperature in Helsinki region: " + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("temperature in Helsinki region: " + helsinkiRegion.read() + " degrees Celsius");

        System.out.println("readings: " + helsinkiRegion.readings());

    }

}
