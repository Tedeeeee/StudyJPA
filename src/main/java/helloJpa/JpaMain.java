package helloJpa;

import javax.persistence.*;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Member member = em.find(Member.class, 150L);
            member.setName("ZZZZZZ");

            if (member.getName().equals("ZZZZZZ")) {
                em.persist(member);
            }

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            //Manager 닫기
            em.close();
        }
        //Persistence 닫기
        emf.close();
    }
}
