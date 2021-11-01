package com.jvjohnson1.no_fly.persistence;

import com.jvjohnson1.no_fly.entity.Destination;
import com.jvjohnson1.no_fly.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.*;
import java.util.List;

/**
 * Performs basic input and output of the User class
 */
public class DestinationDao {

    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    public DestinationDao() {

    }

    /**
     * Get user by id
     */
    public Destination getById(int id) {
        Session session = sessionFactory.openSession();
        Destination trip = session.get( Destination.class, id );
        session.close();
        return trip;
    }

    /**
     * update user
     * @param trip  Destination to be inserted or updated
     */
    public void saveOrUpdate(Destination trip) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(trip);
        transaction.commit();
        session.close();
    }

    /**
     * update user
     * @param Trip  Destination to be inserted or updated
     */
    public int insert(Destination Trip) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(Trip);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Delete a Destination
     * @param Trip Destination to be deleted
     */
    public void delete(Destination Trip) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(Trip);
        transaction.commit();
        session.close();
    }


    /** Return a list of all Destinations
     *
     * @return All users
     */
    public List<Destination> getAll() {

        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Destination> query = builder.createQuery( Destination.class );
        Root<Destination> root = query.from( Destination.class );
        List<Destination> trips = session.createQuery( query ).getResultList();

        logger.debug("The list of destinations " +  trips);
        session.close();
        return trips;
    }

    /**
     * Get user by property (exact match)
     * sample usage: getByPropertyEqual("lastname", "Curry")
     */
    public List<Destination> getByPropertyEqual(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for destination with " + propertyName + " = " + value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Destination> query = builder.createQuery( Destination.class );
        Root<Destination> root = query.from( Destination.class );
        query.select(root).where(builder.equal(root.get(propertyName), value));
        List<Destination> trips = session.createQuery( query ).getResultList();

        session.close();
        return trips;
    }

    /**
     * Get user by property (like)
     * sample usage: getByPropertyLike("lastname", "C")
     */
    public List<Destination> getByPropertyLike(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for Destination with {} = {}",  propertyName, value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Destination> query = builder.createQuery( Destination.class );
        Root<Destination> root = query.from( Destination.class );
        Expression<String> propertyPath = root.get(propertyName);

        query.where(builder.like(propertyPath, "%" + value + "%"));

        List<Destination> trips = session.createQuery( query ).getResultList();
        session.close();
        return trips;
    }

}
