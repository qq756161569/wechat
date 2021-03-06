package com.tracy.dao;

import com.tracy.model.User;
import com.tracy.model.UserExample;
import java.util.List;

public interface ICrudUserDao {
    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table tb_user
     *
     * @ibatorgenerated Sun Apr 03 21:33:32 CST 2016
     */
    int countByExample(UserExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table tb_user
     *
     * @ibatorgenerated Sun Apr 03 21:33:32 CST 2016
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table tb_user
     *
     * @ibatorgenerated Sun Apr 03 21:33:32 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table tb_user
     *
     * @ibatorgenerated Sun Apr 03 21:33:32 CST 2016
     */
    void insert(User record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table tb_user
     *
     * @ibatorgenerated Sun Apr 03 21:33:32 CST 2016
     */
    void insertSelective(User record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table tb_user
     *
     * @ibatorgenerated Sun Apr 03 21:33:32 CST 2016
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table tb_user
     *
     * @ibatorgenerated Sun Apr 03 21:33:32 CST 2016
     */
    User selectByPrimaryKey(Long id);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table tb_user
     *
     * @ibatorgenerated Sun Apr 03 21:33:32 CST 2016
     */
    int updateByExampleSelective(User record, UserExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table tb_user
     *
     * @ibatorgenerated Sun Apr 03 21:33:32 CST 2016
     */
    int updateByExample(User record, UserExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table tb_user
     *
     * @ibatorgenerated Sun Apr 03 21:33:32 CST 2016
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table tb_user
     *
     * @ibatorgenerated Sun Apr 03 21:33:32 CST 2016
     */
    int updateByPrimaryKey(User record);
}