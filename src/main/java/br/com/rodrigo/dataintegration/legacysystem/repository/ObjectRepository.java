package br.com.rodrigo.dataintegration.legacysystem.repository;

import br.com.rodrigo.dataintegration.legacysystem.entity.*;
import org.springframework.stereotype.*;

import java.util.*;

@Component
public class ObjectRepository {

    public String insertObject(DBObject object) {
        return UUID.randomUUID().toString();
    }
}