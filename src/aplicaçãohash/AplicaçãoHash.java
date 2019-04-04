
package aplicaçãohash;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AplicaçãoHash { 
    public static void main(String[] args) {
        String csvArquivo = "C:\\Users\\Dinopc\\Desktop\\Faculdade  5\\Estrutura-de-dados-2\\Hash-Trab\\NOME_MATRICULA.csv";
        SeparateChainingHashTable ht = new SeparateChainingHashTable(10000);
        Aluno[] aluno = new Aluno[100];
        BufferedReader conteudoCSV = null; //Ler todo conteúdo e salvar na memória
        String linha = "";
        String csvSeparadorDeCampo = ";"; //Indica a separação dos nome por coluna
        
        try {
            conteudoCSV = new BufferedReader (new FileReader(csvArquivo)); 
            int i = 0;        
            while ((linha = conteudoCSV.readLine()) != null) { //Enquanto tiver conteudo
                String[] moeda = linha.split(csvSeparadorDeCampo); //Quando ele encontrar o ;, ele considera como um campo
                aluno[i]= new Aluno(moeda[0],moeda[1]);
                System.out.println("NOME: " +aluno[i].getNome()+" | MATRICULA: " +aluno[i].getMatricula());
                ht.insert(aluno[i]);
                ++i;
            }
            System.out.println("--------------------------------------------------------");
            System.out.println("Acabou a criação de alunos!");
            ht.remove(aluno[20]);
            ht.printTable();
            
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado: \n"+e.getMessage());
        }
        
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBounds: \n"+e.getMessage()); //Nao exite index
        }
        
        catch (IOException e) {
            System.out.println("IO Erro: \n"+e.getMessage());
        } finally {
            if (conteudoCSV != null) {
                try {
                    conteudoCSV.close();
                } catch (IOException e) {
                    System.out.println("IO Erro: \n"+e.getMessage());
                }
            }
        }
    }
}
        
        
        
     

