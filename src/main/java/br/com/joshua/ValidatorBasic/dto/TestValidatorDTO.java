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

    @NotBlank(message = "O nome é obrigatório e não pode estar em branco.")
    @Size(min = 3, max = 50, message = "O nome deve ter entre {min} e {max} caracteres.")
    private String nome;

    @NotNull(message = "A idade não pode ser nula.")
    @Min(value = 18, message = "A idade mínima permitida é {value} anos.")
    @Max(value = 100, message = "A idade máxima permitida é {value} anos.")
    private Integer idade;

    @Email(message = "O e-mail deve ser válido.")
    @NotBlank(message = "O e-mail não pode estar em branco.")
    private String email;

    @Pattern(regexp = "\\d{11}", message = "O CPF deve conter exatamente 11 dígitos numéricos.")
    @NotBlank(message = "O CPF não pode estar em branco.")
    private String cpf;

    @NotNull(message = "A data de nascimento não pode ser nula.")
    @Past(message = "A data de nascimento deve estar no passado.")
    private LocalDate dataNascimento;

    @NotBlank(message = "A senha é obrigatória.")
    @Size(min = 8, max = 20, message = "A senha deve ter entre {min} e {max} caracteres.")
    private String senha;

    @Pattern(regexp = "\\(\\d{2}\\)\\s\\d{4,5}-\\d{4}", message = "O telefone deve estar no formato (XX) XXXXX-XXXX.")
    @NotBlank(message = "O telefone não pode estar em branco.")
    private String telefone;

    @AssertTrue(message = "Você deve aceitar os termos e condições.")
    private Boolean aceitaTermos;

}

