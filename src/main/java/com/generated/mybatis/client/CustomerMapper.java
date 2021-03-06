package com.generated.mybatis.client;

import com.generated.mybatis.model.Customer;
import com.generated.mybatis.model.CustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface CustomerMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CUSTOMER
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	@SelectProvider(type = CustomerSqlProvider.class, method = "countByExample")
	int countByExample(CustomerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CUSTOMER
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	@DeleteProvider(type = CustomerSqlProvider.class, method = "deleteByExample")
	int deleteByExample(CustomerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CUSTOMER
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	@Delete({ "delete from CUSTOMER", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CUSTOMER
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	@Insert({ "insert into CUSTOMER (id, first, ", "last, awfulNAMEforCOLUMN)",
			"values (#{id,jdbcType=BIGINT}, #{first,jdbcType=VARCHAR}, ",
			"#{last,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR})" })
	int insert(Customer record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CUSTOMER
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	@InsertProvider(type = CustomerSqlProvider.class, method = "insertSelective")
	int insertSelective(Customer record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CUSTOMER
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	@SelectProvider(type = CustomerSqlProvider.class, method = "selectByExample")
	@Results({
			@Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "first", property = "first", jdbcType = JdbcType.VARCHAR),
			@Result(column = "last", property = "last", jdbcType = JdbcType.VARCHAR),
			@Result(column = "awfulNAMEforCOLUMN", property = "description", jdbcType = JdbcType.VARCHAR) })
	List<Customer> selectByExample(CustomerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CUSTOMER
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	@Select({ "select", "id, first, last, awfulNAMEforCOLUMN", "from CUSTOMER",
			"where id = #{id,jdbcType=BIGINT}" })
	@Results({
			@Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "first", property = "first", jdbcType = JdbcType.VARCHAR),
			@Result(column = "last", property = "last", jdbcType = JdbcType.VARCHAR),
			@Result(column = "awfulNAMEforCOLUMN", property = "description", jdbcType = JdbcType.VARCHAR) })
	Customer selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CUSTOMER
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	@UpdateProvider(type = CustomerSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") Customer record,
			@Param("example") CustomerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CUSTOMER
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	@UpdateProvider(type = CustomerSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") Customer record,
			@Param("example") CustomerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CUSTOMER
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	@UpdateProvider(type = CustomerSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(Customer record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CUSTOMER
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	@Update({ "update CUSTOMER", "set first = #{first,jdbcType=VARCHAR},",
			"last = #{last,jdbcType=VARCHAR},",
			"awfulNAMEforCOLUMN = #{description,jdbcType=VARCHAR}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(Customer record);
}