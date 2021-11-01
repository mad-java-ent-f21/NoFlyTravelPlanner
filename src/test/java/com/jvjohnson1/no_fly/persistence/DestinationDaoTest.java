package com.jvjohnson1.no_fly.persistence;

import com.jvjohnson1.no_fly.entity.Destination;
import com.jvjohnson1.no_fly.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DestinationDaoTest {

    DestinationDao dao;

    /**
     * Run set up tasks before each test:
     * 1. execute sql which deletes everything from the table and inserts records)
     * 2. Create any objects needed in the tests
     */
    @BeforeEach
    void setUp() {

        Database testDatabase = Database.getInstance();
        testDatabase.runSQL("createDatabase.sql");

        dao = new DestinationDao();
    }

    /**
     * Verify successful retrieval of a user
     */
    @Test
    void getByIdSuccess() {
        Destination retrieved = dao.getById(54880);
        assertEquals("Park", retrieved.getType());
        assertEquals(14, retrieved.getNearestGrayhound());
        assertEquals("Scenic", retrieved.getActivity());
        //TODO compare remaining values
    }

    /**
     * Verify successful insert of a user
     */
    @Test
    void insertSuccess() {

        Destination toAdd = new Destination(82414, "Park", "Wyoming", 59, 59, 0, 21, "Hiking", "multiple");
        int id = dao.insert(toAdd);
        assertNotEquals(0,id);
        Destination insertedDestination = dao.getById(82414);
        assertTrue(toAdd.equals(insertedDestination));
//        assertTrue(newUser.equals(dao.getById(id))); would only be true for the same object, not equal values
        // Could continue comparing all values, but
        // it may make sense to use .equals()
        // TODO review .equals recommendations http://docs.jboss.org/hibernate/orm/5.2/userguide/html_single/Hibernate_User_Guide.html#mapping-model-pojo-equalshashcode
    }

    /**
     * Verify successful delete of user
     */
    @Test
    void deleteSuccess() {
        dao.delete(dao.getById(80809));
        assertNull(dao.getById(80809));
    }

    /**
     * Verify successful retrieval of all users
     */
    @Test
    void getAllSuccess() {
        List<Destination> places = dao.getAll();
        assertEquals(2, places.size());
    }

    /**
     * Verify successful get by property (equal match)
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<Destination> places = dao.getByPropertyLike("location", "Colorado");
        assertEquals(1, places.size());
        assertEquals(80809, places.get(0).getDestinationID());
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<Destination> users = dao.getByPropertyLike("type", "Mountain");
        assertEquals(1, users.size());
    }
}
