import dominio.Curso;

public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();

        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Curso de desenvolvimento básico de POO");
        cursoJava.setCargaHoraria(10);

        Curso cursoLogica = new Curso();

        cursoLogica.setTitulo("Curso Javascript");
        cursoLogica.setDescricao("Curso de desenvolvimento básico de Javascript");
        cursoLogica.setCargaHoraria(20);

    }
}