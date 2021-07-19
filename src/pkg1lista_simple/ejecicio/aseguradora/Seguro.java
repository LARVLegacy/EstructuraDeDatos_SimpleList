
package pkg1lista_simple.ejecicio.aseguradora;

public class Seguro {

    private int code;
    private String client;
    private String type;
    private double value;
    private double cost;

    public Seguro(int code, String client, String type, double value, double cost) {
        this.code = code;
        this.client = client;
        this.type = type;
        this.value = value;
        this.cost = cost;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Seguro{" + "code=" + code + ", client=" + client 
                + ", type=" + type + ", value=" + value + ", cost=" 
                + cost + '}';
    }

    
    
    
}
