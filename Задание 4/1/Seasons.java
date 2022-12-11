public class Seasons {
    public enum Season {
        Spring(2),
        Summer(20),
        Autumn(0),
        Winter(-19);
        private final int averageTemperature;
        private Season(int averageTemperature) {
            this.averageTemperature = averageTemperature;
        }
        public int getAverageTemperature() {
            return this.averageTemperature;
        }


    public static void main(String[] args) {
        Season favouriteSeason = Season.Autumn;
        System.out.println("My favourite season is " + favouriteSeason.toString());
        season(favouriteSeason);
        System.out.println("The average temperature is " + favouriteSeason.getAverageTemperature());
        System.out.println(favouriteSeason.getDescription());
        System.out.println();

        for (Season i : Season.values()) {
            System.out.println(i.toString());
            System.out.println("The average temperature is " + i.getAverageTemperature());
            System.out.println(i.getDescription());
            System.out.println();
        }
    }
    public static void season(Season season) {
        switch(season) {
            case Winter:
                System.out.println("I love " + season.toString());
                break;
            case Spring:
                System.out.println("I love " + season.toString());
                break;
            case Summer:
                System.out.println("I love " + season.toString());
                break;
            case Autumn:
                System.out.println("I love " + season.toString());
                break;
        }
    }
        public String getDescription() {
            if (this == Season.Summer) {
                return "Warm season";
            } else return "Cold season";
        }
    }
}