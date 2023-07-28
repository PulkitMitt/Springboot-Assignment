package com.geekster.RecipeManagementSystemAPI.service;

import com.geekster.RecipeManagementSystemAPI.model.RecipePost;
import com.geekster.RecipeManagementSystemAPI.model.User;
import com.geekster.RecipeManagementSystemAPI.repository.IRecipePostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RecipePostService {

    @Autowired
    IRecipePostRepo recipePostRepo;

    public String createRecipePost(RecipePost post) {
        post.setPostCreatedTimeStamp(LocalDateTime.now());
        recipePostRepo.save(post);
        return "Post uploaded!!!!";
    }

    public String removeRecipePost(Integer postId, User user) {
        RecipePost post  = recipePostRepo.findById(postId).orElse(null);
        if(post != null && post.getPostOwner().equals(user))
        {
            recipePostRepo.deleteById(postId);
            return "Removed successfully";
        }
        else if (post == null)
        {
            return "Post to be deleted does not exist";
        }
        else{
            return "Un-Authorized delete detected....Not allowed";
        }
    }

    public boolean validatePost(RecipePost recipePost) {
        return (recipePost!=null && recipePostRepo.existsById(recipePost.getRecipeId()));
    }
}
