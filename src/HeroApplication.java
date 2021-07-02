public class HeroApplication {

    public static void main(String[] args) {

    //Variable initialization
        String heroName;
        String herCity;

        String heroPower1, heroPower2, heroPower3;
        boolean isEvil;
        double heroSalary;

        String  realName;

        String universe;

    //Variable assignment
        heroName = "FlowerGirl";
        herCity = "Riga";
        heroPower1 = "Spreads flowers";
        heroPower2 = "Flower breath";
        heroPower3 = "";
        isEvil = true;
        heroSalary = 1500;
        realName = "Selga Cepuma";
        universe = "Floral";

    //Print out hero information card

        System.out.println("****************************");
        System.out.println("*** HERO INFORMATION ***");
        System.out.println("****************************");

        System.out.println("Hero name: " + heroName);
        System.out.println("-----------------------------");
        System.out.println("This hero lives in: " + herCity);
        System.out.println("-----------------------------");
        System.out.println("Hero has superpower: " + heroPower1);
        System.out.println("Hero has superpower: " + heroPower2);
        System.out.println("Hero has superpower: " + heroPower3);
        System.out.println("-----------------------------");
        System.out.println("This hero is evil: " + isEvil);
        System.out.println("-----------------------------");
        System.out.println("Hero earns: " + heroSalary + " EUR");
        System.out.println("-----------------------------");
        System.out.println("Real identity: " + realName);
        System.out.println("-----------------------------");
        System.out.println("Hero lives in: " + universe + "universe");
        System.out.println("****************************");
        System.out.println("*** HERO INFORMATION ***");
        System.out.println("****************************");

    }
}
