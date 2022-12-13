package com.chickweed.andriod.polarstar.repository;

import com.chickweed.andriod.polarstar.domain.Clientage;
import com.chickweed.andriod.polarstar.repository.repositoryInterface.ClientageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

@Repository
public class ClientageRepositoryImpl implements ClientageRepository {

    private final EntityManager em;

    public ClientageRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public boolean clientageCreate(Clientage clientage) { //피보호자 회원가입
        try{
            em.persist(clientage);

            return true;
        } catch (PersistenceException | IllegalStateException e){
            System.out.println("clientageCreate 오류");

            return false;
        }
    }
}
