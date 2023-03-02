package com.taskable.organise.user;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

public interface UserRepo extends JpaRepository<User, Integer> {
}
