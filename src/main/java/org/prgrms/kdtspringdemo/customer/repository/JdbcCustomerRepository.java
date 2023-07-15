package org.prgrms.kdtspringdemo.customer.repository;

import org.prgrms.kdtspringdemo.customer.constant.CustomerQuery;
import org.prgrms.kdtspringdemo.customer.model.entity.Customer;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import static org.prgrms.kdtspringdemo.customer.exception.CustomerExceptionMessage.*;
import static org.prgrms.kdtspringdemo.util.JdbcUtils.*;

@Repository
public class JdbcCustomerRepository implements CustomerRepository {
    private static final String CUSTOMER_ID = "customer_id";
    private static final String NICKNAME = "nickname";
    private final NamedParameterJdbcTemplate jdbcTemplate;

    public JdbcCustomerRepository(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private Map<String, Object> toParamMap(Customer customer) {
        return Map.of(
                CUSTOMER_ID, customer.getCustomerId().toString().getBytes(),
                NICKNAME, customer.getNickname()
        );
    }

    @Override
    public Customer save(Customer customer) {
        int savedCustomerRow = jdbcTemplate.update(CustomerQuery.CREATE.getQuery(), toParamMap(customer));
        if (savedCustomerRow != SUCCESS_SAVE_QUERY) {
            throw new RuntimeException(FAILED_CUSTOMER_SAVE_QUERY.getMessage());
        }

        return customer;
    }

    @Override
    public Customer findById(UUID customerId) {
        return null;
    }

    @Override
    public Optional<Customer> findByNickname(String nickname) {
        return Optional.empty();
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public Customer deleteById(UUID customerId) {
        return null;
    }
}
