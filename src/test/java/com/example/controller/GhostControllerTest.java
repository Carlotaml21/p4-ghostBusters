package com.example.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import com.example.models.Ghost;

public class GhostControllerTest {

    @Test

    void testCreateNewGhost(){
        String name = "Casper";
        String ghostClass = "Clase I";
        String danger = "Bajo";
        String abilities  = "Amistad";
        String captureDate = "05-02-2025";

        
        Ghost actualGhost = GhostController.createGhost(name, ghostClass, danger, abilities, captureDate);

        assertNotNull(actualGhost);
       
        assertEquals(name, actualGhost.getName());
        assertEquals(ghostClass, actualGhost.getGhostClass());
        assertEquals(danger, actualGhost.getDanger());
        assertEquals(abilities, actualGhost.getAbilities());
        assertEquals(captureDate, actualGhost.getCaptureDate());
}


}
