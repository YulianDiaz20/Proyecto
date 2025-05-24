public class Carta {
    private String producto;
    private double precio;
    private int cantidad;

    public Carta(String producto, double precio, int cantidad) {
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return producto +" $"+precio;
    }
}
