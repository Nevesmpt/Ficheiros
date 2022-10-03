
package manipula.ficheiros;

import java.io.File;


class Ficheiro {

    static void criaFicheiro() {
       
    }

    static void verificaExiste() {
        
    }

    static void escreveNoFinalFicheiro() {
        
    }

    static void escreveFicheiroNovo() {
        
    }

    static void mostraConteudoFicheiro() {
       
    }

    static void mostraListaFicheiros() {
        File ficheiro = new File("C:\\Users\\mneves\\Desktop\\Ficheiros\\Ficheiros\\Ficheiros");
        File [] lista = ficheiro.listFiles();
        System.out.println(">>>Lista de Ficheiros<<<");
        for(int x=0;x<lista.length;x++){
          System.out.println(lista[x].getName());  
        }
    }
    
}
