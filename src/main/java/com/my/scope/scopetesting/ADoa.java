package com.my.scope.scopetesting;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ADoa {
    private static Logger LOGGER = LoggerFactory.getLogger(ADoa.class);
    private JDBCTemplate jdbcTemplate;

    public ADoa(JDBCTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JDBCTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JDBCTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
