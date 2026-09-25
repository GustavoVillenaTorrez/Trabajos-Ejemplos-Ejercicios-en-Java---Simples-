package modelo;

public class PerroProgramador {
  // atributos
  private int felicidad = 5;
  private int hambre = 0;
  private int energia = 10;

  public PerroProgramador() {}

  private void ladrar() {
    System.out.println("Guau!");
  }

  /*
  comer(): hambre-- , felicidad++, ladrar()
  jugar(): felicidad++, energía--, ladrar()
  dormir(): energía++, hambre++
  ----
  retar(): felicidad--
  felicidad no puede superar 10
  programar(): felicidad--, hambre++
  */


  public void comer() {
    // this.hambre = this.hambre - 1;
    // this.felicidad = this.felicidad + 1;
    // this.ladrar();
    hambre--;
    if (felicidad < 10) {
      felicidad++;
    }
    ladrar();
  }

public void jugar() {
    // this.felicidad = this.felicidad + 1;
    // this.energia = this.energia - 1;
    // this.ladrar();
    if (felicidad < 10) {
      felicidad++;
    }
    energia--;
    ladrar();
  }

  public void dormir() {
    // this.energia = this.energia + 1;
    // this.hambre = this.hambre + 1;
    energia++;
    hambre++;
  }

  public void retar() {
    felicidad--;
  }

  public void programar() {
   felicidad--;
   hambre++;
  }

  // representación textual del objeto
  public String toString() {
      return "f: " + felicidad + " e:" + energia + " h:" + hambre;
  }
}
