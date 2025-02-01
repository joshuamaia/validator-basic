package br.com.joshua.ValidatorBasic.controller;

import br.com.joshua.ValidatorBasic.dto.TestValidatorDTO;
import br.com.joshua.ValidatorBasic.service.TestValidatorService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestValidatorController {

    private final TestValidatorService service;

    public TestValidatorController(TestValidatorService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public ResponseEntity<TestValidatorDTO> save(@RequestBody @Valid TestValidatorDTO dto) {
        TestValidatorDTO savedDto = service.save(dto);
        return ResponseEntity.ok(savedDto);
    }
}
