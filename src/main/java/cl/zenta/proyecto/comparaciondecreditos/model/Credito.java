package cl.zenta.proyecto.comparaciondecreditos.model;

public class Credito {

    private int id;
    private String banco;
    private int cuota;
    private int montoTotal;


    public Credito(){

    }

    public Credito(int id, String banco, int cuota, int montoTotal) {
        this.id = id;
        this.banco = banco;
        this.cuota = cuota;
        this.montoTotal = montoTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }
}
