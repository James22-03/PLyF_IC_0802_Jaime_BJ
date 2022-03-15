public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private char genero;
 
    //Metodos get y set
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
 
    public void setApellidos(String nombre) {
        this.apellidos = apellidos;
    }
 
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
 
    public double getGenero() {
        return genero;
    }
 
    //Constructor por defecto
    public Persona(){
        this.nombre="";
        this.apellidos="";
        this.edad=0;
        this.genero=' ';
    }
 
    //Constructor con parametros
    public Persona(String nombre, String apellidos, int edad, char genero){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
        this.genero=genero;
    }

    public void Hablar(String n,String a, int e){
        System.out.println("Hola! Mi nombre es " + n + " " + a + " tengo " + e + " años");
    }
    public void Comer(){
        System.out.println("Es hora de almorzar !!");
    }
    public void Caminar(){
        System.out.println("Creo que caminare ahora");
    }
    public void Dormir(){
        System.out.println("Suficiente por hoy...zzzzzz");
    }

    //Funcion principal
    public static void main(String[] args) {
        Persona p1=new Persona ("Fernando", "Ureña", 23, ' ');
        p1.setNombre("Alejandro");
        p1.Hablar(p1.nombre,p1.apellidos,p1.edad);
        if (p1.getGenero()=='M'){
            System.out.println("Genero: Soy hombre xD");
        }else if (p1.getGenero()=='F'){
            System.out.println("Genero: Soy mujer xD");
        }else{
            System.out.println("Genero: Prefiero no decirlo");
        }
        p1.Comer();
        p1.Caminar();
        p1.Dormir();
        }
    }
