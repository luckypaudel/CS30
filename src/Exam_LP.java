public class Exam_LP {
    public static String abbreviations [] = {"CHF",  "CZK",  "EUR",  "JPY",  "MAD"};
    public static String longName [] = {"Swiss Franc",  "Czech Koruna",  "Euro",  "Japanese Yen",   "Moroccan Dirham"};
    public static double currencies [] = {0.65,  16.47,  0.68,  109.97,  7.40};
    public static void run() {
        System.out.println("Press 1 to print all");
        System.out.println("Press 2 to find average");
        System.out.println("Press 3 to search by value");
        System.out.println("Press 4 to search by abbreviation");
        System.out.println("Press 5 to filter long names");
        System.out.println("Press 6 to sort by values");
        System.out.println("Press 7 to print unofficial abbreviations");
        System.out.println("Press 8 to exit");
        int choice = Library.input.nextInt();
        Library.input.nextLine();
        Boolean gameOn = true;

        while(gameOn) {
            if (choice == 0) {
                System.out.println("Press 1 to print all");
                System.out.println("Press 2 to find average");
                System.out.println("Press 3 to search by abbreviation");
                System.out.println("Press 4 to search by value");
                System.out.println("Press 5 to filter long names");
                System.out.println("Press 6 to sort by values");
                System.out.println("Press 7 to print unofficial abbreviations");
                System.out.println("Press 8 to exit");
                choice = Library.input.nextInt();
Library.input.nextLine();
            }
            if (choice == 1) {
                printAll();
                choice = 0;
            }
            if (choice == 2) {
                findAverage();
                choice = 0;
            }
            if (choice == 3) {
                findValue();
                choice = 0;
            }
            if (choice == 4) {
                searchAbbreviation();
                choice = 0;
            }

            if (choice == 5) {
                fullName();
                choice = 0;

            }
            if (choice == 6) {
                sortValue();
                choice = 0;

            }
            if (choice == 7) {
                unOffficial();
                choice = 0;

            }
            if(choice == 8){
                System.out.println("Thank you for trying!");
                gameOn = false;
            }
        }


    }
public static void printAll(){
    for (int i = 0; i < abbreviations.length; i++) {
        System.out.println(" Abbreviations: " + abbreviations[i] + " Long Names: " + longName[i] + " Currencies: " + currencies [i]);
    }
}
public static void findAverage() {
    double totalCurrencies = 0;
    for (int i = 0; i < currencies.length; i++) {
        totalCurrencies = (currencies[0] + currencies[1] + currencies[2] + currencies[3] + currencies[4]);

    }
    double average =(totalCurrencies/5);
    System.out.println(average);
}
public static void findValue(){
    System.out.println("What value do you want to look for");
    double userChoice = Library.input.nextDouble();
    Library.input.nextLine();
    boolean Found = false;
    for (int i = 0; i < currencies.length; i++) {
        if(userChoice == (currencies[i])){
            System.out.println(" The " + longName[i] + "is valued at " + currencies[i]);
            Found = true;
        }

        }
    if(Found == false){
        System.out.println("Nothing was found");

        }
    }
    public static void searchAbbreviation(){
System.out.println("What is the abbreviation youre looking for?");
        String userChoice = Library.input.nextLine();
int index = binarySearch(abbreviations, userChoice);
if(index >= 0){
    System.out.println(" One Canadian dollar is worth " + currencies[index] + " " + abbreviations[index]);
}
else if ( index == -1){
    System.out.println("Nothing was found");
        }
    }
    public static int binarySearch(String arr[], String searchTerm){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = (start + end)/2;
            if(searchTerm.equalsIgnoreCase(arr[mid])){
                return mid;
            }
            else if(searchTerm.compareToIgnoreCase(arr[mid]) > 0){
                start = mid + 1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void fullName(){
        System.out.println("What do you want to find");
        String userChoice = Library.input.nextLine();
for(int i =0; i< longName.length; i++){
    if(longName[i].contains(userChoice));
    System.out.println(longName[i]);
}
    }
    public static void sortValue(){
selectionSortIntArr(currencies);
System.out.println("Data Sorted By Values:");
    }
public static void unOffficial(){
    for (int i = 0; i < abbreviations.length; i++) {
        System.out.println(" Abbreviations: " + abbreviations[i] + " Long Names: " + longName[i] + " Currencies: " + currencies [i] + " " +  longName[i].substring(0,3));
    }
}
    public static void selectionSortIntArr(double[] arr){
        for(int i=0; i<currencies.length-1; i++){
            int lowestIndex = i;
            for(int j=i+1; j<currencies.length; j++){
                if(arr[j] < arr[lowestIndex]){
                    lowestIndex = j;
                }
            }
//swaps the lowest to the beginning
            double temp = arr[i];
            arr[i] = arr[lowestIndex];
            arr[lowestIndex] = temp;

        }
    }



}






