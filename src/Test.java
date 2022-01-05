public class Test {
    public static void main(String[] args) {
//        Season season = Season.SUMMER;

        //Object -> Enum -> Season

//        System.out.println(season instanceof Season); //instanceOf - является ли объект созданным от класса Season
//        System.out.println(season.getClass()); //getClacc()- возвращает тот класс, объектом которого season является

//        switch (season) {
//            case SUMMER -> System.out.println("It's warm outside");
//            case WINTER -> System.out.println("It's cold outside!");
//        }

//        Animal animal = Animal.DOG;
//        System.out.println(animal.toString());

//        Season season = Season.SUMMER;
//        System.out.println(season.getTemperature());

//        Season season = Season.AUTUMN;
//        System.out.println(season.name());  //name() - возвращает название Enum из строки
//
//        Animal animal = Animal.CAT;
//        System.out.println(animal.name());


//        Animal frog = Animal.valueOf("FROG"); //valueOf() - вернет информацию, соответствующую строке
//        System.out.println(frog.getTranslation());

        Season spring = Season.SPRING;
        System.out.println(spring.ordinal());   //ordinal() - метод возвращает индекс запрашиваего объекта Enam'a



    }
}
