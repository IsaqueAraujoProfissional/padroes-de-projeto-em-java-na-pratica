package io.github.isaquearaujo.factory.app;

import io.github.isaquearaujo.factory.app.db.DB;
import io.github.isaquearaujo.factory.app.db.OracleDB;
import io.github.isaquearaujo.factory.app.factory.OracleFactory;

public class Client {

    public static void main(String[] args) {
//		DB db = new PostgresFactory().getDatabase();
        DB db = new OracleFactory().getDatabase();
        db.query("SELECT * FROM users");
        db.update("INSERT INTO users VALUES ('User', 25)");
    }
}
