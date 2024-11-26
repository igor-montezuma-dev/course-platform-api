package com.montezumadev.coursesplatformapi.utility;

import com.montezumadev.coursesplatformapi.dao.UserDao;
import com.montezumadev.coursesplatformapi.entity.User;
import jakarta.persistence.EntityNotFoundException;

public class OperationUtility {

    public static void usersOperations(UserDao userDao){
        createUsers(userDao);
        updateUser(userDao);
        deleteUser(userDao);
        fetchUsers(userDao);
    }

    private static void fetchUsers(UserDao userDao) {
        userDao.findAll().forEach(user -> System.out.println(user.toString()));
    }


    private static void createUsers(UserDao userDao) {
        User user1 = new User("user1@email.com", "pass1");
        userDao.save(user1);

        User user2 = new User("user2@email.com", "pass2");
        userDao.save(user2);

        User user3 = new User("user3@email.com", "pass3");
        userDao.save(user3);

        User user4 = new User("user4@email.com", "pass4");
        userDao.save(user4);
    }

    private static void updateUser(UserDao userDao) {
       User user = userDao.findById(2L).orElseThrow(()-> new EntityNotFoundException("User not found"));
       user.setEmail("new@email@gmail.com");
       userDao.save(user);
    }

    private static void deleteUser(UserDao userDao) {
        User user = userDao.findById(3L).orElseThrow(()-> new EntityNotFoundException("User not found"));
        userDao.delete(user);
    }
}
