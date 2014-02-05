package se.emilsjolander.sprinkles;

/**
 * Created by emilsjolander on 06/02/14.
 */
public class SqlStatement {

    String sql;

    public SqlStatement(String sql) {
        this.sql = sql;
    }

    public void execute(Object... args) {
        DbOpenHelper.getInstance().execSQL(Utils.insertSqlArgs(sql, args));
    }

}
