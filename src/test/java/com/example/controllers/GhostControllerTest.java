package com.example.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import com.example.controllers.GhostController;
import com.example.models.Ghost;

public class GhostControllerTest {

    @Test

    void testCreateNewGhost(){
        String name = "Casper";
        String ghostClass = "Clase I";
        String danger = "Bajo";
        String abilities  = "Amistad";
        String captureDate = "05-02-2025";

        GhostController ghostController = new GhostController();
        
        Ghost actualGhost = ghostController.createGhost(name, ghostClass, danger, abilities, captureDate);

        assertNotNull(actualGhost);
       
        assertEquals(name, actualGhost.getName());
        assertEquals(ghostClass, actualGhost.getGhostClass());
        assertEquals(danger, actualGhost.getDanger());
        assertEquals(abilities, actualGhost.getAbilities());
        assertEquals(captureDate, actualGhost.getCaptureDate());
}


}
