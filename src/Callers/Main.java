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

public class Main {

	private static EntityManagerFactory factory;
	static String PERSISTENCE_UNIT_NAME ="MakeMoney.Basic";
    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        // read the existing entries and write to console
        Query q = em.createQuery("select bank from BanksEntity bank");
        @SuppressWarnings("unchecked")
		List<BanksEntity> banks = q.getResultList();
        System.out.println();
        System.out.println();
        System.out.println();
        for (BanksEntity bank : banks) {
        	System.out.println();
            System.out.printf("Id: %d, Name: %s, Swiftcode: %s\n", bank.getId(), bank.getName(), bank.getSwiftCode());
        }
        System.out.println("Size: " + banks.size());

        em.close();
    }
}