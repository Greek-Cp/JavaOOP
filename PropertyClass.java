package riyan.belajar.java.oop;

public class PropertyClass {
    //property or attribute
    public int x = 10;
    public int y = 20;
    public String nameClass = "Property Class";

    //method func
    public void getNameClass(){
        System.out.println("Name Class: " + this.nameClass);
    }

    public static void createTriangle(int n){
        int b = 0;
        for(int i = 0; i<=n; i++){
            for( b = 0; b<=i; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void createTriangleNum(int n ){
        int c = n;
        for(int i = 0; i <= c - 1; i++){
            for(int s = 0; s<= i; s++){
                System.out.print(s);
            }
            System.out.println(i);
        }
    }


}
