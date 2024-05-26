import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição do curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setNome("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devThulio = new Dev();
        devThulio.setNome("Thulio");
        devThulio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Thulio: " + devThulio.getConteudosInscritos());
        devThulio.progredirBootcamp();
        devThulio.progredirBootcamp();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Thulio: " + devThulio.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Thulio: " + devThulio.getConteudosConcluidos());
        System.out.println("XP: " + devThulio.calcularTotalXp());


        System.out.println("---------------");

        Dev devCamila =new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredirBootcamp();
        devCamila.progredirBootcamp();
        devCamila.progredirBootcamp();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

    }
}