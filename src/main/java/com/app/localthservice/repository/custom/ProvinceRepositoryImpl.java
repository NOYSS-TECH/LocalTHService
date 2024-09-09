package com.app.localthservice.repository.custom;

import com.app.localthservice.repository.sql.StatementSQL;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.transform.AliasToEntityMapResultTransformer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ProvinceRepositoryImpl implements ProvinceRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List findAll() {
        Session session = (Session) entityManager.getDelegate();
        StringBuilder queryString = new StringBuilder();
        queryString.append(StatementSQL.PROVINCE);
        SQLQuery query = session.createSQLQuery(queryString.toString());
        query.setResultTransformer(AliasToEntityMapResultTransformer.INSTANCE);
        return query.list();
    }

    @Override
    public List findById(Long id) {
        Session session = (Session) entityManager.getDelegate();
        StringBuilder queryString = new StringBuilder();
        queryString.append(StatementSQL.PROVINCE);
        queryString.append("\n where id = " + id);
        SQLQuery query = session.createSQLQuery(queryString.toString());
        query.setResultTransformer(AliasToEntityMapResultTransformer.INSTANCE);
        return query.list();
    }

    @Override
    public List findByCode(String code) {
        Session session = (Session) entityManager.getDelegate();
        StringBuilder queryString = new StringBuilder();
        queryString.append(StatementSQL.PROVINCE);
        queryString.append("\n where code = '" + code + "'");
        SQLQuery query = session.createSQLQuery(queryString.toString());
        query.setResultTransformer(AliasToEntityMapResultTransformer.INSTANCE);
        return query.list();
    }
}
