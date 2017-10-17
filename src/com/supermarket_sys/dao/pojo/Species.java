package com.supermarket_sys.dao.pojo;

public class Species {
    private int k_id;
    private String k_name;
    private int f_id;
    private String k_acronym;
    private String k_remark;

    public String getK_name() {
        return k_name;
    }

    public void setK_name(String k_name) {
        this.k_name = k_name;
    }

    public int getF_id() {
        return f_id;
    }

    public void setF_id(int f_id) {
        this.f_id = f_id;
    }

    public int getK_id() {

        return k_id;
    }

    public void setK_id(int k_id) {
        this.k_id = k_id;
    }

    public String getK_remark() {
        return k_remark;
    }

    public void setK_remark(String k_remark) {
        this.k_remark = k_remark;
    }

    public String getK_acronym() {
        return k_acronym;
    }

    public void setK_acronym(String k_acronym) {
        this.k_acronym = k_acronym;
    }
}
