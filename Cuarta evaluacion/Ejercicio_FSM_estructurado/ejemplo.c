#include <stdio.h>
#include <stdlib.h>
//Declaración de estados
#define goNorte 0
#define waitNorte 1
#define goEste 2
#define waitEste 3

//Declaración de transiciones
#define t00 0
#define t01 1
#define t10 2
#define t11 3

//Estado inicial
int estado=goNorte;

//Conjunto de entradas que recibira la maquina
int eventos[11]={t00,t01,t01,t10,t11,t00,t00,t01,t11,t10,t10};

int main(int argc, char const *argv[]){
    int i=0;
    while (i<11){//Comprueba la posición del los estados
        switch (eventos[i]){//Si la transción se cumple imprimirá el estado en que se encuentra
            case t00:
                if(estado==goNorte){
                    estado=goNorte;
                    printf("goNorte\n");
                }else if (estado==waitNorte){
                    estado=goEste;
                    printf("goEste\n");
                }else if(estado==goEste){
                    estado=goEste;
                    printf("goEste 3s\n");
                }else if (estado==waitEste){
                    estado=goNorte;
                    printf("goNorte\n");
                }
                break;
            case t01:
                if(estado==goNorte){
                    estado=waitNorte;
                    printf("waitNorte\n");
                }else if (estado==waitNorte){
                    estado=goEste;
                    printf("goEste\n");
                }else if(estado==goEste){
                    estado=goEste;
                    printf("goEste\n");
                }else if (estado==waitEste){
                    estado=goNorte;
                    printf("goNorte\n");
                }
                break;
            case t10:
                if(estado==goNorte){
                    estado=goNorte;
                    printf("goNorte\n");
                }else if (estado==waitNorte){
                    estado=goEste;
                    printf("goEste\n");
                }else if(estado==goEste){
                    estado=waitEste;
                    printf("waitEste\n");
                }else if (estado==waitEste){
                    estado=goNorte;
                    printf("goNorte\n");
                }
                break;
            case t11:
                if(estado==goNorte){
                    estado=waitNorte;
                    printf("waitNorte\n");
                }else if (estado==waitNorte){
                    estado=goEste;
                    printf("goEste\n");
                }else if(estado==goEste){
                    estado=waitEste;
                    printf("waitEste\n");
                }else if (estado==waitEste){
                    estado=goNorte;
                    printf("goNorte\n");
                }
                break;
            default:
                break;
        }
        //Cuando se cumpla la transicion la maquina avanzara al siguiente estado hasta salir de la maquina
        i++;
    }    
    return 0;
}