package net.hirafoo.todo.mybatis.type;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;

import java.sql.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

@MappedTypes(LocalDateTime.class)
public class LocalDateTimeTypeHandler extends BaseTypeHandler<LocalDateTime> {
    public static final ZoneId ZONE_ID_DEFAULT = ZoneId.systemDefault();

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, LocalDateTime parameter, JdbcType jdbcType) throws SQLException {
        ps.setTimestamp(i, Timestamp.valueOf(parameter));
    }

    @Override
    public LocalDateTime getNullableResult(ResultSet rs, String columnName) throws SQLException {
        int epoch = rs.getInt(columnName);
        LocalDateTime date =
                LocalDateTime.ofInstant(Instant.ofEpochSecond(epoch), ZONE_ID_DEFAULT);
        return date;
    }

    @Override
    public LocalDateTime getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        int epoch = rs.getInt(columnIndex);
        LocalDateTime date =
                LocalDateTime.ofInstant(Instant.ofEpochSecond(epoch), ZONE_ID_DEFAULT);
        return date;
    }

    @Override
    public LocalDateTime getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        int epoch = cs.getInt(columnIndex);
        LocalDateTime date =
                LocalDateTime.ofInstant(Instant.ofEpochSecond(epoch), ZONE_ID_DEFAULT);
        return date;
    }
}

