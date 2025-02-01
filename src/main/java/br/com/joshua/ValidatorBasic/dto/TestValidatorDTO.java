package br.com.joshua.ValidatorBasic.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestValidatorDTO {

    private String id;

    @NotBlank(message = "{nome.notblank}")
    @Size(min = 3, max = 50, message = "{nome.size}")
    private String nome;

    @NotNull(message = "{idade.notnull}")
    @Min(value = 18, message = "{idade.min}")
    @Max(value = 100, message = "{idade.max}")
    private Integer idade;

    @Email(message = "{email.valid}")
    @NotBlank(message = "{email.notblank}")
    private String email;

    @Pattern(regexp = "\\d{11}", message = "{cpf.format}")
    @NotBlank(message = "{cpf.notblank}")
    private String cpf;

    @NotNull(message = "{dataNascimento.notnull}")
    @Past(message = "{dataNascimento.past}")
    private LocalDate dataNascimento;

    @NotBlank(message = "{senha.notblank}")
    @Size(min = 8, max = 20, message = "{senha.size}")
    private String senha;

    @Pattern(regexp = "\\(\\d{2}\\)\\s\\d{4,5}-\\d{4}", message = "{telefone.format}")
    @NotBlank(message = "{telefone.notblank}")
    private String telefone;

    @AssertTrue(message = "{aceitaTermos.true}")
    private Boolean aceitaTermos;
}
