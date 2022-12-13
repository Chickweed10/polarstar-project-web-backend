package com.chickweed.andriod.polarstar.repository;

import com.chickweed.andriod.polarstar.domain.User;
import com.chickweed.andriod.polarstar.repository.repositoryInterface.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository {
    @PersistenceContext// EntityManagerFactory가 DI 할 수 있도록 어노테이션 설정
    private final EntityManager em;

    @Autowired
    public UserRepositoryImpl(EntityManager em) {
        this.em = em;
    }

}
