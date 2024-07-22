package Bootcamp;

import java.util.Date;
import java.util.List;

public class Bootcamp {

    private String titulo;
    private String descricao;
    private Date dataInicio;
    private Date dataTermino;
    private List<Atividade> listaAtividades;
    private List<Aluno> alunos;

   public Bootcamp(String titulo, String descricao, Date dataInicio, Date dataTermino){
       this.titulo = titulo;
       this.descricao = descricao;
       this.dataInicio = dataInicio;
       this.dataTermino = dataTermino;
   }

   public void matricular(String nome, String cpf){
       alunos.add(new Aluno(nome,cpf));
   }

   public void addAtividade(String titulo, String descricao, int duracao)
   {
       listaAtividades.add(new Atividade(titulo, descricao, duracao));
   }

   public void getDuracaoTotal()
   {
       int duracaoTotal = 0;
       for (Atividade a: this.listaAtividades) {
           duracaoTotal += a.getDuracao();
       }
       System.out.println(duracaoTotal);
   }


   public void allAtividades(){
       System.out.println(listaAtividades);
   }

}
