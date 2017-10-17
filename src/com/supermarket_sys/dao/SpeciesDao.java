package com.supermarket_sys.dao;

import com.supermarket_sys.dao.pojo.Species;

public interface SpeciesDao {
    /**
     * 增加一个商品类别
     * @param species
     * @return boolean
     * */
    public boolean insert_species(Species species);


    /**
     * 查询商品类别
     * @param id
     * @return Species
     * */
    public Species qurey_species(int id);

    /**
     * 修改类别属性
     * @param species
     * @return boolean
     * */
    public boolean revamp_species(Species species);

    /**
     * 删除商品
     * @param id
     * @return boolean
     *
     * */
    public boolean delete_species(int id);


}
