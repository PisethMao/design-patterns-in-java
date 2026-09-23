package com.piseth.patterns.creational.prototype.paymentexample;

public class TransactionConfig {
    private String channel;
    private String country;
    private String currency;
    private Integer timeoutSeconds;
    private Integer retryCount;

    public TransactionConfig(String channel, String country, String currency, Integer timeoutSeconds, Integer retryCount) {
        this.channel = channel;
        this.country = country;
        this.currency = currency;
        this.timeoutSeconds = timeoutSeconds;
        this.retryCount = retryCount;
    }

    public TransactionConfig(TransactionConfig source) {
        this.channel = source.channel;
        this.country = source.country;
        this.currency = source.currency;
        this.timeoutSeconds = source.timeoutSeconds;
        this.retryCount = source.retryCount;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    public Integer getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
    }

    @Override
    public String toString() {
        return "TransactionConfig{" +
                "channel='" + channel + '\'' +
                ", country='" + country + '\'' +
                ", currency='" + currency + '\'' +
                ", timeoutSeconds=" + timeoutSeconds +
                ", retryCount=" + retryCount +
                '}';
    }
}
