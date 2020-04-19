package com.xlx.db.type.handler;

import com.google.gson.Gson;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author xueleixi
 * @date 2019-08-21 11:35
 */
public class Json extends BaseTypeHandler<Object>
{
  @Override
  public void setNonNullParameter(
      PreparedStatement ps, int i, Object parameter, JdbcType jdbcType
  ) throws SQLException
  {
    ps.setString(i,new Gson().toJson(parameter));
  }

  @Override
  public Object getNullableResult(ResultSet rs, String columnName) throws SQLException
  {
    return null;
  }

  @Override
  public Object getNullableResult(ResultSet rs, int columnIndex) throws SQLException
  {
    return null;
  }

  @Override
  public Object getNullableResult(CallableStatement cs, int columnIndex) throws SQLException
  {
    return null;
  }
}
