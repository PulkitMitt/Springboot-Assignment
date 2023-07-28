package com.geekster.RecipeManagementSystemAPI.repository;

import com.geekster.RecipeManagementSystemAPI.model.Comment;
import com.geekster.RecipeManagementSystemAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommentRepo extends JpaRepository<Comment, Integer> {
}
