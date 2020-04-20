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


public class UsuarioDois {



    public static void main(String[] args) throws IOException {

        FileWriter arq = new FileWriter("/home/lorenabraghini/Documents/Arquivos Faculdade/EPs/AED/Finaltopprofteamo.txt");
        PrintWriter saida = new PrintWriter(arq);


            String caminho = "/home/lorenabraghini/Documents/Arquivos Faculdade/EPs/AED/tabelatop.csv";
            Reader reader = Files.newBufferedReader(Paths.get(caminho));
 

                File csvFile = new File(caminho);
                Scanner sc = new Scanner(csvFile);

                LinkedList<Lugar> lugares = new LinkedList<Lugar>();

                        while(sc.hasNextLine()){

                            String tudo = sc.nextLine();
                            String [] linha = tudo.split(",");

                            for(int i = 1; i < linha.length; i+=3){

                                Lugar lugar = new Lugar(linha[i],linha[i+1], linha[i+2]);
                                int indice = Procurar(lugares, lugar.getCoord());

                                if(indice == -1) lugares.add(lugar);
                                else lugares.get(indice).setQtd(linha[i+2]);
                                }
                            }



                    for(int i = 0; i < lugares.size(); i++) {
                        saida.println(lugares.get(i).getCoord() + "      " + lugares.get(i).getQtd());
                    }
        }
    
public static int Procurar(LinkedList<Lugar> c, String coordenada){

        for(int i = 0; i < c.size(); i++){
            if(c.get(i).getCoord().equals(coordenada)) return i;
        }

        return -1;
    }
}
