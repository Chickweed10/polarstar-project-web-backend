package com.chickweed.andriod.polarstar.repository.repositoryInterface;

import com.chickweed.andriod.polarstar.domain.Clientage;
import com.chickweed.andriod.polarstar.domain.Guardian;

public interface GuardianRepository {
    boolean guardianCreate(Guardian guardian); //보호자 회원가입
}
