import java.util.Scanner;

public class Estudiante {
    private String nombre, matricula;
    private Double[] notas = new Double[5];
    private Double promedio;

    Scanner scanner = new Scanner(System.in);

    public Estudiante(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }


    
}
