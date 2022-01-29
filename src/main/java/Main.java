import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "Descrição curso Java", 8);
        Curso curso2 = new Curso("Curso JS", "Descrição curso JS", 4);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Descrição mentoria Java", LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamilla = new Dev("Camilla");
        devCamilla.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos inscritos Camilla: " + devCamilla.getConteudosIncritos());
        devCamilla.progredir();
        System.out.println("-");
        System.out.println("Contéudos inscritos Camilla: " + devCamilla.getConteudosIncritos());
        System.out.println("Contéudos concluídos Camilla: " + devCamilla.getConteudosConcluidos());
        System.out.println("XP: " + devCamilla.calcularTotalXp());

        System.out.println("-----------------");

        Dev devGustavo = new Dev("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos inscritos Gustavo: " + devGustavo.getConteudosIncritos());
        devGustavo.progredir();
        devGustavo.progredir();
        devGustavo.progredir();
        System.out.println("-");
        System.out.println("Contéudos inscritos Gustavo: " + devGustavo.getConteudosIncritos());
        System.out.println("Contéudos concluídos Gustavo: " + devGustavo.getConteudosConcluidos());
        System.out.println("XP: " + devGustavo.calcularTotalXp());

    }
}
