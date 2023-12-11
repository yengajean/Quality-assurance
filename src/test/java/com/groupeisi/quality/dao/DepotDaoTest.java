package com.groupeisi.quality.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepotDaoTest {

    private DepotDao depotDao;
    @BeforeEach
    void setUp() {
        depotDao = new DepotDao();
    }
    @Test
    void message() {
        assertEquals("Hello",depotDao.message());
    }
}