import java.util.Scanner;

class Scanner1{
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter Your Name: ");

        String name =myobj.nextLine();
        System.out.println("Hello "+ name+"!");
        myobj.close();
    }
}