
public class cominternos extends jps{

public static final String versao="0.1.1";
private static final String autor="Felipe Miguel Nery Lunkes";

modulos MOD = new modulos();
jps JPS = new jps();
static int comnum;
static String [] com = new String[10];

public static void comandos(String coma){


int x;

for (x=0; x<=9; x++){

if (com[x] == null){
x++;
}

if (com[x] != null){
com[x] = coma;
comnum=x;
}

}
}

public static String getComando(){

return (com[comnum]);


}

public static void Anteriores(){

int x;

System.out.println("\n\n");

for (x=0; x<=9; x++){

System.out.println("Comando usado numero " +x+ ": " +com[x]+ "\n");

}
}

}
 