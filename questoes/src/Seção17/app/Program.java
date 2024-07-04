package Seção17.app;

import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        //Aula 1

        /*

        File file4 = new File("C:\\Users\\Miguel Lucas\\Desktop\\ppm\\POO UDEMY\\in.txt");
        Scanner sc = null;

        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        finally {
            if(sc != null){
                sc.close();
            }
        }

         */



        // Aula 1

        //Aula 2

        /* String path = "C:\\Users\\Miguel Lucas\\Desktop\\ppm\\POO UDEMY\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        finally {
           try {
               if (br != null){
                   br.close();
               }
               if (fr != null){
                   fr.close();
               }
           } catch (IOException e) {
               throw new RuntimeException(e);
           }
        }

         */


        // Aula 2

        // Aula 3 Lendo Arquivos

        String path = "C:\\Users\\Miguel Lucas\\Desktop\\ppm\\POO UDEMY\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null){
                System.out.println("Aula 3: " + line);
                line = br.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // Aula 3

        //Aula 4 Criação de Arquivos

        String[] lines = new String[] {"Sekiro", "Elden Ring", "Dark Souls"};

        String path2 = "C:\\Users\\Miguel Lucas\\Desktop\\ppm\\POO UDEMY\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2, true))){

            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        //Aula 4



        //Aula 5 - Manipulando pastas com File
/*
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path");
        String strPath = sc.nextLine();

        File path3 = new File(strPath);

        File[] folders = path3.listFiles((File::isDirectory));

        System.out.println("Folders:");
        for(File folder : folders){ //Este for irá imprimir no console todas as pastas do diretório q eu escrever
            System.out.println(folder);
        }


        File[] files = path3.listFiles(File::isFile);
        System.out.println("Files");
        for (File file : files){
            System.out.println(file);
        }

        boolean sucess = new File(strPath + "\\sekiro").mkdir(); //Criando uma nova pasta
        System.out.println("Directory created successfully " + sucess);

*/

        //Aula 5




        //Aula 6 Informações do caminho do arquivo

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file path");
        String strPath = sc.nextLine();

        File path6 =new File(strPath);

        System.out.println("Getname: " + path6.getName());
        System.out.println("Getparent: " + path6.getParent());
        System.out.println("Getpath: " + path6.getPath());

        //Aula 6











    }
}
