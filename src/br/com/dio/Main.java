import java.time.LocalDate;

import br.com.dio.desafio.dominio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.dominio.Curso;
import br.com.dio.desafio.dominio.dominio.Dev;
import br.com.dio.desafio.dominio.dominio.Mentoria;

public class Main {
    
    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setDescricao("Introdução à linguagem Java");
        cursoJava.setCargaHoraria(24);
        cursoJava.setTitulo("Java 101");

        Curso cursoJavascript = new Curso();
        cursoJavascript.setDescricao("Aprendendo Javascript do Início");
        cursoJavascript.setCargaHoraria(20);
        cursoJavascript.setTitulo("Javascript para noobs");

        Mentoria mentoriaOrientacaoObjetos = new Mentoria();
        mentoriaOrientacaoObjetos.setData(LocalDate.now());
        mentoriaOrientacaoObjetos.setTitulo("Bússola da OO - Como se orientar na orientação a objetos");
        mentoriaOrientacaoObjetos.setDescricao("Entendendo de uma vez por todas esse paradigma de programação.");

        System.out.println(cursoJava);
        System.out.println(cursoJavascript);
        System.out.println(mentoriaOrientacaoObjetos);

        Bootcamp javaFullWebDeveloper = new Bootcamp();
        javaFullWebDeveloper.setNome("Fullstack Webdeveloper -  Java");
        javaFullWebDeveloper.setDescricao("Aprendendo a criar websites escaláveis, rápidos e seguros com Java, Javscript e muito mais.");
        javaFullWebDeveloper.getConteudos().add(cursoJava);
        javaFullWebDeveloper.getConteudos().add(cursoJavascript);
        javaFullWebDeveloper.getConteudos().add(mentoriaOrientacaoObjetos);

        Dev nikola = new Dev();
        nikola.setNome("Nicolelson Tesla Silveira");
        nikola.inscreverBootcamp(javaFullWebDeveloper);
        nikola.progredir();
        nikola.progredir();
        System.out.println("Inscrições de " + nikola.getNome() + ": " + nikola.getConteudosInscritos());
        System.out.println("Concluídos de " + nikola.getNome() + ": " + nikola.getConteudosConcluidos());
        System.out.println("XP de  " + nikola.getNome() + ": " + nikola.calcularTotalXP());
        
        Dev billy = new Dev();
        billy.setNome("Billysvaldo Souza Santos");
        billy.inscreverBootcamp(javaFullWebDeveloper);
        billy.progredir();
        System.out.println("Inscrições de " + billy.getNome() + ": " + billy.getConteudosInscritos());
        System.out.println("Concluídos de " + billy.getNome() + ": " + billy.getConteudosConcluidos());
        System.out.println("XP de  " + billy.getNome() + ": " + billy.calcularTotalXP());        


    }
}
