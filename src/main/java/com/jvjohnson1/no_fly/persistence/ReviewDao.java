package com.jvjohnson1.no_fly.persistence;

import com.jvjohnson1.no_fly.entity.Destination;
import com.jvjohnson1.no_fly.entity.Review;
import jdk.nashorn.internal.runtime.RewriteException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.*;
import java.util.List;

public class ReviewDao {
    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    public ReviewDao() {

    }

    /**
     * Get user by id
     */
    public Review getByDestination(int id) {
        Session session = sessionFactory.openSession();
        Review results = session.get( Review.class, id );
        session.close();
        return results;
    }

    public Review getByUser(int id) {
        Session session = sessionFactory.openSession();
        Review results = session.get( Review.class, id );
        session.close();
        return results;
    }

    /**
     * update user
     * @param trip  Destination to be inserted or updated
     */
    public void saveOrUpdate(Review trip) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(trip);
        transaction.commit();
        session.close();
    }

    /**
     * update user
     * @param Trip Review to be inserted or updated
     */
    public int insert(Review Trip) {
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
}
