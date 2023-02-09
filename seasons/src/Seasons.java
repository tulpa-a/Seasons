//№1
public enum Seasons {
    ЗИМА(-10), ВЕСНА(3), ЛЕТО(20){
        public String getDescription(){
            return "Тёплое время года";
        }

    }, ОСЕНЬ(-5);
//№4
    private int averageTemperature;
//№5
    Seasons(int averageTemperature){
        this.averageTemperature = averageTemperature;
    }
    public int getAverageTemperature(){
        return averageTemperature;
    }
    public String getDescription(){
        return "Холодное время года";

    }


}
