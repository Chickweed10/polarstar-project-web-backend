package com.chickweed.andriod.polarstar.repository;

import com.chickweed.andriod.polarstar.domain.Guardian;
import com.chickweed.andriod.polarstar.repository.repositoryInterface.GuardianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

@Repository
public class GuardianRepositoryImpl implements GuardianRepository {
    private final EntityManager em;

    public GuardianRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public boolean guardianCreate(Guardian guardian) { //보호자 회원가입
        try{
            em.persist(guardian);

            return true;
        } catch (PersistenceException | IllegalStateException e){
            System.out.println("guardianCreate 오류");

            return false;
        }
    }
}
