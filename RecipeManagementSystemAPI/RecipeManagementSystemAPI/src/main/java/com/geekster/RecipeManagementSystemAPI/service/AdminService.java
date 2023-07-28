package com.geekster.RecipeManagementSystemAPI.service;

import com.geekster.RecipeManagementSystemAPI.repository.IAdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    IAdminRepo adminRepo;
}
