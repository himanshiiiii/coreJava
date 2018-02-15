public class UseStatic {
    static   int age = 20;
     static{
         String name = "harry";
         System.out.println("firstname is"+name);
     }
    private static void Lastname(String lname) {
         lname="potter";
        System.out.println("lastname is "+lname);
    }

    public static void main(String[] args) {
         UseStatic q =new UseStatic();
          q.Lastname("potter");
        System.out.println("age is"+age);


        }


}

