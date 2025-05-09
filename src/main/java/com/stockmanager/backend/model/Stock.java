package com.stockmanager.backend.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Stock {

    private String ticker;
    private String companyName;
    private Sectors sector;
    private Double noOfShares;
    private Double purchasePrice;
    private Double currentPrice;
    private BigDecimal currentReturn;
    private BigDecimal currentReturnTotal;
    private BigDecimal currentTotal;
    private LocalDate buyDate;

    public Stock(String ticker, String companyName, Sectors sector, Double noOfShares, Double purchasePrice, Double currentPrice, BigDecimal currentReturn, BigDecimal currentReturnTotal, BigDecimal currentTotal, LocalDate buyDate) {
        this.ticker = ticker;
        this.companyName = companyName;
        this.sector = sector;
        this.noOfShares = noOfShares;
        this.purchasePrice = purchasePrice;
        this.currentPrice = currentPrice;
        this.currentReturn = currentReturn;
        this.currentReturnTotal = currentReturnTotal;
        this.currentTotal = currentTotal;
        this.buyDate = buyDate;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Sectors getSector() {
        return sector;
    }

    public void setSector(Sectors sector) {
        this.sector = sector;
    }

    public Double getNoOfShares() {
        return noOfShares;
    }

    public void setNoOfShares(Double noOfShares) {
        this.noOfShares = noOfShares;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public BigDecimal getCurrentReturn() {
        return this.currentReturn;
    }

    public void setCurrentReturn(BigDecimal currentReturn) {
        this.currentReturn = currentReturn;
    }

    public BigDecimal getCurrentReturnTotal() {
        return this.currentReturnTotal;
    }

    public void setCurrentReturnTotal(BigDecimal currentReturnTotal) {
        this.currentReturnTotal = currentReturnTotal;
    }

    public BigDecimal getCurrentTotal() {
        return currentTotal;
    }

    public void setCurrentTotal(BigDecimal currentTotal) {
        this.currentTotal = currentTotal;
    }

    public LocalDate getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(LocalDate buyDate) {
        this.buyDate = buyDate;
    }
}
