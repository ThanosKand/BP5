import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IllegalArgumentException {
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

        for (int i=1; i<=10 ; i++){
            writer.println("Line" + i);
        }
        writer.close();

        try {
            FileWriter fw = new FileWriter("10Lines2.txt");

            PrintWriter pw = new PrintWriter(fw);
            pw.println("Hey Joy");
            fw.close();
        }catch (IOException e) {
            e.printStackTrace();

        }

        try{
            File file=new File("10Lines3.txt");
            if (!file.exists()){
                file.createNewFile();
            }
            PrintWriter writer2= new PrintWriter(file);
            writer2.println("Heyyyyyyy");
            writer2.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }

        System.out.println("New branch test 1");
        }

    }

