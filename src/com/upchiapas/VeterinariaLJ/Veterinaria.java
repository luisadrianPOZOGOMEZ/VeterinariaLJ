package com.upchiapas.VeterinariaLJ;
import com.upchiapas.VeterinariaLJ.Models.Carnet;
import com.upchiapas.VeterinariaLJ.Models.Dueno;
import com.upchiapas.VeterinariaLJ.Models.Mascota;
import com.upchiapas.VeterinariaLJ.Models.Producto;

import java.util.ArrayList;
import java.util.Scanner;
public class Veterinaria {

    static ArrayList<Producto> productoV= new ArrayList<>(0);
    static ArrayList<Carnet> GestionMascotas= new ArrayList<>(0);
    private static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("0. Salir");
            System.out.println("1. Vender productos");
            System.out.println("2. Crear consultas");
            System.out.println("3. Ventas totales");
            System.out.println("4. Historial de consultas");
            System.out.println("Elija una opcion: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println(" *** Que te vaya bonito ***");
                    break;
                case 1:
                    Comprar();
                    break;
                case 2:
                    AddMascota();
                    break;
                case 3:
                    VerVendido();
                    break;
                case 4:
                    CheckHistory();
                    break;
                default:
                    System.out.println("\n Esa opcion no esta en el menu...");
                    System.out.println("\n *** Vuelva a intentarlo ***");

                    break;
            }
        } while (opcion != 0);
    }

    public static void Comprar(){
        String nombre;
        int cantidad;
        int total1;
        int opcionC;
        int total;

        do{
            System.out.println("\n** Venta de producto **\n");
            System.out.println("Inserte el nombre del producto: ");
            nombre = entrada.next();
            System.out.println("Inserte el precio: ");
            total1 = entrada.nextInt();
            System.out.println("Inserte la cantidad de productos: ");
            cantidad = entrada.nextInt();

            total = total1*cantidad;
            Producto venta = new Producto(nombre,cantidad,total);
            venta.setNombre(nombre);
            venta.setTotal(total);
            venta.setCantidad(cantidad);
            venta.setPrecio(total1);
            productoV.add(venta);

            System.out.println("0. Dejar de añadir");
            System.out.println("1. Seguir añadiendo");
            opcionC = entrada.nextInt();

            if(opcionC !=0 && opcionC!=1)
                System.out.println(" ** Esa opcion no esta en el menu **\n");


        }while(opcionC == 1);
    }

    public static void VerVendido(){
        double precio = 0;
        for(int i = 0; i < productoV.size();i++){
            System.out.println("_____________________");
            System.out.println("Nombre del producto: " + productoV.get(i).getNombre());
            System.out.println("Precio: " +productoV.get(i).getPrecio());
            System.out.println("Cantidad de productos: " + productoV.get(i).getCantidad());
            System.out.println("Total: " + productoV.get(i).getTotal());
            precio = precio + productoV.get(i).getTotal();
        }
        System.out.println("* * * * * * * * * * * * *");
        System.out.println("Total reunido: " +"$"+precio);
        System.out.println("* * * * * * * * * * * * *");
    }
    public static void AddMascota(){
        Scanner textos = new Scanner(System.in);
        Scanner entrada= new Scanner(System.in);
        String aux1,aux2,nom;
        int num1;
        int dia=0,mes = 0,anio=0;
        int precio=0;
        int opcionC;

        do {

            System.out.println("Inserte el nombre de la mascota:");
            nom = entrada.next();
            System.out.println("Inserte el tipo de animal: ");
            aux2 = entrada.next();
            System.out.println("Inserte su folio: ");
            num1 = entrada.nextInt();
            System.out.println("\n ** Fecha de registro ** ");
            System.out.println("Inserte el dia: ");
            dia= entrada.nextInt();
            System.out.println("Inserte el mes: ");
            mes=entrada.nextInt();
            System.out.println("Inserte el año: ");
            anio=entrada.nextInt();
            System.out.println("ingrese el nombre del dueño: ");
            aux1 = entrada.next();
            System.out.println("Inserte el precio de la consulta:");
            precio=entrada.nextInt();
            Mascota mascota = new Mascota(nom,aux2,num1,dia,mes,anio,precio);
            System.out.println("Inserte que es lo que tiene la mascota: ");
            mascota.setDiagnostico(textos.nextLine());
            System.out.println("\n0. Dejar de añadir");
            System.out.println("1. Seguir añadiendo");
            opcionC = entrada.nextInt();

            System.out.println(" \n *** Registro exitoso ***\n");
            Dueno dueno = new Dueno(aux1);
            Carnet carnet = new Carnet(dueno,mascota);
            GestionMascotas.add(carnet);

            if(opcionC !=0 && opcionC!=1)
                System.out.println("** Esa opcion no esta en el menu **\n");


        }while(opcionC == 1);
    }
    public static void CheckHistory(){
        int preci = 0;
        System.out.println("---------------------------------------------------------------------------");
        for(int i = 0; i < GestionMascotas.size();i++){
            System.out.println( "Nombre de la mascota: "+ GestionMascotas.get(i).getMascota().getNombre());
            System.out.println("Folio de la mascota: " + GestionMascotas.get(i).getMascota().getFolio());
            System.out.println("Especie: "+ GestionMascotas.get(i).getMascota().getTipo());
            System.out.println("Fecha de visita: "+ GestionMascotas.get(i).getMascota().getDia()+"/"+GestionMascotas.get(i).getMascota().getMes()+"/"+GestionMascotas.get(i).getMascota().getAnio());
            System.out.println("Precio de la consulta: "+"$"+GestionMascotas.get(i).getMascota().getPreci());
            System.out.println("Nombre del dueño: " + GestionMascotas.get(i).getDueno().getNombre());
            System.out.println("__________________________________________________________________________");
            System.out.println("Padecimiento de la mascota :" + GestionMascotas.get(i).getMascota().getDiagnostico());
            System.out.println("---------------------------------------------------------------------------");

            preci=preci+GestionMascotas.get(i).getMascota().getPreci();
        }
        System.out.println("\n* * * * * * * * * * * * *");
        System.out.println("Total reunido: " +"$"+preci);
        System.out.println("* * * * * * * * * * * * *\n");
    }

}

