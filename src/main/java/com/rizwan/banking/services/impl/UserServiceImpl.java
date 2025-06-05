package com.rizwan.banking.services.impl;

import com.rizwan.banking.dto.UserDto;
import com.rizwan.banking.models.User;
import com.rizwan.banking.repositories.UserRepository;
import com.rizwan.banking.services.UserService;

import com.rizwan.banking.validators.ObjectsValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {


    private final UserRepository repository;
    private final ObjectsValidator<UserDto> validator;

    @Override
    public Integer save(UserDto dto) {
        validator.validate(dto);
        User user = UserDto.toEntity(dto);
        return repository.save(user).getId();
    }

    @Override
    public List<UserDto> findALl() {
        return List.of();
    }

    @Override
    public UserDto findById(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
