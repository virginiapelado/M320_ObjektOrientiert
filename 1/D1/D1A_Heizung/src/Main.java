public class Main {
    public static void main(String[] args) {
        System.out.println("Heizung: \n");
        Heizung heizung = new Heizung(5, 5, 1);
        System.out.println("Temperature = " + heizung.getTemperature() +
                "\nMin=" + heizung.getMin() +
                "\nMax=" + heizung.getMax() +
                "\nIncrement=" + heizung.getIncrement()
        );


        heizung.temperatureWarmer();
        System.out.println("\nAfter temperature increase: " + heizung.getTemperature());

        heizung.temperatureColder();
        System.out.println("\nAfter temperature decreases: " + heizung.getTemperature());


    }
}