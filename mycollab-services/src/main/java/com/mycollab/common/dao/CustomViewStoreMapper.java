package com.mycollab.common.dao;

import com.mycollab.common.domain.CustomViewStore;
import com.mycollab.common.domain.CustomViewStoreExample;
import com.mycollab.db.persistence.ICrudGenericDAO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface CustomViewStoreMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Sat Oct 21 18:03:32 ICT 2017
     */
    long countByExample(CustomViewStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Sat Oct 21 18:03:32 ICT 2017
     */
    int deleteByExample(CustomViewStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Sat Oct 21 18:03:32 ICT 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Sat Oct 21 18:03:32 ICT 2017
     */
    int insert(CustomViewStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Sat Oct 21 18:03:32 ICT 2017
     */
    int insertSelective(CustomViewStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Sat Oct 21 18:03:32 ICT 2017
     */
    List<CustomViewStore> selectByExampleWithBLOBs(CustomViewStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Sat Oct 21 18:03:32 ICT 2017
     */
    List<CustomViewStore> selectByExample(CustomViewStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Sat Oct 21 18:03:32 ICT 2017
     */
    CustomViewStore selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Sat Oct 21 18:03:32 ICT 2017
     */
    int updateByExampleSelective(@Param("record") CustomViewStore record, @Param("example") CustomViewStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Sat Oct 21 18:03:32 ICT 2017
     */
    int updateByExampleWithBLOBs(@Param("record") CustomViewStore record, @Param("example") CustomViewStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Sat Oct 21 18:03:32 ICT 2017
     */
    int updateByExample(@Param("record") CustomViewStore record, @Param("example") CustomViewStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Sat Oct 21 18:03:32 ICT 2017
     */
    int updateByPrimaryKeySelective(CustomViewStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Sat Oct 21 18:03:32 ICT 2017
     */
    int updateByPrimaryKeyWithBLOBs(CustomViewStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Sat Oct 21 18:03:32 ICT 2017
     */
    int updateByPrimaryKey(CustomViewStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Sat Oct 21 18:03:32 ICT 2017
     */
    Integer insertAndReturnKey(CustomViewStore value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Sat Oct 21 18:03:32 ICT 2017
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Sat Oct 21 18:03:32 ICT 2017
     */
    void massUpdateWithSession(@Param("record") CustomViewStore record, @Param("primaryKeys") List primaryKeys);
}