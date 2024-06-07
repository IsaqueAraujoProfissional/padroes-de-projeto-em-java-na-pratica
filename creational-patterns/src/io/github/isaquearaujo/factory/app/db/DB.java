package io.github.isaquearaujo.factory.app.db;

public interface DB {
    void query(String sql);
    void update(String sql);
}
