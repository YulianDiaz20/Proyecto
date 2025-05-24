import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private boolean estado;
    private int numero;
    private double total;
    List<Carta>lstPedido;

    {
        lstPedido = new ArrayList<>();
    }

    public Mesa(int numero) {
        estado = true;
        total = 0;
        this.numero = numero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void pedido(String producto, double precio, int cantidad){
        lstPedido.add(new Carta(producto,precio,cantidad));
        total=(precio*cantidad)+total;
    }
    public void mostrarPedido(){
        for (int i=0;i< lstPedido.size();i++){
            System.out.println(
                    lstPedido.get(i).toString()+" ("+lstPedido.get(i).getCantidad()+")");
        }
    }
    public double getTotal(){
        return total;
    }
    public void reiniciar(){
        estado = true;
        total = 0;
        lstPedido.clear();
    }

}
