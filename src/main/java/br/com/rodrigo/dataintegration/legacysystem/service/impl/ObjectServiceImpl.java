package br.com.rodrigo.dataintegration.legacysystem.service.impl;

import br.com.rodrigo.dataintegration.legacysystem.entity.mapper.*;
import br.com.rodrigo.dataintegration.legacysystem.model.gen.*;
import br.com.rodrigo.dataintegration.legacysystem.repository.*;
import br.com.rodrigo.dataintegration.legacysystem.service.*;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
@Slf4j
public class ObjectServiceImpl implements ObjectService {

    @Autowired
    private ObjectRepository objectRepository;

    @Override
    public String insert(InsertObject object) {
        log.info("Inserting legacy object: {}", object.getObject().getCorrelationId());
        return objectRepository.insertObject(DBObjectMapper.toEntity(object));
    }
}
