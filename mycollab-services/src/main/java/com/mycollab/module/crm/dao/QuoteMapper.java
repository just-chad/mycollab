package com.mycollab.module.crm.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.crm.domain.Quote;
import com.mycollab.module.crm.domain.QuoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface QuoteMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    long countByExample(QuoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    int deleteByExample(QuoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    @Delete({
        "delete from m_crm_quote",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    @Insert({
        "insert into m_crm_quote (id, subject, ",
        "quotestage, opportunityid, ",
        "validuntil, shipping, ",
        "billaccount, billcontact, ",
        "shipaccount, shipcontact, ",
        "billingaddress, billingcity, ",
        "billingstate, billingpostalcode, ",
        "billingcountry, shippingaddress, ",
        "shippingcity, shippingstate, ",
        "shippingpostalcode, shippingcountry, ",
        "description, paymentterm, ",
        "originalpodate, purchaseordernum, ",
        "createdTime, createdUser, ",
        "sAccountId, assignUser, ",
        "lastUpdatedTime)",
        "values (#{id,jdbcType=INTEGER}, #{subject,jdbcType=VARCHAR}, ",
        "#{quotestage,jdbcType=VARCHAR}, #{opportunityid,jdbcType=INTEGER}, ",
        "#{validuntil,jdbcType=TIMESTAMP}, #{shipping,jdbcType=VARCHAR}, ",
        "#{billaccount,jdbcType=INTEGER}, #{billcontact,jdbcType=INTEGER}, ",
        "#{shipaccount,jdbcType=INTEGER}, #{shipcontact,jdbcType=INTEGER}, ",
        "#{billingaddress,jdbcType=VARCHAR}, #{billingcity,jdbcType=VARCHAR}, ",
        "#{billingstate,jdbcType=VARCHAR}, #{billingpostalcode,jdbcType=VARCHAR}, ",
        "#{billingcountry,jdbcType=VARCHAR}, #{shippingaddress,jdbcType=VARCHAR}, ",
        "#{shippingcity,jdbcType=VARCHAR}, #{shippingstate,jdbcType=VARCHAR}, ",
        "#{shippingpostalcode,jdbcType=VARCHAR}, #{shippingcountry,jdbcType=VARCHAR}, ",
        "#{description,jdbcType=VARCHAR}, #{paymentterm,jdbcType=VARCHAR}, ",
        "#{originalpodate,jdbcType=TIMESTAMP}, #{purchaseordernum,jdbcType=VARCHAR}, ",
        "#{createdtime,jdbcType=TIMESTAMP}, #{createduser,jdbcType=VARCHAR}, ",
        "#{saccountid,jdbcType=INTEGER}, #{assignuser,jdbcType=VARCHAR}, ",
        "#{lastupdatedtime,jdbcType=TIMESTAMP})"
    })
    int insert(Quote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    int insertSelective(Quote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    List<Quote> selectByExample(QuoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    @Select({
        "select",
        "id, subject, quotestage, opportunityid, validuntil, shipping, billaccount, billcontact, ",
        "shipaccount, shipcontact, billingaddress, billingcity, billingstate, billingpostalcode, ",
        "billingcountry, shippingaddress, shippingcity, shippingstate, shippingpostalcode, ",
        "shippingcountry, description, paymentterm, originalpodate, purchaseordernum, ",
        "createdTime, createdUser, sAccountId, assignUser, lastUpdatedTime",
        "from m_crm_quote",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.mycollab.module.crm.dao.QuoteMapper.BaseResultMap")
    Quote selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    int updateByExampleSelective(@Param("record") Quote record, @Param("example") QuoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    int updateByExample(@Param("record") Quote record, @Param("example") QuoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    int updateByPrimaryKeySelective(Quote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    @Update({
        "update m_crm_quote",
        "set subject = #{subject,jdbcType=VARCHAR},",
          "quotestage = #{quotestage,jdbcType=VARCHAR},",
          "opportunityid = #{opportunityid,jdbcType=INTEGER},",
          "validuntil = #{validuntil,jdbcType=TIMESTAMP},",
          "shipping = #{shipping,jdbcType=VARCHAR},",
          "billaccount = #{billaccount,jdbcType=INTEGER},",
          "billcontact = #{billcontact,jdbcType=INTEGER},",
          "shipaccount = #{shipaccount,jdbcType=INTEGER},",
          "shipcontact = #{shipcontact,jdbcType=INTEGER},",
          "billingaddress = #{billingaddress,jdbcType=VARCHAR},",
          "billingcity = #{billingcity,jdbcType=VARCHAR},",
          "billingstate = #{billingstate,jdbcType=VARCHAR},",
          "billingpostalcode = #{billingpostalcode,jdbcType=VARCHAR},",
          "billingcountry = #{billingcountry,jdbcType=VARCHAR},",
          "shippingaddress = #{shippingaddress,jdbcType=VARCHAR},",
          "shippingcity = #{shippingcity,jdbcType=VARCHAR},",
          "shippingstate = #{shippingstate,jdbcType=VARCHAR},",
          "shippingpostalcode = #{shippingpostalcode,jdbcType=VARCHAR},",
          "shippingcountry = #{shippingcountry,jdbcType=VARCHAR},",
          "description = #{description,jdbcType=VARCHAR},",
          "paymentterm = #{paymentterm,jdbcType=VARCHAR},",
          "originalpodate = #{originalpodate,jdbcType=TIMESTAMP},",
          "purchaseordernum = #{purchaseordernum,jdbcType=VARCHAR},",
          "createdTime = #{createdtime,jdbcType=TIMESTAMP},",
          "createdUser = #{createduser,jdbcType=VARCHAR},",
          "sAccountId = #{saccountid,jdbcType=INTEGER},",
          "assignUser = #{assignuser,jdbcType=VARCHAR},",
          "lastUpdatedTime = #{lastupdatedtime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Quote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    Integer insertAndReturnKey(Quote value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    void massUpdateWithSession(@Param("record") Quote record, @Param("primaryKeys") List primaryKeys);
}