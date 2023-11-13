public class Heizung {
    private int temperature;
    private int min;
    private int max;
    private int increment;

    // TASK A:
    public Heizung(int min, int max, int increment) {
        //TASK B:
        this.temperature = 15;
        this.min = min;
        this.max = max;
        this.increment = increment;
    }

    public void temperatureWarmer() {
        if (temperature + increment <= max) {
            temperature += increment;
        } else {
            System.out.println("\nTemperature cannot be increased beyond the maximum.");
        }
    }

    public void temperatureColder() {
        if (temperature - increment <= min) {
            temperature -= increment;
        } else {
            System.out.println("\nTemperature cannot be decreased beyond the minimum.");
        }
    }


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getIncrement() {
        return this.increment;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }
}
