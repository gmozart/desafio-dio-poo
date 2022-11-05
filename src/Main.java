import dominio.BootCamp;
import dominio.Curso;
import dominio.Dev;
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

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp JAVA Developer");
        bootCamp.setDescricao("BootCamp para iniciantes em Programação");
        bootCamp.getConteudos().add(cursoLogica);
        bootCamp.getConteudos().add(cursoJava);
        bootCamp.getConteudos().add(mentoriaJava);

        Dev devFelipa = new Dev();
        devFelipa.setNome("Felipa ignês silva");
        devFelipa.inscreverBootCamp(bootCamp);
        System.out.println(" Conteúdo inscrito pela Dev Felipa: "+devFelipa.getConteudosInscritos());
        devFelipa.progredir();
        System.out.println(" Conteúdo concluído pela Dev Felipa: "+devFelipa.getConteudosConcluidos());

        System.out.println("");
        Dev devTayson = new Dev();
        devTayson.setNome("Tayson freitas");
        devTayson.inscreverBootCamp(bootCamp);
        System.out.println(" Conteúdo inscrito pelo Dev Tayson: "+devTayson.getConteudosInscritos());
        System.out.println(" Conteúdo concluído pela Dev Tayson: "+devTayson.getConteudosConcluidos());





    }
}