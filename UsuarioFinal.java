package AED;
 

import java.io.IOException;
import java.io.Reader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.io.File;
import java.util.*;


public class UsuarioFinal {
    

    
    public static void main(String[] args) throws IOException {
        
        String caminho = "/home/lorenabraghini/Documents/Arquivos Faculdade/EPs/AED/Finaltopprofteamo.txt";
        Reader reader = Files.newBufferedReader(Paths.get(caminho));
 

        File qtds = new File(caminho);
        Scanner sc = new Scanner(qtds);

        int [] endireto = new int [723];
        

        for(int i = 0; i < endireto.length; i++) endireto[i] = 0;

            while(sc.hasNextLine()) {

                String tudo = sc.nextLine();
                String [] linha = tudo.split("      ");

                
                endireto[Integer.parseInt(linha[1])]++;
                            
                
            }

        System.out.println("X lugares foram visitados por Y pessoas");

        for(int i = 0; i < endireto.length; i++) {

             if(endireto[i] != 0) System.out.println(endireto[i] + "      " + i);
        }

    }

}    
