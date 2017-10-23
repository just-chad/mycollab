package com.mycollab.module.crm.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.crm.domain.ContactCase;
import com.mycollab.module.crm.domain.ContactCaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface ContactCaseMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_cases
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    long countByExample(ContactCaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_cases
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    int deleteByExample(ContactCaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_cases
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    @Delete({
        "delete from m_crm_contacts_cases",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_cases
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    @Insert({
        "insert into m_crm_contacts_cases (id, contactId, ",
        "caseId, createdTime)",
        "values (#{id,jdbcType=INTEGER}, #{contactid,jdbcType=INTEGER}, ",
        "#{caseid,jdbcType=INTEGER}, #{createdtime,jdbcType=TIMESTAMP})"
    })
    int insert(ContactCase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_cases
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    int insertSelective(ContactCase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_cases
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    List<ContactCase> selectByExample(ContactCaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_cases
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    @Select({
        "select",
        "id, contactId, caseId, createdTime",
        "from m_crm_contacts_cases",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.mycollab.module.crm.dao.ContactCaseMapper.BaseResultMap")
    ContactCase selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_cases
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    int updateByExampleSelective(@Param("record") ContactCase record, @Param("example") ContactCaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_cases
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    int updateByExample(@Param("record") ContactCase record, @Param("example") ContactCaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_cases
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    int updateByPrimaryKeySelective(ContactCase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_cases
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    @Update({
        "update m_crm_contacts_cases",
        "set contactId = #{contactid,jdbcType=INTEGER},",
          "caseId = #{caseid,jdbcType=INTEGER},",
          "createdTime = #{createdtime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ContactCase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_cases
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    Integer insertAndReturnKey(ContactCase value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_cases
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_cases
     *
     * @mbg.generated Sat Oct 21 18:03:12 ICT 2017
     */
    void massUpdateWithSession(@Param("record") ContactCase record, @Param("primaryKeys") List primaryKeys);
}