package com.jvjohnson1.no_fly.persistence;

import com.jvjohnson1.no_fly.entity.Review;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ReviewDaoTest {

    ReviewDao dao;

    /**
     * Run set up tasks before each test:
     * 1. execute sql which deletes everything from the table and inserts records)
     * 2. Create any objects needed in the tests
     */
    @BeforeEach
    void setUp() {

        Database testDatabase = Database.getInstance();
        testDatabase.runSQL("createDatabase.sql");

        dao = new ReviewDao();
    }

    /**
     * Verify successful retrieval of a user
     */
    @Test
    void getByUserID() {
        List<Review> retrieved = dao.getByUserID(7);
        assertEquals(1, retrieved.size());
    }

    *
     * Verify successful insert of a user

    @Test
    void insertSuccess() {

        User newUser = new User(19, "Fred", "Flintstone", "fflintstone", "badpassword","Freddy");
        int id = dao.insert(newUser);
        assertNotEquals(0,id);
        User insertedUser = dao.getById(id);
        assertTrue(newUser.equals(insertedUser));
//        assertTrue(newUser.equals(dao.getById(id))); would only be true for the same object, not equal values
        // Could continue comparing all values, but
        // it may make sense to use .equals()
        // TODO review .equals recommendations http://docs.jboss.org/hibernate/orm/5.2/userguide/html_single/Hibernate_User_Guide.html#mapping-model-pojo-equalshashcode
    }

//    *
//     * Verify successful delete of user
//
    @Test
    void deleteSuccess() {
        dao.delete(dao.getByFullKey(7, 54880));
        assertNull(dao.getByFullKey(7, 54880));
    }

//    *
//     * Verify successful retrieval of all users
//
    @Test
    void getAllSuccess() {
        List<User> users = dao.getAll();
        assertEquals(18, users.size());
    }

//    *
//     * Verify successful get by property (equal match)
//
    @Test
    void getByPropertyEqualSuccess() {
        List<User> users = dao.getByPropertyLike("lastName", "Smith");
        assertEquals(1, users.size());
        assertEquals(6, users.get(0).getId());
    }

//    *
//     * Verify successful get by property (like match)
//
    @Test
    void getByPropertyLikeSuccess() {
        List<User> users = dao.getByPropertyLike("lastName", "S");
        assertEquals(9, users.size());
    }
 }
