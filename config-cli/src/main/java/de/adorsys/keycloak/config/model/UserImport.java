package de.adorsys.keycloak.config.model;

import org.keycloak.representations.idm.UserRepresentation;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class UserImport extends UserRepresentation {

    @Override
    public Map<String, List<String>> getClientRoles() {
        if(clientRoles == null) {
            return Collections.EMPTY_MAP;
        }

        return clientRoles;
    }
}