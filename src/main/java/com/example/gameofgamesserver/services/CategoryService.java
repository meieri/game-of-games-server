package com.example.gameofgamesserver.services;

import com.example.gameofgamesserver.models.Category;
import com.example.gameofgamesserver.models.Game;
import com.example.gameofgamesserver.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository repository;

    public Category createCategory(Category category, Game game) {
        category.setGame(game);
        return repository.save(category);
    }

    public List<Category> findCategoriesForGame(Integer gameId) {
        return repository.findCategoriesForGame(gameId);
    }

}
