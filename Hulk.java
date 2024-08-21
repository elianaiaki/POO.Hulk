public class Hulk {
    // Atributos privados de la clase
    private double peso;           // Peso de Hulk
    private String colorPiel;      // Color de la piel de Hulk
    private String estado;         // Estado actual: "Humano" o "Bestia"

    // Constructor de la clase
    public Hulk(double peso, String colorPiel) {
        this.peso = peso;          // Inicializa el peso con el valor pasado al constructor
        this.colorPiel = colorPiel; // Inicializa el color de piel con el valor pasado al constructor
        this.estado = "Normal";    // Inicializa el estado a "Normal"
    }

    // Método para transformar a Hulk en Bestia
    public void transformar() {
        this.colorPiel = "Verde";  // Cambia el color de piel a verde cuando Hulk se transforma
        this.peso *= 5;            // Multiplica el peso por 5 durante la transformación
        this.estado = "Bestia";    // Cambia el estado a "Bestia"
    }

    // Método para calmar a Hulk y devolverlo a su estado Humano
    public void calmar() {
        this.colorPiel = "Color Original"; // Cambia el color de piel a su color original (este valor debe ser específico)
        this.peso /= 5;            // Divide el peso por 5 cuando Hulk se calma
        this.estado = "Humano";    // Cambia el estado a "Humano"
    }

    // Método para saludar basado en el estado de Hulk
    public void saludar(String nombre) {
        if (this.estado.equals("Humano")) {
            System.out.println("Hola, soy " + nombre); // Saluda con el nombre si está en estado Humano
        } else {
            System.out.println("Aghhhhhh!"); // Emite un grito si está en estado Bestia
        }
    }

    // Métodos getters para acceder a los atributos privados

    public double getPeso() {
        return peso;  // Retorna el peso de Hulk
    }

    public String getColorPiel() {
        return colorPiel; // Retorna el color de piel de Hulk
    }

    public String getEstado() {
        return estado;  // Retorna el estado actual de Hulk
    }
}

