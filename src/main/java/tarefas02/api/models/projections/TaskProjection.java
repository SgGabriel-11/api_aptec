package tarefas02.api.models.projections;

public interface TaskProjection {

    //mapaeia Id da tarefa
    long getId();

    //mapeia a descriçao da tarefa
    String getDescription();
}
