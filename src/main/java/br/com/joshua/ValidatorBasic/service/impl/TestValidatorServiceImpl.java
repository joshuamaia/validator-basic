package br.com.joshua.ValidatorBasic.service.impl;

import br.com.joshua.ValidatorBasic.dto.TestValidatorDTO;
import br.com.joshua.ValidatorBasic.service.TestValidatorService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TestValidatorServiceImpl implements TestValidatorService {

    @Override
    public TestValidatorDTO save(TestValidatorDTO dto) {
        dto.setId(UUID.randomUUID().toString());
        return dto;
    }
}
