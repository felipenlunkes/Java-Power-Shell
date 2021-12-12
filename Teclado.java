import java.util.Scanner;

public class Teclado extends jps{

static final String versao="0.1.1";
public static String CMD(){

Scanner entrada = new Scanner(System.in);
String tmp = entrada.nextLine();
			
return(tmp);

}

public static int Fn(){

Scanner entrada = new Scanner(System.in);
int tmp = entrada.nextInt();

return (tmp);

}

public static int Int(){

Scanner leitura = new Scanner(System.in);

int tmp=leitura.nextInt();

return (tmp);

}

public static double Double(){

Scanner leitura = new Scanner(System.in);

double tmp=leitura.nextDouble();

return (tmp);

}

}