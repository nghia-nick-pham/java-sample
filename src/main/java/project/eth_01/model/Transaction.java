package project.eth_01.model;

import java.math.BigDecimal;
import java.util.Date;


public class Transaction {

    private String txnHash;
    private String method;
    private String block;
    private Date age;
    private String addressFrom;
    private String addressTo;
    private String nameTo;
    private BigDecimal value;
    private String unit;
    private BigDecimal txnFee;

    public Transaction() {
    }


    public Transaction(String txnHash, String method, String block, Date age, String addressFrom, String addressTo, String nameTo, BigDecimal value, String unit, BigDecimal txnFee) {
        this.txnHash = txnHash;
        this.method = method;
        this.block = block;
        this.age = age;
        this.addressFrom = addressFrom;
        this.addressTo = addressTo;
        this.nameTo = nameTo;
        this.value = value;
        this.unit = unit;
        this.txnFee = txnFee;
    }

    public String getNameTo() {
        return nameTo;
    }

    public void setNameTo(String nameTo) {
        this.nameTo = nameTo;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getTxnFee() {
        return txnFee;
    }

    public void setTxnFee(BigDecimal txnFee) {
        this.txnFee = txnFee;
    }

    public String getTxnHash() {
        return txnHash;
    }

    public void setTxnHash(String txnHash) {
        this.txnHash = txnHash;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    public String getAddressFrom() {
        return addressFrom;
    }

    public void setAddressFrom(String addressFrom) {
        this.addressFrom = addressFrom;
    }

    public String getAddressTo() {
        return addressTo;
    }

    public void setAddressTo(String addressTo) {
        this.addressTo = addressTo;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
