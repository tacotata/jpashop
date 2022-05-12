package jpabook.jpashop.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Delivery {

    @Id @GeneratedValue
    private Long id;

    private String street;
    private String zipcode;
    private String city;
    private DeliveryStatus  status;

    @OneToOne(mappedBy ="delivery")
    private Order order;
}
