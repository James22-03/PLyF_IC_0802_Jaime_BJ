#include<stdio.h>
#include<conio.h>
#include<string.h>

typedef struct  {
    char nombre [20];
    char apellidos [30];
    int edad;
    char genero;
} Persona ;

void Hablar( Persona p){
    printf("Hola ni nombre es: %s %s\n",p.nombre,p.apellidos);
    printf("Tengo: %i\n",p.edad);
}

void Caminar(){
    printf("Creo que caminare ahora\n");
}

void Comer(){
    printf("Ya camine mucho es hora de almorzar\n");
}

void Dormir(){
    printf("Suficiente por hoy...zzzzzzz\n");
}

int main(){
    Persona  pe;
    strcpy(pe.nombre,"Juan");
    strcpy(pe.apellidos,"Lopez Gonzalez");
    pe.edad=21;
    pe.genero='M';    
    Hablar(pe);
    Caminar();
    Comer();
    Dormir();
    getch();
    return 0;
}