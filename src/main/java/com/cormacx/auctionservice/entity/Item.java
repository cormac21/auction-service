package com.cormacx.auctionservice.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Auction auction;

    private Double minimumBid;
    private Double maximumBid;

    private Double desiredPrice;

    private ItemStatus status;

    @OneToMany
    private List<Bid> bids;

}
