package com.geekster.RecipeManagementSystemAPI.repository;

import com.geekster.RecipeManagementSystemAPI.model.Admin;
import com.geekster.RecipeManagementSystemAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin, Long> {
}
