package pairProgramming;

import java.util.Scanner;
import java.util.Vector;

public class Animal implements IAtencion {

    private String nombre, raza;
    private int edad;
    private char genero = ' ';
    private boolean sintomas;
    private String sintoma;
    private Vector<String> listaSintomas = new Vector<>();

    public Animal() {

    }

    public Animal(String nombre, String raza, int edad, char genero, boolean sintomas) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
        this.sintomas = sintomas;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isSintomas() {
        return sintomas;
    }

    public void setSintomas(boolean sintomas) {
        this.sintomas = sintomas;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public Vector<String> getListaSintomas() {
        return listaSintomas;
    }

    public void setListaSintomas(Vector<String> listaSintomas) {
        this.listaSintomas = listaSintomas;
    }

    @Override
    public void alertarSintomas() {
        int opcion = 0, opcionSintoma = 0;
        Scanner sc = new Scanner(System.in);
        if (sintomas) {
            while (opcion != 5) {
                System.out.println("********* FORMAS DE ALERTAR UN SINTOMA **************");
                System.out.println("Ingrese el numero indicado para cargar un sintoma al animal");
                System.out.println("1 - maulla / ladra");
                System.out.println("2 - rasquido");
                System.out.println("3 - quietud");
                System.out.println("4 - vomitos");
                System.out.println("5 - salir");
                opcionSintoma = sc.nextInt();
                switch (opcionSintoma) {
                    case 1:
                        this.sintoma = "Mucho maullido / ladrido";
                        this.listaSintomas.add(sintoma);
                        System.out.println("Sintoma cargado!");
                        System.out.println("Ingrese el numero indicado para cargar un sintoma al animal");
                        System.out.println("1 - maulla / ladra");
                        System.out.println("2 - rasquido");
                        System.out.println("3 - quietud");
                        System.out.println("4 - vomitos");
                        System.out.println("5 - salir");
                        opcion = sc.nextInt();
                        break;
                    case 2:
                        this.sintoma = "Se rasca constantemente";
                        this.listaSintomas.add(sintoma);
                        System.out.println("Sintoma cargado!");
                        System.out.println("Ingrese el numero indicado para cargar un sintoma al animal");
                        System.out.println("1 - maulla / ladra");
                        System.out.println("2 - rasquido");
                        System.out.println("3 - quietud");
                        System.out.println("4 - vomitos");
                        System.out.println("5 - salir");
                        opcion = sc.nextInt();
                        break;
                    case 3:
                        this.sintoma = "Poca movilidad, mucho tiempo acostado";
                        this.listaSintomas.add(sintoma);
                        System.out.println("Sintoma cargado!");
                        System.out.println("Ingrese el numero indicado para cargar un sintoma al animal");
                        System.out.println("1 - maulla / ladra");
                        System.out.println("2 - rasquido");
                        System.out.println("3 - quietud");
                        System.out.println("4 - vomitos");
                        System.out.println("5 - salir");
                        opcion = sc.nextInt();
                        break;
                    case 4:
                        this.sintoma = "Vomitos";
                        this.listaSintomas.add(sintoma);
                        System.out.println("Sintoma cargado!");
                        System.out.println("Ingrese el numero indicado para cargar un sintoma al animal");
                        System.out.println("1 - maulla / ladra");
                        System.out.println("2 - rasquido");
                        System.out.println("3 - quietud");
                        System.out.println("4 - vomitos");
                        System.out.println("5 - salir");
                        opcion = sc.nextInt();
                        break;
                    default:
                        System.out.println("Sintomas desconocidos");
                        System.out.println("Sintoma cargado!");
                        System.out.println("Ingrese el numero indicado para cargar un sintoma al animal");
                        System.out.println("1 - maulla / ladra");
                        System.out.println("2 - rasquido");
                        System.out.println("3 - quietud");
                        System.out.println("4 - vomitos");
                        System.out.println("5 - salir");
                        opcion = sc.nextInt();
                        break;
                }
            }
        } else {
            System.out.println("El animal no presenta sintomas");
        }

    }

    @Override
    public void tratarSintomas() {
        System.out.println("Descansar");
        System.out.println("Rascarse");
        System.out.println("Lamerse");
    }

    public void mostrarSintomas() {
        if (sintomas) {
            System.out.println("********* LISTA DE SINTOMAS **********");
            for (int i = 0; i < this.listaSintomas.size(); i++) {
                System.out.println("Sintoma: " + listaSintomas.get(i));
            }
        }
    }

}
