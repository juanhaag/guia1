package app.ejercicios.ejercicio3;

public class ItemVenta {
    private int id;
    private String descripcion;
    private int cantidad;
    private double pUnitario;
    private double pTotal;

    public ItemVenta() {

    }

    public ItemVenta(final int id, final String descripcion, final int cantidad, final double pUnitario) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.pUnitario = pUnitario;
    }

    public int getId() {
        return this.id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(final String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(final int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPUnitario() {
        return this.pUnitario;
    }

    public void setPUnitario(final double pUnitario) {
        this.pUnitario = pUnitario;
    }

    public double getPTotal() {
        return this.pTotal;
    }

    public void setPTotal(final double pTotal) {
        this.pTotal = pTotal;
    }

    public void precioTotal() {
        final double total = getPUnitario() * getCantidad();
        setPTotal(total);
    }

    public void productoYcantidad() {
        System.out.println(
                this.id + " " + this.descripcion + " " + this.cantidad + " $" + this.pUnitario + " " + this.pTotal);
    }
}