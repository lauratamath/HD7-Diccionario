/**
*@author: Laura Tamath
*@since 17/02/2020
*@version 2/02/2020
*referencias: Java Structures, en el capítulo 12 
**/
import java.io. *;
import java.util.*;

public class Main{
	public static void main(String [] args)throws FileNotFoundException, IOException {
		BufferedReader leer = new BufferedReader(new FileReader("diccionario.txt"));    
        StringBuilder read = new StringBuilder();
        String linea;
        TreeNode<Association<String,String>> nodoN;
        BinaryTree<TreeNode<Association<String, String>>> bin = new BinaryTree<>(); 

         try {
            while ((linea=leer.readLine())!=null) {
                String palabraIngles;
                String palabraEspanol;
                read.append(linea);
                read.append(System.lineSeparator()); 
                linea = linea + " "; 
                for(int i=1;i<linea.length();i++){
                    
                    String iter = linea.substring((i-1), i); 
                    if(iter.equals(","))
                    {
                        palabraEspanol = linea.substring(i, linea.length()-1).toUpperCase(); //se obtiene la subcadena luego de ","
                        palabraIngles = linea.substring(0, i-1).toUpperCase(); //se obtiene la subcadena antes de "," 
                        nodoN = new TreeNode<>(palabraIngles, palabraEspanol); //se crea el "nodo" que se pondrá en el tree
                        bin.insertar(nodoN); //se agrega el nodo al arbol
                    }
                }
            }
            System.out.println("Imprimiendo diccionario - InOrder: ");
            bin.orden();
        }
        finally{
            leer.close();
        }


         //Traduccion del documento.
        
        File archivo = new File ("texto.txt");

        FileReader fileRead = new FileReader (archivo);
        BufferedReader bufferRead= new BufferedReader(fileRead);
        String line = "";
        Scanner sc = new Scanner(fileRead);
        String palabra = "";
        
        while (sc.hasNextLine()) {
            line += sc.nextLine();
            palabra = line.replaceAll("\n", " ");
        }fileRead.close();
        bufferRead.close();
        
        String palabras[] = palabra.split(" ");
        
        BinaryTree<TreeNode<Association<String, String>>> bt = new BinaryTree<>();
        
        String resultado = "";

        String word;
        for(String k: palabras){
            word = k.toUpperCase();
            resultado += bin.buscar(word) + " ";
        }
         //System.out.println("\n\n\n\n");
        System.out.println("----------------------------------");
        System.out.println("Traduccion del documento.");
        System.out.println(resultado);
        System.out.println("----------------------------------");
	}
}