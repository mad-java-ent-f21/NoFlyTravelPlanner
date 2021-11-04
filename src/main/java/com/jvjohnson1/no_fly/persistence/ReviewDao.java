package com.jvjohnson1.no_fly.persistence;

import com.jvjohnson1.no_fly.entity.Destination;
import com.jvjohnson1.no_fly.entity.Review;
import com.jvjohnson1.no_fly.entity.User;
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
    public List<Review> getByDestination(int id) {
        Session session = sessionFactory.openSession();
        String propertyName = "DestinationID";
        logger.debug("Searching for reviews by destination " + id);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Review> query = builder.createQuery( Review.class );
        Root<Review> root = query.from( Review.class );
        query.select(root).where(builder.equal(root.get(propertyName), id));
        List<Review> trips = session.createQuery( query ).getResultList();

        session.close();
        return trips;
    }

    public List<Review> getByUserID(int id) {
        Session session = sessionFactory.openSession();
        String propertyName = "userid";
        logger.debug("Searching for reviews by writer id " + id);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Review> query = builder.createQuery( Review.class );
        Root<Review> root = query.from( Review.class );
        query.select(root).where(builder.equal(root.get(propertyName), id));
        List<Review> trips = session.createQuery( query ).getResultList();

        session.close();
        return trips;
    }

    public Review getByFullKey(int writer, int place) {
        List<Review> step = getByUserID(writer);
        for (Review by : step) {
            if (by.getDestinationId() == place) {
                return by;
            }
        }
        return null;
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
    public void delete(Review Trip) {
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
    public List<Review> getByPropertyEqual(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for destination with " + propertyName + " = " + value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Review> query = builder.createQuery( Review.class );
        Root<Review> root = query.from( Review.class );
        query.select(root).where(builder.equal(root.get(propertyName), value));
        List<Review> trips = session.createQuery( query ).getResultList();

        session.close();
        return trips;
    }
}
