package com.chickweed.andriod.polarstar.service;

import com.chickweed.andriod.polarstar.DTO.UserCreateDTO;
import com.chickweed.andriod.polarstar.domain.Clientage;
import com.chickweed.andriod.polarstar.domain.Guardian;
import com.chickweed.andriod.polarstar.domain.User;
import com.chickweed.andriod.polarstar.repository.repositoryInterface.ClientageRepository;
import com.chickweed.andriod.polarstar.repository.repositoryInterface.GuardianRepository;
import com.chickweed.andriod.polarstar.repository.repositoryInterface.UserRepository;
import com.chickweed.andriod.polarstar.service.serviceInterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ClientageRepository clientageRepository;
    private final GuardianRepository guardianRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, ClientageRepository clientageRepository, GuardianRepository guardianRepository) {
        this.userRepository = userRepository;
        this.clientageRepository = clientageRepository;
        this.guardianRepository = guardianRepository;
    }

    @Override
    public boolean userCreate(UserCreateDTO userCreateDTO) throws IOException {
        Clientage clientage = null;
        Guardian guardian = null;

        if(userCreateDTO.getUserInfoCreateDTO().getUserClassification() == 1){ //피보호자일 경우
            clientage = new Clientage(userCreateDTO.getUserInfoCreateDTO().getUserPhoneNumber(),
                    userCreateDTO.getUserInfoCreateDTO().getUserPassword(),
                    null,
                    userCreateDTO.getUserInfoCreateDTO().getUserName(),
                    userCreateDTO.getUserInfoCreateDTO().getUserBirth(),
                    userCreateDTO.getUserInfoCreateDTO().getUserSex(),
                    userCreateDTO.getUserInfoCreateDTO().getUserAddress(),
                    userCreateDTO.getUserInfoCreateDTO().getUserDetailAddress(),
                    userCreateDTO.getUserInfoCreateDTO().getUserConnectionCode(),
                    null);

            return clientageRepository.clientageCreate(clientage);
        }
        else if(userCreateDTO.getUserInfoCreateDTO().getUserClassification() == 2){ //보호자일 경우
            guardian = new Guardian(userCreateDTO.getUserInfoCreateDTO().getUserPhoneNumber(),
                    userCreateDTO.getUserInfoCreateDTO().getUserPassword(),
                    null,
                    userCreateDTO.getUserInfoCreateDTO().getUserName(),
                    userCreateDTO.getUserInfoCreateDTO().getUserBirth(),
                    userCreateDTO.getUserInfoCreateDTO().getUserSex(),
                    userCreateDTO.getUserInfoCreateDTO().getUserAddress(),
                    userCreateDTO.getUserInfoCreateDTO().getUserDetailAddress(),
                    userCreateDTO.getUserInfoCreateDTO().getUserConnectionCode(),
                    null);

            return guardianRepository.guardianCreate(guardian);
        }

        return false;
    }
}
