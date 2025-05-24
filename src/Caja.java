public class Caja {
    private double nequi;
    private double mesa;
    private double total;

    public Caja() {
        this.nequi = 0;
        this.mesa = 0;
        this.total = 0;
    }

    public double getNequi() {
        return nequi;
    }

    public void setNequi(double nequi) {
        this.nequi = nequi+this.nequi;
    }

    public double getMesa() {
        return mesa;
    }

    public void setMesa(double mesa) {
        this.mesa = mesa+this.mesa;
    }

    public double getTotal() {
        total=total+getNequi()+getMesa();
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
