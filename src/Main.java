import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Joy");

        System.out.println("How old are you?");
        System.out.println("Do you miss our walks?");

        System.out.println("What's your name?");
        String name=in.next();
        System.out.println(name);

        String fileName = "10lines.txt";

        PrintWriter writer = null;

        try{
            writer= new PrintWriter(fileName);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        for (int i=0; i<10 ; i++){
            writer.println("Line" + i);
        }

        writer.close();
    }
}
