package com.geekster.RecipeManagementSystemAPI.repository;

import com.geekster.RecipeManagementSystemAPI.model.Admin;
import com.geekster.RecipeManagementSystemAPI.model.AuthenticationToken;
import com.geekster.RecipeManagementSystemAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthenticationRepo extends JpaRepository<AuthenticationToken,Long> {

    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByUser(User user);


}
