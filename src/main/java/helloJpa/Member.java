package helloJpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {

    @Id // PK를 알려주는 어노테이션이다. 물론 JPA 가 사용할 수 있게 만들기 위해 작성
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
