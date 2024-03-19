package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolioId")
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private int purchasePrice;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private int quantity;

    protected Security() {}

    public Security(long securityId, long portfolioId, String name, String category, int purchasePrice, Date purchaseDate, int quantity) {
        this.securityId = securityId;
        this.portfolioId = portfolioId;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public long getSecurityId() {
        return securityId;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
