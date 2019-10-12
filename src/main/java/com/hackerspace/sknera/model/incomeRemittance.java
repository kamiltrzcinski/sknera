package com.hackerspace.sknera.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class incomeRemittance {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Date operationDate;

    private Date postDate;

    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "memberId")
    private User user;


}
