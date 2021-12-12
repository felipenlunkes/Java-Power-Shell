
public class MATH{

static final String versao="0.1.1";

var VAR = new var();

jps JPS = new jps();
util UTIL = new util();
Video VIDEO = new Video();

public static double pow(double a, double b){

double ret=0;

if (b == 2){
ret=a*a;
}

if (b == 3){
ret=a*a*a;
}

if (b == 4){
ret=a*a*a*a;
}

if (b == 5){
ret=a*a*a*a*a;
}

if (b == 6){
ret=a*a*a*a*a*a;
}

if (b == 7){
ret=a*a*a*a*a*a*a;
}

if (b == 8){
ret=a*a*a*a*a*a*a*a;
}

if (b == 9){
ret=a*a*a*a*a*a*a*a*a;
}


if (b == 10){
ret=a*a*a*a*a*a*a*a*a*a;
}

return (ret);

}

public static boolean par(int num){

if (num%2==0){
return true;
} else {
return false;
}
}

public static double Soma(double a, double b){

double retorno=a+b;

return (retorno);

}

public static double Multi(double a, double b){

double retorno=a*b;

return (retorno);

}

public static double Divisao(double a, double b){

double retorno=a/b;

return (retorno);

}

public static double Subtracao(double a, double b){

double retorno=a-b;

return (retorno);

}



}