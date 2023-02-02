package streams.functions.com;

public class WeatherByMonth {

	private String month;
    private int dayTimeTemperature;
    private int nightTimeTemperature;

    public WeatherByMonth(String month, int dayTimeTemperature, int nightTimeTemperature) {
        this.month = month;
        this.dayTimeTemperature = dayTimeTemperature;
        this.nightTimeTemperature = nightTimeTemperature;
    }

    public String getMonth() {
        return month;
    }

    public int getDayTimeTemperature() {
        return dayTimeTemperature;
    }

    public int getNightTimeTemperature() {
        return nightTimeTemperature;
    }
    @Override
    public String toString() {
        return "WeatherByMonth{" +
                "month='" + month + '\'' +
                ", dayTimeTemperature=" + dayTimeTemperature +
                ", nightTimeTemperature=" + nightTimeTemperature +
                '}';
    }
}
