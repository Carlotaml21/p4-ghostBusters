package com.example.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.models.Ghost;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.not;

import java.util.List;

public class GhostHunterControllerTest {

    private Ghost ghost;

    @BeforeEach
    void beforeEach(){
        ghost = new Ghost("Alejandro", "Clase I", "Bajo", "Nulas", "07-02-2025");
    }

    @Test
    @DisplayName("It should return the trapped ghost")
    void testCapturesGhost(){
        GhostHunterController hunterController = new GhostHunterController();

        List<Ghost> capturedGhosts = hunterController.
        captureGhosts(ghost.getName(), ghost.getGhostClass(), ghost.getDanger(), ghost.getAbilities(), ghost.getCaptureDate());
        
        assertThat(capturedGhosts, hasItem(hasProperty("name", equalTo(ghost.getName()))));
        assertThat(capturedGhosts, hasItem(hasProperty("ghostClass", equalTo(ghost.getGhostClass()))));
        assertThat(capturedGhosts, hasItem(hasProperty("danger", equalTo(ghost.getDanger()))));
        assertThat(capturedGhosts, hasItem(hasProperty("abilities", equalTo(ghost.getAbilities()))));
        assertThat(capturedGhosts, hasItem(hasProperty("captureDate", equalTo(ghost.getCaptureDate()))));


    }
    @Test
    @DisplayName("It should return a list with the trapped ghosts")
    void testReturnsCapturedGhosts(){
        GhostHunterController hunterController = new GhostHunterController();
        
        hunterController.captureGhosts(ghost.getName(), ghost.getGhostClass(), ghost.getDanger(), ghost.getAbilities(), ghost.getCaptureDate());

        assertThat(hunterController.getGhosts(), hasItem(hasProperty("name", equalTo(ghost.getName()))));
        assertThat(hunterController.getGhosts(), hasItem(hasProperty("ghostClass", equalTo(ghost.getGhostClass()))));
        assertThat(hunterController.getGhosts(), hasItem(hasProperty("danger", equalTo(ghost.getDanger()))));
        assertThat(hunterController.getGhosts(), hasItem(hasProperty("abilities", equalTo(ghost.getAbilities()))));
        assertThat(hunterController.getGhosts(), hasItem(hasProperty("captureDate", equalTo(ghost.getCaptureDate()))));
    }
    @Test
    @DisplayName("It should remove the selected ghost from the list")
    void testRemovesTrappedGhost(){
        GhostHunterController hunterController = new GhostHunterController();

        Ghost ghost2 = new Ghost("Alex", "Clase II", "Alto", "Nulas", "07-02-2025");

        hunterController.captureGhosts(ghost.getName(), ghost.getGhostClass(), ghost.getDanger(), ghost.getAbilities(), ghost.getCaptureDate());
        hunterController.captureGhosts(ghost2.getName(), ghost2.getGhostClass(), ghost2.getDanger(), ghost2.getAbilities(), ghost2.getCaptureDate());

        hunterController.removeGhost(ghost.getName());

        assertThat(hunterController.getGhosts(), not(hasItem(hasProperty("name", equalTo(ghost.getName())))));

    }
    
}
