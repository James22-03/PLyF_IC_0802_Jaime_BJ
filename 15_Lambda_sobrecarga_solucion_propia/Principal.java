public class Principal {
    public static void main(String[] args) {
        System.out.println("==> Engine (1) --> resultado = " + Principal.engine().calcular(5, 5));
        Principal.engine((int x, int y)->(long x1,long y2)->x1/y2);
    }
    private static Cal_Int engine(){
        return (x, y) -> x * y;
    }
    private static void engine(CalculadoraInt cal){
        int x=2,y=4;
        CalculadoraLong resultado = cal.calcular(x,y);
        System.out.println("==> Engine (2) --> resultado = " + resultado.calcular((long)x, (long)y));
    }

}
