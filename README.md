# Ejemplos del Principio de Segregación de Interfaces (ISP)

## Integrantes

* John Steban Morales Ceron
* Carlos Alberto Obando Torrente
* Juan Fernando Lenis

---

# ¿Qué es el principio de segregación de interfaces?

El principio de segregación de interfaces (ISP - Interface Segregation Principle) es uno de los principios SOLID.

Este principio dice:

> "Una clase no debe verse obligada a implementar métodos que no necesita."

En palabras sencillas:

Si una interfaz tiene demasiadas responsabilidades, algunas clases terminarán implementando métodos que realmente no usan.

Esto provoca:

* Código innecesario
* Excepciones
* Mayor dificultad de mantenimiento
* Acoplamiento innecesario
* Código menos limpio

La solución consiste en dividir interfaces grandes en interfaces pequeñas y específicas.

---

# Ejemplo 1 — Sistema de Empleados

## ❌ Ejemplo Malo

En este ejemplo se crea una interfaz llamada `Worker`.

```java
interface Worker {
    void work();
    void eat();
}
```

El problema es que todos los trabajadores están obligados a implementar el método `eat()`.

Esto funciona para un trabajador humano, pero no para un robot.

## Problema del diseño

La clase `RobotWorker` implementa un método que realmente no necesita.

```java
class RobotWorker implements Worker {

    @Override
    public void work() {
        System.out.println("Robot trabajando...");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException(
            "Los robots no comen"
        );
    }
}
```

## ¿Qué ocurre?

Cuando se intenta ejecutar `eat()` en el robot, el programa genera una excepción.

### Resultado

```txt
Robot trabajando...
Los robots no comen
```

## ¿Por qué está mal?

Porque el robot fue obligado a implementar una funcionalidad que no necesita.

Esto viola el principio ISP.

---

# ✅ Ejemplo Bueno

La solución es separar responsabilidades en interfaces pequeñas.

## Interfaces separadas

```java
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}
```

Ahora cada clase implementa únicamente lo que necesita.

## Trabajador humano

```java
class HumanWorker implements Workable, Eatable {

    @Override
    public void work() {
        System.out.println("Humano trabajando");
    }

    @Override
    public void eat() {
        System.out.println("Humano comiendo");
    }
}
```

## Robot

```java
class RobotWorker implements Workable {

    @Override
    public void work() {
        System.out.println("Robot trabajando");
    }
}
```

## Ventajas del nuevo diseño

* Cada clase implementa solo lo necesario
* No existen métodos innecesarios
* El código es más limpio
* Es más fácil de mantener
* Se cumple el principio ISP

---

# Ejemplo 2 — Sistema de Restaurante

## ❌ Ejemplo Malo

En este ejemplo todos los empleados del restaurante implementan la misma interfaz.

```java
interface RestaurantEmployee {

    void cookFood();

    void serveCustomer();

    void cleanTables();

    void managePayments();
}
```

## Problema del diseño

Cada empleado debe implementar acciones que realmente no realiza.

Por ejemplo:

* El chef no administra pagos
* El cajero no cocina
* El mesero no procesa pagos

## Ejemplo del cajero

```java
public class Cajero implements RestaurantEmployee {

    @Override
    public void cookFood() {
        throw new UnsupportedOperationException(
            "El cajero no cocina."
        );
    }

    @Override
    public void serveCustomer() {
        throw new UnsupportedOperationException(
            "El cajero no atiende mesas."
        );
    }

    @Override
    public void cleanTables() {
        throw new UnsupportedOperationException(
            "El cajero no limpia mesas."
        );
    }

    @Override
    public void managePayments() {
        System.out.println(
            "El cajero está procesando pagos."
        );
    }
}
```

## ¿Qué problema existe?

El cajero fue obligado a implementar métodos que no utiliza.

Esto genera:

* Excepciones innecesarias
* Interfaces demasiado grandes
* Código difícil de mantener
* Mayor acoplamiento

---

# ✅ Ejemplo Bueno

La solución consiste en dividir las responsabilidades en interfaces pequeñas.

## Interfaces separadas

```java
public interface Cook {
    void cookFood();
}

public interface Serve {
    void serveCustomer();
}

public interface Clean {
    void cleanTables();
}

public interface Payment {
    void managePayments();
}
```

---

## Chef

```java
public class Chef implements Cook {

    @Override
    public void cookFood() {
        System.out.println("El chef está cocinando.");
    }
}
```

---

## Mesero

```java
public class Waiter implements Serve, Clean {

    @Override
    public void serveCustomer() {
        System.out.println(
            "El mesero está atendiendo clientes."
        );
    }

    @Override
    public void cleanTables() {
        System.out.println(
            "El mesero está limpiando mesas."
        );
    }
}
```

---

## Cajero

```java
public class Cajero implements Payment {

    @Override
    public void managePayments() {
        System.out.println(
            "El cajero está procesando pagos."
        );
    }
}
```

---

# Ventajas del buen diseño

* Cada clase tiene una única responsabilidad
* No existen métodos innecesarios
* El código es más claro
* Se reducen errores
* El sistema es más fácil de escalar
* Se cumple correctamente el principio ISP

---

# Conclusión

El principio de segregación de interfaces ayuda a crear sistemas más organizados, limpios y fáciles de mantener.

Cuando una interfaz tiene demasiadas responsabilidades, las clases terminan implementando métodos que no necesitan.

La mejor solución es dividir las responsabilidades en interfaces pequeñas y específicas.

Gracias a esto:

* El código es más flexible
* Hay menos errores
* El mantenimiento es más sencillo
* El sistema es más profesional

---

# Cómo ejecutar los ejemplos

## Compilar

```bash
javac *.java
```

## Ejecutar

```bash
java Main
```

---

# Estructura del proyecto

```txt
src/
│
├── Ejemplo_Malo/
│   ├── RestaurantEmployee.java
│   ├── Chef.java
│   ├── Waiter.java
│   ├── Cajero.java
│   └── Main.java
│
└── Ejemplo_Bueno/
    ├── Cook.java
    ├── Serve.java
    ├── Clean.java
    ├── Payment.java
    ├── Chef.java
    ├── Waiter.java
    ├── Cajero.java
    └── Main.java
```
