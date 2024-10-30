public class As4_Seacreatures {
    public static String[] Creatures = {"Angelshark","Bobbit worm","Costasiella sea slug","Doto greenamyeri nudibranch", "Dumbo octopus","Giant siphonophore", "Gulper Eel", "Johnsons abyssal seadevil","Polychaete worm" ,"Vampire squid"};
    public static  String[] Class = {"Fish", "Undersea Alien" , "Undersea Alien" , "Undersea Alien" , "Undersea Alien", "Fish", "Undersea Alien", "Fish", "Undersea Alien", "Undersea ALien"};
    public static Boolean[] Endangered = {true, false, false, false, false, false, false, false, false, false};
public static void run(){
boolean gameOn = true;
for(String name: Creatures){
System.out.println(name);
}

while(gameOn) {
    System.out.println("Enter a creature");
    String userInput = Library.input.nextLine();
    if(userInput.equalsIgnoreCase("Exit")){
        gameOn = false;
        System.out.println("Game Over!");
    }
   if(gameOn) {
       int index = Search.binarySearch(Creatures, userInput);
       if (index == -1) {
           System.out.println("Your creature was not found");
       } else {
           System.out.println("Your creature was"  + Creatures[index] + ", it is a " + Class[index]);
           if (Endangered[index] == true) {
               System.out.println("It is endangered");
           } else {
               System.out.println("It is not endangered");
           }

       }
   }
   }
}
}




