import java.util.Random;

public class Car {
    Random r = new Random();
    private static String model;

    public String getModel() {
        switch (r.nextInt(7)) {
            case 0:
                model = "VAZ_1117";
                break;
            case 1:
                model = "VAZ_1118";
                break;
            case 2:
                model = "VAZ_1119";
                break;
            case 3:
                model = "VAZ_2170";
                break;
            case 4:
                model = "VAZ_2171";
                break;
            case 5:
                model = "VAZ_2172";
                break;
            case 6:
                model = "VAZ_2173";
                break;
        }
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private static String color;

    public String getColor() {
        switch (r.nextInt(7)) {
            case 0:
                color = "чёрного";
                break;
            case 1:
                color = "белого";
                break;
            case 2:
                color = "красного";
                break;
            case 3:
                color = "синего";
                break;
            case 4:
                color = "жёлтого";
                break;
            case 5:
                color = "зелёного";
                break;
            case 6:
                color = "серого";
                break;
        }
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private static int year;

    public int getYear() {
        switch (r.nextInt(7)) {
            case 0:
                year = 2007;
                break;
            case 1:
                year = 2008;
                break;
            case 2:
                year = 2009;
                break;
            case 3:
                year = 2010;
                break;
            case 4:
                year = 2011;
                break;
            case 5:
                year = 2012;
                break;
            case 6:
                year = 2013;
                break;
        }
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private boolean isWorking = r.nextBoolean();

    public boolean getIsWorking() {
        return isWorking;
    }

    public void setIsWorking(boolean isWorking) {
        this.isWorking = isWorking;
    }

    public Car() {
    }
}
