
public class ajuda{

public static final String versao="0.1.1";


static Video VIDEO = new Video();
static jps JPS = new jps();


public static void ajudajps(){

VIDEO.limpartela();

System.out.println("\nAjuda do JsP versao [" +JPS.versao+ "]\n");
System.out.println("---*---*---*---*---*---*---*---\n\n");
System.out.println("\najuda   - Exibe esta ajuda.");
System.out.println("\nsair    - Fecha o Java Power Shell (JpS).");
System.out.println("\ncc      - Inicia a calculadora interna basica do Java Power Shell (JpS).");
System.out.println("\nproc    - Exibe o PID da classe.");
System.out.println("\nver     - Exibe a versao do JpS.");
System.out.println("\ncls     - Limpa a tela.");
System.out.println("\najudam  - Exibe uma ajuda mais avancada.");
System.out.println("\n\n");

}

public static void ajudam(){



VIDEO.limpartela();

System.out.println("\nAjuda do JsP versao [" +JPS.versao+ "]\n");
System.out.println("---*---*---*---*---*---*---*---");
System.out.println("\nabrir -dev -app       - Abre um aplicativo em uma midia removivel.");
System.out.println("\nmodulos --ver -listar - Exibe a versao dos modulos.");
System.out.println("\nadmin --ativar --ni   - Inicia modo administrador supervisionado.");
System.out.println("\nadmin --desativar     - Desativa modo administrador.");
System.out.println("\n@echo off             - Desativa o echo.");
System.out.println("\n@echo on              - Ativa o echo.");
System.out.println("\n#define sis           - Muda a tag do Sistema Operacional.");
System.out.println("\n#obter sis            - Exibe a tag do Sistema Operacional.");
System.out.println("\najuda <comando>       - Exibe a ajuda do utilitario.");
System.out.println("\n@shell                - Muda a mensagem do Prompt.\n");

}


public static void proc(){

System.out.println("\n\nEste utilitario exibe o PID do JPS e de sua classe.\n\n");



}

}
