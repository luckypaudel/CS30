import java.util.Locale;

public class As3_ParallelSort {
    public static String[] allNames = MyFiles.loadStringArr("IntelliJ_DataSet/RichestPeople/Names.txt");
    public static String[] allBirthplaces = MyFiles.loadStringArr("IntelliJ_DataSet/RichestPeople/Birthplace.txt");
    public static int[] allAges = MyFiles.loadIntArr("IntelliJ_DataSet/RichestPeople/Age.txt");
    public static double[] allNetworths = MyFiles.loadDoubleArr("IntelliJ_DataSet/RichestPeople/networth.txt");

    public static void run() {
        boolean gameOn = true;

        System.out.println("Enter 1 to sort by Name ");
        System.out.println("Enter 2 to sort by Age ");
        System.out.println("Enter 3 to print from Country ");
        System.out.println("Enter 4 to show the number of people from United states ");
        System.out.println("Press 5 to find people at a specific age ");
        System.out.println("Press 6 to end game");
        int choice = Library.input.nextInt();
        Library.input.nextLine();


        while (gameOn) {

            if (choice == 0){
                System.out.println("Enter 1 to sort by Name ");
                System.out.println("Enter 2 to sort by Age ");
                System.out.println("Enter 3 to print from Country ");
                System.out.println("Enter 4 to show the number of people from United states ");
                System.out.println("Press 5 to find people at a specific age ");
                System.out.println("Press 6 to end game");
                 choice = Library.input.nextInt();
                Library.input.nextLine();
            }
            if (choice == 1) {
                sortByName();
                for (int i = 0; i < allNames.length; i++) {


                    System.out.println(allNames[i] + "  Age : " + allAges[i] + " BirthCountry: " + allBirthplaces[i] + " Networths: " + allNetworths[i] + " Billion ");
                    choice = 0;
                }
            } else if (choice == 2) {
                sortByAge();
                for (int i = 0; i < allNames.length; i++) {


                    System.out.println(allNames[i] + "  Age : " + allAges[i] + " BirthCountry: " + allBirthplaces[i] + " Networths: " + allNetworths[i] + " Billion ");
                }
                choice = 0;

            } else if (choice == 3) {
                printbyCountry();
                choice = 0;
            } else if (choice == 4) {
                countfromUs();
                choice = 0;
            } else if (choice == 5) {
                ageFinder();
choice =0;
            }
            else if (choice == 6){
                System.out.println("Thank you for trying!");
            }
        }

    }

    public static void sortByName() {
        for (int i = 0; i < allNames.length - 1; ++i) {
            int lowestIndex = i;

            for (int j = i + 1; j < allNames.length; ++j) {
                if (allNames[j].compareToIgnoreCase(allNames[lowestIndex]) < 0) {
                    lowestIndex = j;
                }
            }

            String temp = allNames[i];
            allNames[i] = allNames[lowestIndex];
            allNames[lowestIndex] = temp;
            String temp1 = allBirthplaces[i];
            allBirthplaces[i] = allBirthplaces[lowestIndex];
            allBirthplaces[lowestIndex] = temp1;
            int temp2 = allAges[i];
            allAges[i] = allAges[lowestIndex];
            allAges[lowestIndex] = temp2;

        }

    }

    public static void sortByAge() {
        for (int i = 0; i < allAges.length - 1; ++i) {
            int lowestIndex = i;

            for (int j = i + 1; j < allAges.length; ++j) {
                if (allAges[j] > allAges[lowestIndex]) {
                    lowestIndex = j;
                }
            }

            String temp = allNames[i];
            allNames[i] = allNames[lowestIndex];
            allNames[lowestIndex] = temp;
            String temp1 = allBirthplaces[i];
            allBirthplaces[i] = allBirthplaces[lowestIndex];
            allBirthplaces[lowestIndex] = temp1;
            int temp2 = allAges[i];
            allAges[i] = allAges[lowestIndex];
            allAges[lowestIndex] = temp2;

        }

    }


    public static void countfromUs() {
        int count = 0;
        for (int i = 0; i < allBirthplaces.length; i++) {
            if (allBirthplaces[i].equals("United States")) {
                count++;
            }
        }
        System.out.println(" There are " + count + " of people from the United States in this list ");

    }

    public static void ageFinder() {
        System.out.println("What age do you want to look for");
        int userChoice = Library.input.nextInt();
        boolean found = false;
        for (int i = 0; i < allAges.length; i++) {

            if (userChoice == allAges[i]) {
                int foundIndex = i;
              found = true;
                System.out.println(allNames[i] + "  Age : " + allAges[i] + " Birth Country: " + allBirthplaces[i] + " Networths: " + allNetworths[i] + " Billion ");

                }
            }


         if(found != true){
            System.out.println("Not found.");
        }

    }

    public static void printbyCountry() {
        System.out.println("What country do you want to filter for");
        String userChoice = Library.input.nextLine();
        boolean found = false;
        int count = 0;
        for (int i = 0; i < allBirthplaces.length; i++) {
            if (allBirthplaces[i].equals(userChoice)) {
                found = true;
                System.out.println(allNames[i] + "  Age : " + allAges[i] + " Birth Country: " + allBirthplaces[i] + " Networths: " + allNetworths[i] + " Billion ");
            }
        }
        if(!found){
            System.out.println("Not found");
        }

    }
        }






