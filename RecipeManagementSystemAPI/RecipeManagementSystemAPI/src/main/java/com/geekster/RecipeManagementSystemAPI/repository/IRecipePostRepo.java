package com.geekster.RecipeManagementSystemAPI.repository;

import com.geekster.RecipeManagementSystemAPI.model.RecipePost;
import com.geekster.RecipeManagementSystemAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRecipePostRepo extends JpaRepository<RecipePost, Integer> {
}
