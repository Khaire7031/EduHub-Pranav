package com.pdk.eduhub.Service;

import com.pdk.eduhub.Dto.UserDto;

import java.util.List;

public interface UserService {

    // Create User
    UserDto createUser(UserDto userDto);

    // Get User by ID
    UserDto getUserById(Integer userId);

    // Update User
    UserDto updateUser(Integer userId, UserDto userDto);

    // Delete User
    void deleteUser(Integer userId);

    // List Users
    List<UserDto> getAllUsers();

    // User Search
    List<UserDto> searchUser(String keyword);
}
