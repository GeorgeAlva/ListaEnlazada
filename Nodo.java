//Clase Nodo donde se generan los metodos para las acciones de la clase principal
import java.util.Scanner;
public class Nodo
{
    private Object valor; //Creacion de la variable objecto que almacena cualquier tipo de dato
    private Nodo siguiente; //Creacion de la variable de tipo Nodo para pasar al siguiente de la lista
    private int Tamaño; //creación de la variable de tipo int que llevara el tamaño actual de la lista
    private Nodo Cabecera; //creacion de la variable que servira para la cabecera del valor
    //Cración del constructor de la clase donde se le asignan los valores iniciales
    public void Nodo(){
        this.valor=0;
        this.siguiente=null;
        this.Tamaño=0;
        this.Cabecera=null;
    }
    //creación de los métodos Set y get de las variables
    public void setValor(Object valor){
        this.valor=valor;
    }
    public Object getValor(){
        return this.valor;  
    }
    public void setSiguiente(Nodo siguiente){
        this.siguiente=siguiente;
    }
    public Nodo getSiguiente(){
        return  this.siguiente;
    }
    //método para mostrar el tamaño que tiene la lista
    public int MostarTamaño(){
        return Tamaño;
    }
    //método para saber si la lista esta vacia o no
    public boolean esVacia(){
        return Cabecera==null;
    }
    //método para agregar un nuevo elemento a la lista con un parametro solicitado en la clase principal
    public void agregarElemento(Object valor){
        Nodo nuevo = new Nodo(); //se crea un nuevo objeto de la clase
        Scanner sc = new Scanner(System.in); //se crea la instancia del Scanner
        nuevo.setValor(valor);//el objeto se le almacena el valor que recibe
        if(esVacia()){ //si la lista esta vacia se coloca la cabecera en la posicion inicial con el valor agregado 
            Cabecera=nuevo;
        }else{
            nuevo.setSiguiente(Cabecera); // si la lista tiene datos se recorren al siguinete nodo
            Cabecera=nuevo;// y se le asigna como valor inicial el valor ingresado 
        }
        Tamaño++;//el tamaño de la lista crece uno cada vez que se añaden nuevos elementos
        System.out.println("Valor ingresado correctamente\n\n ");
    }
    //Método que busca el valor en la lista por medio del indice que busque el usuario
    public  String BuscarPosicion(int posicion){
        if(posicion>=0&&posicion<Tamaño){ //condición para saber si la posición se encuentra en la lista
            if(posicion==0){ //condición para saber si la posicón es la primera
                return "El valor en la posición es :"+ Cabecera.getValor();// regresará el valor que tenga
            }else{
                Nodo aux=Cabecera; //se crea una copia de la lista
                for(int i=0;i<posicion;i++){ //ciclo para recorrer las posiciones hasta la posición que ingresó el usuario
                    aux=aux.getSiguiente(); // se van recorriendo los nodos 
                }
                return "El valor en la posición es :"+aux.getValor();//se muestra el valor que se encuentra en la posicion
            }
        }else{
            return "Esteta posicion no se a encontrado en la lista"; //mensaje si la posición no se encuentra en la lista
        }
    }
    //Método para eliminar un valor de la lista a partir de la posición
    public String EliminarPosicion(int posicion){
        if(posicion>=0&&posicion<Tamaño){ //condición para saber si la posición se encuentra en la lista
            if(posicion==0){//condición para saber si la posicón es la primera
                Cabecera=Cabecera.getSiguiente(); //la cabecera inicial toma la pocion que le sigue y su valor
            }
            else{
                Nodo auxiliar =Cabecera; //se crea una copia de la lista
                for(int i=0;i<posicion-1;i++){ //ciclo para recorrer las posiciones hasta una menos de la ingresada
                    auxiliar=auxiliar.getSiguiente(); //va recorriendo los nodos y tomando la posicion
                }
                Nodo siguiente =auxiliar.getSiguiente(); //crea un nuevo donde se almacenara la posición que ingresó el usuario
                auxiliar.setSiguiente(siguiente.getSiguiente()); //y el auxiliar tomara el valor que le sigue brincandose al valor almacenado anteriormente
            }
            Tamaño--;// el tamaño de lista disminuye uno cada vez que se eliminen valores
            return "Elemento eliminado de la lista con exito\n\n";//mensaje que mostrará que fue eliminado 
        }else{
            return "Posición no encontrada";//mensaje si la posición no se encuentra en la lista
        }
    }
    // Método para mostrar los elementos de la lista
    public void listar(){
      if(!esVacia()){ //condición para saber si la lista esta vacia
          Nodo aux=Cabecera; //creamos una copia de la lista
          int i=0;//contador para las pocisiones
          while(aux!=null){ //ciclo que recorrera todas las posiciones de la lista mientra no este vacia          
             System.out.println("posición "+ i +" El valor es: "+ aux.getValor()); //imprimirá en pantalla la posicion y el valor que tiene en esa posición
             aux=aux.getSiguiente(); //recorre la posición de nodo
             i++; //incrementa el contador
            }
        }else{
            System.out.println("La lista esta vacia");//imprime que la lilsta esta vacia si no se cumple la condición
        }
    }
}
