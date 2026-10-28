package tarefas02.api.models.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor 
@NoArgsConstructor 
@Data 

public class UserCreateDto {

    //nome obrigatório, não pode ser nulo ou vazio
    @NotBlank 
    @Size (min = 2,max = 100)
    private String username;

    //senha obrigatória, não pode ser nula ou vazia
    @NotBlank 
    @Size (min = 8,max = 60)
    private String password;

}
