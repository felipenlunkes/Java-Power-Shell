import javax.swing.*;
import java.lang.*;
import java.io.*;

public class modulos extends var{

public static String assinatura;

public static final String versao="0.1.1 [L]";

private static final String autor="Felipe Miguel Nery Lunkes";

public static void carregarModulos(){

jps JPS = new jps(); // Instancia classe principal em busca dos símbolos
proc EXAMINE = new proc(); // Instancia inicialmente a classe proc para validar o restante

System.out.println("Alocando Memoria RAM necessaria... [Pronto]\n");
System.out.println("Montando diretorio temporario... [Pronto]\n");
System.out.println("Obtendo variaveis do " +JPS.SO+ "... [Pronto]\n");
System.out.println("Verificando modulos do sistema...\n");


Teclado teclado = new Teclado(); // Carrega o módulo Teclado
Video VIDEO = new Video(); // Carrega o módulo Video
MATH math = new MATH(); // Carrega o módulo MATH
util vars = new util(); // Carrega o módulo util
ajuda AJUDA = new ajuda(); // Carrega o módulo de ajuda
proc PROC = new proc(); // Carrega o módulo de processos
cominternos COM = new cominternos(); // Carrega o módulo cominternos
var VARS = new var(); // Carrega o módulo var

System.out.println("Modulos encontrados [Pronto]\n");
System.out.println("Obtendo versao do JPS... [Pronto] -> ["+JPS.versao+"]\n");

if ((vars.versao.equals(JPS.versao))){
System.out.println("JPS -> "+JPS.versao+" <- Util    | Modulo ativado\n");
} else {
System.out.println("\nAs versoes do JPS e da biblioteca Util nao combinam!\n");
System.out.println("Incompatibilidades podem ocorrer.\n\n");
}

if ((VIDEO.versao.equals(JPS.versao))){
System.out.println("JPS -> "+JPS.versao+" <- Video   | Modulo ativado\n");
} else {
System.out.println("\nAs versoes do JPS e da biblioteca Video nao combinam!\n");
System.out.println("Incompatibilidades podem ocorrer.\n\n");
}

if ((VARS.versao.equals(JPS.versao))){
System.out.println("JPS -> "+JPS.versao+" <- var     | Modulo ativado\n");
} else {
System.out.println("\nAs versoes do JPS e da biblioteca var nao combinam!\n");
System.out.println("Incompatibilidades podem ocorrer.\n\n");
}

if ((PROC.versao.equals(JPS.versao))){
System.out.println("JPS -> "+JPS.versao+" <- proc    | Modulo ativado\n");
} else {
System.out.println("\nAs versoes do JPS e da biblioteca proc nao combinam!\n");
System.out.println("Incompatibilidades podem ocorrer.\n\n");
}

if ((AJUDA.versao.equals(JPS.versao))){
System.out.println("JPS -> "+JPS.versao+" <- ajuda   | Modulo ativado\n");
} else {
System.out.println("\nAs versoes do JPS e da biblioteca ajuda nao combinam!\n");
System.out.println("Incompatibilidades podem ocorrer.\n\n");
}

if ((teclado.versao.equals(JPS.versao))){
System.out.println("JPS -> "+JPS.versao+" <- Teclado | Modulo ativado\n");
} else {
System.out.println("\nAs versoes do JPS e da biblioteca Teclado nao combinam!\n");
System.out.println("Incompatibilidades podem ocorrer.\n\n");
}

if ((math.versao.equals(JPS.versao))){
System.out.println("JPS -> "+JPS.versao+" <- MATH    | Modulo ativado\n");
} else {
System.out.println("\nAs versoes do JPS e da biblioteca MATH nao combinam!\n");
System.out.println("Incompatibilidades podem ocorrer.\n\n");
}
System.out.println("Carregando modulos...  [Pronto!]\n");

}

public static void matarModulos(){

/* 

Em progresso :)

*/

}



}