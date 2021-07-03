package riyan.belajar.java.oop;

public class CEO {
    private static String nameCEO = "Yanuar Tri Laksono";
    private static int Income = 2000000000;
    public static String chatCEO;
    public static String Chat[];
    public void getInformationCEO(){
        System.out.println("Name CEO: " + nameCEO);
        System.out.println("Income : " + Income / 100000 + "Billion");
    }
    public static void acceptChat(String Data,int amountChat){
        if(chatCEO.length()>=0){
            for(int s = 0; s<= amountChat - 1; s++){
                Chat[s] = Data;
            }
        }
    }
    public  void sendChat(String yourChat,String Name, int id){
        String Data = "\n" + "-------------" + "\n" +  "Name: " + Name + "\n" + "Id: " + id + "\n" + "Chat:" + yourChat + "\n" + "-------------";
        System.out.println(Data);
    }
    public static void displayChat(){
        System.out.println(Chat[0]);
    }

}
