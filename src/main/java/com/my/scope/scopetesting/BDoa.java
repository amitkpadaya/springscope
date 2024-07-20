package com.my.scope.scopetesting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BDoa {
    private static Logger LOGGER = LoggerFactory.getLogger(BDoa.class);
    private JDBCTemplate jdbcTemplate;

    public BDoa(JDBCTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JDBCTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JDBCTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
