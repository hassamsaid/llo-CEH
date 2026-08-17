//ENCAPSULAMIENTO

class Cuenta {
    //Definimos saldo como un atributo privado
    private double saldo;

    //Creamos métodos para interactuar y modificar el atributo privado
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Se depositó en la cuenta");
        }
    }

    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            this.saldo -= cantidad;
            System.out.println("Se retiró de la cuenta");
        }
    }

    public double getSaldo() {
        return saldo;
    }
    //Permite proteger al atributo
}

//HERENCIA

//Se crea una clase "padre"
class Animal {

    int hambre = 60;

    public void comer(int valor_alimento) {
        this.hambre -= valor_alimento;
        System.out.println("El animal está comiendo");
    }
}

//Se crea una clase "hijo" con extends
class Perro extends Animal {
    public void ladrar() {
        System.out.println("Ladrido, ladrido");
    }
    //Perro heredará los métodos y atributos de Animal
}

//POLIMORFISMO

//Se crea una clase "padre" con un método
class Transporte {
    public void conducir() {
        System.out.println("El transporte se conduce");
    }
}

//Se crean clases "hijo" que modifican los métodos de Transporte
class Moto extends Transporte {
    @Override
    public void conducir() {
        System.out.println("La moto se conduce");
    }
}

class Barco extends Transporte {
    @Override
    public void conducir() {
        System.out.println("El barco se navega");
    }
}

//ABSTRACCION

//Se define una clase con un método abstracto
//El método abstracto solo define lo básico, pero no su implementación
abstract class Figura {
    public abstract double calcularArea();
}

//Se define una clase que define el método abstracto
class Cuadrado extends Figura {
    private double lado = 5;

    @Override
    public double calcularArea() {
        System.out.println(lado * lado);
        return lado * lado;
    }
}


public class CuatroPilaresPoo {
    public static void main(String[] args) {
        //ENCAPSULAMIENTO
        Cuenta cuenta = new Cuenta();
        cuenta.depositar(40);
        cuenta.retirar(30);

        //HERENCIA
        Perro perro = new Perro();

        perro.comer(40);
        perro.ladrar();

        //POLIMORFISMO

        Transporte moto = new Moto();
        Transporte barco = new Barco();

        moto.conducir();
        barco.conducir();

        //ABSTRACCION

        Cuadrado cuadrado = new Cuadrado();

        cuadrado.calcularArea();
    }
}