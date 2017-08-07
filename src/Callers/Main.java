package Callers;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.sun.media.jfxmedia.logging.Logger;

import Basic.BanksEntity;
import Basic.UserEntity;
import External.Pricing;

public class Main {

	private static EntityManagerFactory factory;
	static String PERSISTENCE_UNIT_NAME ="MakeMoney.Basic";
    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        // read the existing entries and write to console
        Query q = em.createQuery("select user from UserEntity user");
        @SuppressWarnings("unchecked")
		List<UserEntity> users = q.getResultList();
        System.out.println();
        System.out.println();
        System.out.println();
        /*UserEntity user2 = new UserEntity();
        user2.setAccess("ADMIN");
        user2.setName("kagrawala");
        em.getTransaction().begin();
        em.persist(user2);
        em.getTransaction().commit();*/
        for (UserEntity user : users) {
        	System.out.println();
            System.out.printf("Id: %d, Name: %s, Swiftcode: %s\n", user.getId(), user.getName(), user.getAccess());
        	//System.out.printf("Id: %d\n",user.getId()); 
        }
        System.out.println("Size: " + users.size());
        em.close();
        
        Pricing prices = new Pricing();
        System.out.println("Fetching Currency");
        prices.conneect();
    }
}