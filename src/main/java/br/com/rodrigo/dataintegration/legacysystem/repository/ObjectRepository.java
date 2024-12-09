package br.com.rodrigo.dataintegration.legacysystem.repository;

import br.com.rodrigo.dataintegration.legacysystem.entity.*;
import org.springframework.data.jpa.repository.*;

public interface ObjectRepository extends JpaRepository<DBObject, Long> {

    @Query(value = "select BUS_OBJ_SEQ.nextval from dual", nativeQuery = true)
    Long getNextSequential();

}