public class Seasons2 {
    public static void main(String[] args) {
        //№2
        Seasons season = Seasons.ЗИМА;
        System.out.println(season);
        //№3
        print(Seasons.ВЕСНА);
    }
    //№3
    public static void print(Seasons season){
        switch(season){
            case ЗИМА:
                System.out.println("Я люблю зиму!");
                break;
            case ВЕСНА:
                System.out.println("Я люблю весну!");
                break;
            case ЛЕТО:
                System.out.println("Я люблю лето!");
                break;
            case ОСЕНЬ:
                System.out.println("Я люблю осень!");
                break;
        }
        //№7
        //Метод values() возвращает массив, содержащий список констант перечислимого типа
        Seasons[] seas = Seasons.values();
        for (Seasons s : seas){
            System.out.println(s + "  " + s.getAverageTemperature() + "  " + s.getDescription());

        }
    }
}
