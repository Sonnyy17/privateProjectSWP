/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.utils;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author MSI VN
 */
public class Helper {

    public static void setParams(PreparedStatement ps, List<Object> args) throws SQLException {
        int i = 1;
        for (Object arg : args) {
            if (arg instanceof Date) {
                ps.setTimestamp(i++, new Timestamp(((Date) arg).getTime()));
            } else if (arg instanceof Integer) {
                ps.setInt(i++, (Integer) arg);
            } else if (arg instanceof Long) {
                ps.setLong(i++, (Long) arg);
            } else if (arg instanceof Double) {
                ps.setDouble(i++, (Double) arg);
            } else if (arg instanceof Float) {
                ps.setFloat(i++, (Float) arg);
            } else if (arg instanceof Boolean) {
                ps.setBoolean(i++, (Boolean) arg);
            } else {
                ps.setString(i++, (String) arg);
            }
        }
    }

}
