import java.lang.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class proc extends var{

public static final String versao="0.1.1";

static jps JPS = new jps();
static modulos MOD = new modulos();



public static String obterPID(){


String assinatura=JPS.toString();
String assinatura2=MOD.toString();
MOD.assinatura=assinatura2;

return (assinatura);

}

public static void verificar(){

int mostrarPID=1;
String PID;
JPS.PID=obterPID();
PID=JPS.PID;


if (mostrarPID == 1){

System.out.println("\nPID da classe: " +JPS.PID+ "\n\n");

}

if (JPS.PID != PID){

System.out.println("\n\nO PID da classe JpS nao combina.\n");
System.out.println("Isto quer dizer que a classe JpS pode ter sido alterada");
System.out.println("ou violada e codigo malicioso pode ter sido injetado.\n\n");
System.out.println("Sendo assim, para prevenir qualquer dano ao seu computador,\n");
System.out.println("o restante dos modulos nao serao carregados e nem executados.\n\n");
Violado();

}



//if (JPS.magico != 29862){

//System.out.println("\n\nO numero magico do JpS nao combina.\n");
//System.out.println("Isto quer dizer que a classe JpS pode ter sido alterada");
//System.out.println("ou violada e codigo malicioso pode ter sido injetado.\n\n");
//System.out.println("Sendo assim, para prevenir qualquer dano ao seu computador,\n");
//System.out.println("o restante dos modulos nao serao carregados e nem executados.\n\n");
//Violado();

//}



}

public static void Violado(){

for(;;);

}




}
