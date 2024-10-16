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
        System.out.println("Enter 3 to show the number of people from United states ");
        System.out.println("Enter 4 to search for someone ");
        System.out.println("Press 5 to end game ");
        int choice = Library.input.nextInt();
        Library.input.nextLine();


        if (gameOn) {

            if (choice == 1) {
                sortByName();
                for (int i = 0; i < allNames.length; i++) {


                    System.out.println(allNames[i] + "  Age : " + allAges[i] + " BirthCountry: " + allBirthplaces[i]);
                }
            } else if (choice == 2) {
                sortByAge();
                for (int i = 0; i < allNames.length; i++) {


                    System.out.println(allNames[i] + "  Age : " + allAges[i] + " BirthCountry: " + allBirthplaces[i]);
                }

            } else if (choice == 3) {
                countfromUs();
            } else if (choice == 4) {
               System.out.println("Who are you looking for?");
               String userChoice = Library.input.nextLine();

               for(int i = 0; i<allNames.length; i++){

                   if(userChoice.equalsIgnoreCase(allNames[i])){
int foundIndex = i;
                       System.out.println("Your person was found");
                       System.out.println(allNames[foundIndex] + "  Age : " + allAges[foundIndex] + " Birth Country: " + allBirthplaces[foundIndex] +" " +allNetworths[foundIndex] + " B ");
                   }
               }
            } else if (choice == 5) {
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
}



