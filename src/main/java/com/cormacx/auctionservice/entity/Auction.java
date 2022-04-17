package com.cormacx.auctionservice.entity;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Auction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private AuctionStatus status;

    @OneToMany(mappedBy = "auction", cascade = CascadeType.ALL)
    private List<Item> items;

}
