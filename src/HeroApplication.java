import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HeroApplication {

    // Function to add x in arr
    public static String[] addX(String heroArray[], String newHeroName)
    {
        // create a new ArrayList
        List<String> arrlist
                = new ArrayList<String>(
                Arrays.asList(heroArray));
        // Add the new element
        arrlist.add(newHeroName);
        // Convert the Arraylist to array
        heroArray = arrlist.toArray(heroArray);
        // return the array
        return heroArray;

    }

    // Function to remove a hero from an array
    public static String[] removeX(String heroArray[], int heroIndexToDelete) {
        // create a new ArrayList
        List<String> arrlist
                = new ArrayList<String>(
                Arrays.asList(heroArray));



        // Find and remove a String from an array
        arrlist.remove(heroIndexToDelete);



        // Convert the Arraylist to array
        heroArray = arrlist.toArray(heroArray);



        // return the array
        return heroArray;
    }

    public static void main(String[] args) {

        Hero hero1 = new Hero("Dzesika", "Villere", "MadDog", 156545, HeroType.Hero, 35);
        Hero hero2 = new Hero("Dzesika", "Villere", "SmartDog", 165659554, HeroType.Hero, 35);

        Hero hero3 = new Hero();
        hero3.setName("Lasma");
        hero3.setSurname("Donna");
        hero3.setDeedTime(2);
        hero3.setNickname("Dr. Evil");
        hero3.setHeroType(HeroType.Villain);

        Hero[] metropole = new Hero[3];
        metropole[0] = hero1;
        metropole[1] = hero2;
        metropole[2] = hero3;


        District district1 = new District();
        district1.addNewHero(hero1);
        System.out.println(district1.toString());


        int counter = 0;
        for (Hero hero : metropole) {
            if(hero.calculatedLevel() == 1){
                counter++;
            }
        }
        System.out.println("There are " + counter + "LVL1 heroes");

        int counter2 = 0;
        for (Hero hero : metropole){
            if(hero.calculatedLevel() >1){
                counter2++;
            }
        }
        System.out.println("There are " + counter2);


        boolean isJohn = false;
        for (Hero hero : metropole){
            if (hero.getName().matches("John")){
                isJohn = true;
                break;
            }
        }

//        Booleans are not compared to true / false
        if (isJohn){
            System.out.println("There is no hero named John");
        }




//Variables
        String[] heroList = {"AliExpressMan", "DogoMom", "Oh Lora", "Garbage man", "ProblemSolver", "Blossom", "Bubble", "FlowerGirl", "SuperSnowflake", "MuffinGirl", "STAR"};
        String[] heroCities = {"Dobele", "Dog Town", "Laurville", "Dumpster", "Resolution Town", "Meadowville", "Soaptown", "Riga", "Winterspread", "Bakeryville", "Skyfield" };



//        MENU
        int menuEntry;
        Scanner scanner = new Scanner(System.in);
// BUSINESS REQUIREMENTS FOR LESSON #12
// 1. I would like to see a MENU to select different parts of superhero information card
// 2. A list of superheroes
// 3. Add new superhero
// 4. show specific superhero information
// 5. Delete the superhero from the list
// 6. Print
// 0. Exit

        do {
            System.out.println("Welcome!");
            System.out.println("Please select what to do:");
            System.out.println("1 - Show a list of superheros");
            System.out.println("2 - Add a new superhero");
            System.out.println("3 - Show superhero information");
            System.out.println("4 Delete a superhero");
            System.out.println("0 - Exit");
            menuEntry = scanner.nextInt();

            switch (menuEntry) {
                case 1:

                    System.out.println("============Super Hero List ===========");
                    for (String heroNames : heroList) {
                        System.out.println(heroNames);
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter the heros name: ");
                    String newHeroName = scanner.next();
                    heroList = addX(heroList, newHeroName);
                    break;
                case 3:
                    System.out.println("Which superhero information to print?");

                    int superHeroIndex = scanner.nextInt();
                    String superHeroName = scanner.next();
                    System.out.println("Hero name: " + heroList[superHeroIndex]);
                    System.out.println("Hero city: " + heroCities[superHeroIndex]);
                    //Variable initialization
                    String heroName;
                    String herCity;

                    String heroPower1, heroPower2, heroPower3;
                    boolean isEvil;
                    double heroSalary;

                    String realName;

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


//        Hero or villain
                    if (isEvil) {
                        System.out.println("Hero is a villain! She is stealing flowers!");
                    } else {
                        System.out.println("Hero protects the city!");
                    }
                    switch (herCity) {
                        case "New York":
                            heroSalary = 2000;
                            break;
                        case "Riga":
                            heroSalary = 1200;
                            break;
                        case "Venice":
                            heroSalary = 10000;
                            break;
                        default:
                            heroSalary = 100;
                    }


//        Cookies
                    System.out.println("****************************");
                    System.out.println("********* Finance **********");
                    int numOfCookies = (int) Math.floor(heroSalary / 1.29);
                    System.out.println("Hero's new salary: " + heroSalary);
                    System.out.println("Hero can buy " + numOfCookies + " cookies");

                    double averDailySalary = Math.round(heroSalary / 30 * 100) / 100;
                    System.out.println("Hero average daily salary " + averDailySalary + "euro");


                    break;
                case 4:
                    System.out.println("Please enter an index of hero you want to delete: ");
                    int heroIndex = scanner.nextInt();

                    heroList = removeX(heroList, heroIndex);
                    for (String hero: heroList) {
                        System.out.println(hero);
                    }

                    break;
                default:

            }

        } while (menuEntry != 0);


    }
}
