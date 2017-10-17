package com.supermarket_sys.dao.pojo;

public class Commodity {
    private Integer com_id;
    private Species species;
    private Suppelier suppelier;
    private String com_name;
    private String com_num;
    private Integer com_state;
    private String Com_brand;
    private String com_produced;
    private String com_ESL;
    private String com_discount;
    private String com_sellprice;

    public Integer getCom_id() {
        return com_id;
    }

    public void setCom_id(Integer com_id) {
        this.com_id = com_id;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Suppelier getSuppelier() {
        return suppelier;
    }

    public void setSuppelier(Suppelier suppelier) {
        this.suppelier = suppelier;
    }

    public String getCom_name() {
        return com_name;
    }

    public void setCom_name(String com_name) {
        this.com_name = com_name;
    }

    public String getCom_num() {
        return com_num;
    }

    public void setCom_num(String com_num) {
        this.com_num = com_num;
    }

    public Integer getCom_state() {
        return com_state;
    }

    public void setCom_state(Integer com_state) {
        this.com_state = com_state;
    }

    public String getCom_brand() {
        return Com_brand;
    }

    public void setCom_brand(String com_brand) {
        Com_brand = com_brand;
    }

    public String getCom_produced() {
        return com_produced;
    }

    public void setCom_produced(String com_produced) {
        this.com_produced = com_produced;
    }

    public String getCom_ESL() {
        return com_ESL;
    }

    public void setCom_ESL(String com_ESL) {
        this.com_ESL = com_ESL;
    }

    public String getCom_discount() {
        return com_discount;
    }

    public void setCom_discount(String com_discount) {
        this.com_discount = com_discount;
    }

    public String getCom_sellprice() {
        return com_sellprice;
    }

    public void setCom_sellprice(String com_sellprice) {
        this.com_sellprice = com_sellprice;
    }
}
