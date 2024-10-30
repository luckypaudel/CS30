public class As5_Haiku {

public static void run(){
int userChoice = 0;
    System.out.println("Which poem do you want (Enter 1, 2 or 3)");
    userChoice = Library.input.nextInt();
    Library.input.nextLine();
    String[] haiku = MyFiles.loadStringArr("IntelliJ_DataSet/Haikus/Haiku" + userChoice + ".txt");
    System.out.println("Reg Haiku:");
    for (int i = 0; i < haiku.length; i++) {
        System.out.println(haiku[i]);
    }

    System.out.println("Sorted Haiku");

    Sort.insertionSort(haiku);
    for(int i = 0; i< haiku.length; i++){
      System.out.println(haiku[i]);
    }
    System.out.println("What word would you like to change in the given haiku?");
    String userWord = Library.input.nextLine();
    System.out.println("What word do you want to change it to ?");
//   String userChange = Libary.input.nextLine();
//
//    haiku = haiku.replace();
}
public static void changeWord(){

}

}
