import java.util.*;
import java.io.*;
import java.lang.*;
import java.*;

public class util extends jps{

static String banner = "Biblioteca UTIL Versão 0.1.1";

public static final String versao="0.1.1";

private boolean ativado = true;

private String comp = "Componente do JpS";

public void setPrompt(String prompta, String separar, String prompt){

this.prompta=prompta;
this.separar=separar;
this.prompt=prompt;
this.prompt=this.prompta+this.separar;

}

public void setCmd(String comando){

this.cmdantigo=this.comando;

}

public String getCmd(){

return this.cmdantigo;

}

public void setAdmin(boolean admin){

this.admin=admin;

if (this.admin == false){
System.out.println("\nModo administrador desabilitado.\n");
}
else {
System.out.println("\nModo de administrador ativado.\n");
}

if (this.admin == false){
this.manifestoadmin="Sem manifesto de administrador para executar processos.";
}
else {
this.manifestoadmin="Manifesto de administrador ativado.";
}

}

public void excecaostring(int tamcmd){

if (this.tamcmd > 64) {
    throw new IllegalArgumentException("Voce ultrapassou o limite de caracteres maximo do JsP.");
	}
	
	else {
	this.tamcmd=0;
	}
	


}

public String nomesistema(){

this.SO=System.getProperty("os.name");  


return (SO);


}

public String archsistema(){

this.arch=System.getProperty("os.arch");

return (arch);

}

public void memtotal(){

//public static long MemTotal=Runtime.getRuntime().totalMemory()/1024;

     System.out.println("Memoria total: "+Runtime.getRuntime().totalMemory()/1048576+" Megabytes.");    
     System.out.println("Memoria disponivel para o JsP: "+Runtime.getRuntime().freeMemory()/1048576+" Megabytes."+ "\n");

	   
	   }
	  
public void pasta(){

System.out.println("Pasta do JsP: " +System.getProperty("class.path"));

}	  

public String getUsuario(){

this.usuario=System.getProperty("user.name");

return (usuario);

}


}