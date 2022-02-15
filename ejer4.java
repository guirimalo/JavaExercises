import java.util.Scanner;
public class ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la palabra que desea traducir: ");
        String pal = sc.next();
        System.out.println("Introduzca 1 para aleman y 2 para bulgaro: ");
        int idiom = sc.nextInt();
        traducirPalabra(pal, idiom);
    }
    public static void traducirPalabra(String pal, int idiom){
        char lastchar = pal.charAt(pal.length() - 1);
        boolean esvocal = isVocal(lastchar);
        if(esvocal)
            Vocal(pal,idiom);
        else
            Consonante(pal, idiom);
    }
    public static boolean isVocal(char y){
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
                || y == 'u')
            return true;
        else
            return false;
    }
    public static void Vocal(String pal, int x){
        String traducida="";
        if(x == 1){
            pal = pal.substring(0, pal.length()-1);
            traducida=pal+"ujem";
        }
        else
             traducida=pal+"kav";
        System.out.println("La palabra escrita es una vocal.");
        System.out.println("La palabra traducida seria "+traducida);
    }
    public static void Consonante(String pal, int x){
        String traducida="";
        if(x == 1){
            pal = pal.substring(0, pal.length()-2);
            traducida=pal+"ujem";
        }
        else {
            pal = pal.substring(0, pal.length()-1);
            traducida = pal + "kav";
        }
        System.out.println("La palabra traducida seria "+traducida);
        System.out.println("La palabra escrita es consonante.");
    }
}
