package br.com.rodrigo.dataintegration.legacysystem.controller;

import br.com.rodrigo.dataintegration.legacysystem.model.gen.*;
import br.com.rodrigo.dataintegration.legacysystem.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.ws.server.endpoint.annotation.*;

@Endpoint
public class ObjectEndpoint {

    private static final String NAMESPACE_URI = "http://www.rodrigo.com.br/dataintegration/legacysystem/model/gen";

    @Autowired
    private ObjectService objectService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "insertObject")
    @ResponsePayload
    public InsertObjectResponse insertObject(@RequestPayload InsertObject request) {
        String legacyId = objectService.insert(request);
        InsertObjectResponse response = new InsertObjectResponse();
        response.setLegacyId(legacyId);
        return response;
    }
}