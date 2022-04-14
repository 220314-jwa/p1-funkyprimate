package com.revature.data;

import com.revature.app.Pitch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.sql.Connection;
import java.sql.SQLException;


class PitchDAOImpTest {

    @Mock
    Connection connection;
    @Mock
    PitchDAOImp pitchDAOImp;
    @Mock
    Pitch pitch;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testCreate() throws SQLException {
        int result = pitchDAOImp.create(pitch);
        Assertions.assertEquals(0, result);
    }

    @Test
    void testUpdate() {
        pitchDAOImp.update(pitch);
    }

    @Test
    void testDelete() {
        pitchDAOImp.delete(pitch);
    }

}
