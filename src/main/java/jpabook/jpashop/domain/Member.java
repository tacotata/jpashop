package jpabook.jpashop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Member {

    @Id @GeneratedValue
    @Column(name ="MEMBER_ID")
    private Long id;
    private String name;
    private String street;
    private String zipcode;
//
//    public Member() {
//
//    }
    // getter setter는 다 만들필요가 없긴한데 getter는 가급적만들고
    //setter는 좀 그래 가급적 생성자에서 다 세팅하고 setter 사용 최소화해야함
    //유지보수 위해서 어디서든 set하면 찾기 힘들어
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
