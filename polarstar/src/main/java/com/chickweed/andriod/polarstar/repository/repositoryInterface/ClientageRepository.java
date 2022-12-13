package com.chickweed.andriod.polarstar.repository.repositoryInterface;

import com.chickweed.andriod.polarstar.domain.Clientage;
import com.chickweed.andriod.polarstar.domain.User;

public interface ClientageRepository {
    boolean clientageCreate(Clientage clientage); //피보호자 회원가입
}
