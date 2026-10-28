package Lista_exercicios_stream;

public class Pedido {
  private String id;
  private double valor;


  public Pedido(String id, double valor) {
    this.id = id;
    this.valor = valor;
  }


  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public double getValor() {
    return valor;
  }


  public void setValor(double valor) {
    this.valor = valor;
  }

  
  
}
