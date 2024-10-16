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
        System.out.println("Enter 4 to print people from a specific country ");
        System.out.println("Press 5 to end game ");
        int choice = Library.input.nextline();
        while(gameOn) {

            if (choice == 1) {
                sortByName();
            } else if (choice == 2) {
                sortByAge();
            } else if (choice == 3) {
                countfromUs();
            } else if (choice == 4) {
                printCountry();
            } else if (choice == 5) {
                System.out.println("Thank you for trying!");
            }
        }
        for (int i = 0; i < allNames.length; i++) {


            System.out.println(allNames[i] + "  Age : " + allAges[i]);
        }
    }

    public static void sortByName() {
        for(int i = 0; i < allNames.length - 1; ++i) {
            int lowestIndex = i;

            for(int j = i + 1; j < allNames.length; ++j) {
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
        for(int i = 0; i < allAges.length - 1; ++i) {
            int lowestIndex = i;

            for(int j = i + 1; j < allAges.length; ++j) {
                if (allAges[i] > allAges[j]) {
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




public static void countfromUs(){
    int count = 0;
        for (int i = 0; i < allBirthplaces.length; i++) {
                    if(allBirthplaces[i].equals("United States")) {
                        count++;
                    }
        }
    System.out.println(" There are " + count + " of people from the United States in this list ");
    }
    public static void printCountry(){


    }
        }



