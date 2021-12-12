import java.io.*;
import java.lang.*;
import java.*;
import javax.swing.*;
import java.awt.Cursor; 
import java.awt.FlowLayout;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import javax.swing.*;

public class jps extends modulos {

/* Esta constante indica a versão da classe.

Se a mesma for alterada, todas as outras devem ser alteradas, para compatibilidade.

*/

static final String versao = "0.1.1";
public static long magico=29862;
static final String autor = "Felipe Miguel Nery Lunkes";
static final double data = 0.6;
static String prompta;
static String separar;
static String BackupPrompt;
JFrame janela = new JFrame();  
JLabel jlUsuario = new JLabel("Usuário:");  
JLabel jlSenha = new JLabel("Senha:");  
JTextField jtUsuario = new JTextField(40);  
JPasswordField jpSenha = new JPasswordField(40);  
JButton jbConferir = new JButton("Acessar");  
JButton jbSair = new JButton("Sair");
JButton jbAnonimo = new JButton("Anonimo");
static String prompt;
static String cmdantigo;
static String comando;
static String Backupnomesis;
static boolean admin;
static String manifestoadmin;
static int tamcmd;
static String SO;
static final String PromptInicial="Jps:/>";
static String PID;
static String arch;
static String usuario;



public static void main(String [] args){

util vars = new util();
vars.nomesistema();

/* 

Procura Bandeira de Adminitrador ao ser iniciado

*/

vars.setAdmin(false); // Desliga o modo de administrador

mainchamar(); // Chama o método realmente principal

}


public static void mainchamar(){

util vars = new util();

carregarModulos();  // Chama carregarModulos() para carregar os outros módulos necessários

BackupPrompt="Jps:/>"; // Valor inicial do Prompt
vars.setPrompt("JpS:/>"," ","");  // Valor a ser definido para Prompt

init(); // Chama o processo principal init(), que carrega e configura os módulos

}


public static void init(){

int retorno=boasvindas();
retorno=executarSHELL();

}


public static int boasvindas(){

util vars = new util();
Video video = new Video();

for( int cont = 1; cont < 100; cont++ )  
System.out.println(); 


vars.setPrompt("JpS:/>"," ",""); 
vars.nomesistema(); // Obtêm o nome do sistema operacional
vars.archsistema(); // Obtêm a arquitetura do sistema operacional
vars.getUsuario();  // Obtêm o nome do usuário que executou o JPS
Backupnomesis=SO;
video.modo();       // Altera o modo de vídeo ( Apenas Windows )
    
System.out.println("Java Power Shell para " +SO+ " " +arch+ " versao ["+versao+"]");
System.out.println("\nCopyright (C) 2013 Felipe Miguel Nery Lunkes\n");
System.out.println("Executado pelo usuario: " +usuario+ "\n");
System.out.println(manifestoadmin+ "\n");
vars.memtotal(); // Obtêm o valor de memória RAM alocada

return 0;

}


public static int executarSHELL(){

util vars = new util();
Video VIDEO = new Video();
Teclado TECLADO = new Teclado();
MATH math = new MATH();
cominternos COM = new cominternos();
modulos MOD = new modulos();
ajuda AJUDA = new ajuda();

vars.setPrompt(BackupPrompt,"","");

			System.out.print(prompt);
            String cmd = Teclado.CMD();
			
			COM.comandos(cmd);
     

//*****************************************************************************

	 
/*

Comandos internos

*/

/* Este local contém os comandos internos do programa */ 


//*****************************************************************************


//



if ((cmd.equals("ver"))){
System.out.println("\nJava Power Shell Versao ["+versao+"]\n");
System.out.println("Desenvolvido por Felipe Miguel Nery Lunkes\n\n");
executarSHELL();
}

//



if ((cmd.equals("modulos --ver -listar"))){
System.out.println("\nVersao do carregador de Modulos: [" +MOD.versao+ "]\n");
System.out.println("Versao do modulo de Video: [" +VIDEO.versao+ "]\n");
System.out.println("Versao do modulo de Teclado: [" +TECLADO.versao+ "]\n");
System.out.println("Versao do modulo Matematico: [" +math.versao+ "]\n");
System.out.println("Versao do modulo de utilidades: [" +vars.versao+ "]\n");
System.out.println("Versao do modulo de ajuda: [" +AJUDA.versao+ "]\n\n");
System.out.println("Versao do JPS: [" +versao+ "]\n\n");
executarSHELL();
}

//



if ((cmd.equals("ajuda"))){
AJUDA.ajudajps();
executarSHELL();
}

//



if ((cmd.equals("ajudam"))){
AJUDA.ajudam();
executarSHELL();
}

//



if ((cmd.equals("cls"))){
VIDEO.limpartela();
executarSHELL();
}

//


if ((cmd.equals("sair"))){
sair();
}

//



if ((cmd.equals("admin --ativar --ni") | cmd.equals("admin --ativar --novainstancia"))){
vars.setAdmin(true);
init();
}

//



if ((cmd.equals("retornar --main --tracar"))){
init();
}

//



if ((cmd.equals("retornar --SHELL --tracar"))){
executarSHELL();
}

if (admin == false){

if ((cmd.equals("admin --desativar"))){
System.out.println("\n\nVoce nao possui privilegios de administrador para essa operacao.\n\n");
executarSHELL();
}
}

if (admin == true){

if ((cmd.equals("admin --desativar"))){
vars.setAdmin(false);
init();
}

}

//



if ((cmd.equals("abrir -dev -app"))){
System.out.println("\n\nAbrir aplicativos em outras midias removiveis\n");
System.out.println("---*---*---*---*---*---*---*---*---*---*---*---\n\n");
System.out.println("Use esta opcao para abrir programas em outras midias.\n");
System.out.println("Nota: O nome do dispositivo a seguir se difere em diferentes\n");
System.out.println("sistemas operacionais. Exemplo: Windows (F:) - Linux (/mnt/cdrom)\n\n");
System.out.println("Pressione ENTER para sair...\n");
System.out.print("Insira o nome do dispositivo (Exemplo: C: ou /mnt/cdrom): ");
String dev = Teclado.CMD();
System.out.print("\nInsira o nome do aplicativo ou arquivo: ");
String app = Teclado.CMD();

if (dev == null && app == null | dev != null && app == null){
executarSHELL();
}

cmd=dev+app;

System.out.println("\n"+cmd);

}

//



if ((cmd.equals("@echo off"))){
vars.setPrompt("","","");
BackupPrompt="";
System.out.println("\n");
executarSHELL();
}

//



if ((cmd.equals("#define sis"))){
System.out.print("\nMudar nome do sistema operacional (ID = [" +SO+ "]) para: ");
String nomesisnovo=Teclado.CMD();
if (nomesisnovo == null){
SO=Backupnomesis;
} else {
SO=nomesisnovo;
}
System.out.println("\n\n");
executarSHELL();
}

if ((cmd.equals("#obter sis"))){
System.out.println("\nNome do sistema operacional(ID): " +SO+ "\n\n");
executarSHELL();
}

//



if ((cmd.equals("@shell"))){
System.out.print("\nMudar prompt para: ");
String para=Teclado.CMD();
System.out.println("\n");
if ((para.equals("padrao"))){
BackupPrompt=PromptInicial;
vars.setPrompt(PromptInicial,"","");
} else {
BackupPrompt=para;
vars.setPrompt(para,"","");
}
executarSHELL();
}

//



if ((cmd.equals("cc"))){
double total=0;

System.out.println("\n\nCalculadora Basica do JpS versao [" +versao+ "]\n");
System.out.println("---*---*---*---*---*---*---*---*---*---*---\n\n");
System.out.print("Insira o primeiro numero: ");
double a=Teclado.Double();
System.out.print("\nInsira o segundo numero: ");
double b=Teclado.Double();
System.out.print("\nInsira a operacao: [+] [-] [*] [/]: ");
String opt=Teclado.CMD();

if ((opt.equals("/"))){

if (a == 0 | b == 0){
System.out.println("\nImpossivel realizar divisao por 0!\n\n");
executarSHELL();
} else {
total=math.Divisao(a,b);

}}

if ((opt.equals("+"))){
total=math.Soma(a,b);
}

if ((opt.equals("-"))){
total=math.Subtracao(a,b);
}

if ((opt.equals("*"))){
total=math.Multi(a,b);
}

System.out.println("\n\nResultado da operacao " +a+ " " +opt+ " " +b+ " = " +total);
System.out.println("\n");

executarSHELL();

}

//



if ((cmd.equals("@echo on"))){
BackupPrompt=PromptInicial;
vars.setPrompt(PromptInicial,"","");
System.out.println("\n");
executarSHELL();
}

//


if ((cmd.equals("pasta"))){
vars.pasta();
executarSHELL();
}

if ((cmd.equals("proc"))){
System.out.println("\n\nPID: " +PID+ "\n\n");
executarSHELL();
}


if ((cmd.equals("ajuda proc"))){
AJUDA.proc();
executarSHELL();
}


//



if ((cmd.equals("Testes --lib *MATH"))){
double ret;
boolean par;
ret=math.pow(2,5);
par=math.par(5);
System.out.println("\n\n2 elevado a 5 e igual a: "+ret);
if (par == false){
System.out.println("\nO numero e impar!\n");
} else {
System.out.println("\nO numero e par!\n");
}
executarSHELL();
}

//



if ((cmd.equals("com --antigos"))){

COM.Anteriores();
executarSHELL();

}

/* Fim dos comandos internos */


/*

Comandos internos

*/			
			    
prompt=prompta+" Exec (Grafico) "+cmd+".exe "+separar;	

System.out.println("\n" +prompt+ "\n");		
			
			
			try {
                Runtime rt = Runtime.getRuntime();
     
                Process pr = rt.exec(cmd);

                BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));

                String line=null;

                while((line=input.readLine()) != null) {
                    
                }

                int exitVal = pr.waitFor();
                System.out.println("Processo finalizado com o codigo de erro: " +exitVal+ "\n");
				
				if (exitVal > 0){
				System.out.println("Este processo pode ter sido fechado tendo como causa erros.\n");
				}

            } catch(Exception e) {
			
			System.out.println("\nO aplicativo ou servico interno nao existe ou esta corrompido.\n\n");
             
            }
			
			vars.setCmd(cmd);
			executarSHELL();
			return 0;
        }
		
public static void sair(){

for(;;);

}		
		

		}

