//clase principal
import java.util.Scanner; 
public class Principal
{
    public static void main (String[]arg){
        Scanner sc= new Scanner(System.in); //creamos la instancia del scanner
        String respuesta="";  //Creacion de la variable que almacenará la respuesta del usuario.
        Nodo nodo = new Nodo(); //Creacion de un objeto de la clase Nodo
        while(!respuesta.equals("6")){ //comparamos lo que hay en la variable respuesta con un 6
            System.out.println("---- Menú ----");  //imprimimos el menú y las opciones
            System.out.println("1 Insertar");
            System.out.println("2 Mostrar");
            System.out.println("3 Buscar");
            System.out.println("4 Eliminar");
            System.out.println("5 Contar");
            System.out.println("6 Terminar");
            
            System.out.println("Elije la opción "); //Solicitamos la respuesta al usuario
            respuesta=sc.nextLine();// Leemos la respuesta y lo almacenamos en la variable

            switch(respuesta) //Según la respuesta seran las acciones que se ejecuten
            {case "1": //opción 1
                System.out.println("Ingresa el valor: "); //solicita el valor a almacenar
                Object valor=sc.nextLine(); //se guarada en una variable de tipo objeto que puede almacenar cualquier tipo de dato
                nodo.agregarElemento(valor);// se manda a llamar el método para agregar un nuevo elemento a la lista
                break;
                case "2"://opción 2
                nodo.listar(); //se manda a llamar el método para mostrar la lista
                break;
                case "3": //opción 3
                System.out.println("Ingresa la posición en la que desea buscar ");//solicita el valor a buscar
                int posicion=sc.nextInt();//se guarada en una variable de tipo int
                System.out.println(nodo.BuscarPosicion(posicion));// se manda a llamar el método para buscar en la posición solicitada
                break;
                case "4"://opción 4
                System.out.println("Elije la posición en la que desea Eliminar ");//solicita el valor a eliminar
                posicion=sc.nextInt(); //se guarada en una variable de tipo int
                System.out.println(nodo.EliminarPosicion(posicion));// se manda a llamar el método para eliminar en la posición solicitada
                break;
                case "5"://opción 5
                System.out.println("El tamaño actual de la lista es: " + nodo.MostarTamaño());// se manda a llamar el método para motrar el tamaño de la lista
                break;
                case "6"://opción 6
                System.out.println("Adios!!");//imprime en pantalla el mensaje y terminara el programa
                break;
                default: //en caso de que ingrese otra opción mandara el mensaje
                System.out.println("Error no existe la opcion");
                break;
            }
        }
    }
}
