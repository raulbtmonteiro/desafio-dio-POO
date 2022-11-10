import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Programação Orientada a Objetos");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Manipulação do DOM");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Auxilio aos alunos sobre conceitos da orientação a objetos");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Formação de devs em java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev raul = new Dev();
        raul.setNome("Raul");
        raul.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos de Raul:" + raul.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Raul:" + raul.getConteudosConcluidos());
        raul.progredir();
        System.out.println("Conteúdos inscritos de Raul:" + raul.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Raul:" + raul.getConteudosConcluidos());
        raul.progredir();
        System.out.println("O total de XP do dev Raul é: " + raul.calcularTotalXp());

    }
}