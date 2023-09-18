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

            // 비영속 상태
            Member member = new Member();
            member.setId(100L);
            member.setName("helloJPA");

            // 영속 상태로 전환
            em.persist(member);

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
