package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private long clientId;

    @Column(nullable = false)
    private Date creationDate;

    @OneToMany(mappedBy = "portfolioId")
    private List<Security> securities;

    protected Portfolio () {}

    public Portfolio(long portfolioId, long clientId, Date creationDate) {
        this.portfolioId = portfolioId;
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
