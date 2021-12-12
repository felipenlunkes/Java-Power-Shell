import java.io.*;
import java.*;


public class Video{

public static final String versao="0.1.1";

public static void modo() {
	 
util vars = new util();
String nomesis;
nomesis=vars.nomesistema();

if (nomesis == "Windows 7" | nomesis == "Windows Vista" | nomesis == "Windows XP" | nomesis == "Windows Xp" | nomesis == "Windows xp" | nomesis == "Windows xP"){


   try  
   {  
      Runtime r = Runtime.getRuntime ();  
      Process p = r.exec ("mode.com con cols=80 lines=25");  
      try  
      {  
         p.waitFor();  
      }  
      catch (InterruptedException ie) {
	  System.out.println("\n\nUma excecao foi gerada durante a execucao do sistema.\n\n");
	  System.out.println("Mensagem de retorno: " +ie.getMessage() + "\n\n");
	  }  
    }  
    catch (IOException ioe)  
    {  
       ioe.printStackTrace();  
     
}
}

if (nomesis == "Linux i386" | nomesis == "Linux x64" | nomesis == "Linux x86_x64") {


   try  
   {  
      Runtime r = Runtime.getRuntime ();  
      Process p = r.exec ("clear");  
      try  
      {  
         p.waitFor();  
      }  
      catch (InterruptedException ie) {
	  System.out.println("\n\nUma excecao foi gerada durante a execucao do sistema.\n\n");
	  System.out.println("Mensagem de retorno: " +ie.getMessage() + "\n\n");
	  }  
    }  
    catch (IOException ioe)  
    {  
       ioe.printStackTrace();  
     
}
}


}  

public void limpartela(){

util vars = new util();
String nomesis=vars.nomesistema();

for( int cont = 1; cont < 100; cont++ )  {
System.out.println(); 

}

if (nomesis == "Linux i386" | nomesis == "Linux x64" | nomesis == "Linux x86_x64") {


   try  
   {  
      Runtime r = Runtime.getRuntime ();  
      Process p = r.exec ("clear");  
      try  
      {  
         p.waitFor();  
      }  
      catch (InterruptedException ie) {
	  System.out.println("\n\nUma excecao foi gerada durante a execucao do sistema.\n\n");
	  System.out.println("Mensagem de retorno: " +ie.getMessage() + "\n\n");
	  }  
    }  
    catch (IOException ioe)  
    {  
       ioe.printStackTrace();  
     
}


}


}


}
