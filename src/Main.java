import dominio.Curso;
import dominio.Mentoria;

import java.time.LocalDate;

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

        Mentoria mentoriaJava = new Mentoria();

        mentoriaJava.setTitulo("Mentoria Java");
        mentoriaJava.setDescricao("Mentoria qualificada para JAVA");
        mentoriaJava.setData(LocalDate.now());

        System.out.println(cursoJava);
        System.out.println(cursoLogica);
        System.out.println(mentoriaJava);

    }
}