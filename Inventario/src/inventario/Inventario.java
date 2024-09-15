

package Inventario;

import java.util.Scanner;
public class Inventario {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        String producto, codigo1="P01", codigo2="P02", codigo3="P03", codigo4="P04",
               descripcion1="Lapiz", descripcion2="Borrador", descripcion3="Tajador", descripcion4="Cuaderno",
               operacion;
               
        Integer cant, cantidad1=54, cantidad2=32, cantidad3=76, cantidad4=65, toperacion=0;
      
        
        System.out.println("SELECCIONE OPERACION\n"
                + "(I)Ingreso\n"
                + "(S)Salida\n"
                + "(C)Consulta de Stock");
        operacion=scanner.nextLine().toUpperCase();
        
        
        switch(operacion){
            case "I":
                System.out.println("\nSELECCIONE EL TIPO DE INGRESO\n"
                + "(1)Compra\n"
                + "(2)Produccion\n"
                + "(3)Devoluacion");
                toperacion=scanner.nextInt();
                scanner.nextLine();
                if(toperacion<1 || toperacion>3){
                    System.out.println("\nTIPO DE OPERACION INVALIDO");
                }
                break;
            case "S":
                System.out.println("\nSELECCIONE EL TIPO DE SALIDA\n"
                + "(1)Venta\n"
                + "(2)Produccion\n"
                + "(3)Fallado");
                toperacion=scanner.nextInt();
                scanner.nextLine();
                if(toperacion<1 || toperacion>3){
                    System.out.println("\nTIPO DE OPERACION INVALIDO");
                }
                break;
            case "C":
                String consulta="%nLISTA DE PRODUCTOS Y STOCK ACTUAL%n%n"
                + "%-20s %-20s %-20s%n"
                + "%-20s %-20s %4d%n"
                + "%-20s %-20s %4d%n"
                + "%-20s %-20s %4d%n"
                + "%-20s %-20s %4d%n";
                System.out.printf(consulta,
                "CODIGO", "DESCRIPCION","STOCK",
                codigo1,descripcion1 ,cantidad1,
                codigo2,descripcion2 ,cantidad2,
                codigo3,descripcion3 ,cantidad3,
                codigo4,descripcion4 ,cantidad4);
                break;
            default:
                System.out.print("\nOPCION INVALIDA");
                break;
        }
        
        if (operacion.equals("I") && toperacion>=1 && toperacion<=3) {
            System.out.println("Ingrese el codigo del producto: ");
            producto=scanner.nextLine().toUpperCase();
            System.out.println("Ingrese la cantidad: ");
            cant=scanner.nextInt();
            scanner.nextLine();
            
            switch (producto) {
                case "P01":
                    cantidad1=cantidad1+cant;
                    System.out.println("El nuevo stock de producto "+codigo1+" es de: "+cantidad1);
                    break;
                case "P02":
                    cantidad2=cantidad2+cant;
                    System.out.println("El nuevo stock de producto "+codigo2+" es de: "+cantidad2);
                    break;
                case "P03":
                    cantidad3=cantidad3+cant;
                    System.out.println("El nuevo stock de producto "+codigo3+" es de: "+cantidad3);
                    break;
                case "P04":
                    cantidad4=cantidad4+cant;
                    System.out.println("El nuevo stock de producto "+codigo4+" es de: "+cantidad4);
                    break;
                default:
                    System.out.println("\nCODIGO INVALIDO");
                    break;
            }
            
        }else if (operacion.equals("S") && toperacion>=1 && toperacion<=3){
            System.out.println("Ingrese el codigo del producto: ");
            producto=scanner.nextLine().toUpperCase();
            System.out.println("Ingrese la cantidad: ");
            cant=scanner.nextInt();
            scanner.nextLine();
            switch (producto) {
                case "P01":
                    if (cant <=cantidad1){
                        cantidad1=cantidad1-cant;
                        System.out.println("El nuevo stock de producto "+codigo1+" es de: "+cantidad1);
                    }else{
                        System.out.println("La cantidad ingresada supera al Stock");
                    }
                    break;
                case "P02":
                    if (cant <=cantidad2){
                        cantidad2=cantidad2-cant;
                        System.out.println("El nuevo stock de producto "+codigo2+" es de: "+cantidad2);
                    }else{
                        System.out.println("La cantidad ingresada supera al Stock");
                    }
                    break;
                case "P03":
                    if (cant <=cantidad3){
                        cantidad3=cantidad3-cant;
                        System.out.println("El nuevo stock de producto "+codigo3+" es de: "+cantidad3);
                    }else{
                        System.out.println("La cantidad ingresada supera al Stock");
                    }
                    break;
                case "P04":
                    if (cant <=cantidad4){
                        cantidad4=cantidad4-cant;
                        System.out.println("El nuevo stock de producto "+codigo4+" es de: "+cantidad4);
                    }else{
                        System.out.println("La cantidad ingresada supera al Stock");
                    }
                    break;
                default:
                    System.out.println("\nCODIGO INVALIDO");
                    break;
            }
        }
    }  
}
