# Recipe Manager and Meal Planner

## Object-Oriented Programming Term Project

---

## Student Information

| Field | Value |
| --- | --- |
| **Name** | Batin SENYUZ |
| **Student ID** | 1006834 |
| **Course** | Object-Oriented Programming |
| **Submission Date** | 25.12.2025 |

---

## Assigned Topic

**Recipe Manager and Meal Planner** - A console-based Java application designed to help users manage their culinary collection and plan weekly meals. The system allows users to create detailed recipes with ingredients, organize them, and schedule meals for specific days of the week, demonstrating core OOP principles in a practical scenario.

---

## System Architecture

### Overview

The Recipe Manager and Meal Planner is architected as a modular system that emphasizes the separation of data models from management logic. At its core is the abstract `Item` class, which establishes a uniform contract for all entities in the system. The `Recipe` class extends this abstraction to provide specific functionality for handling culinary instructions and ingredients. The system relies on two main manager classes: `RecipeManager` for maintaining the repository of available recipes using an `ArrayList`, and `MealPlanner` for scheduling these recipes across the week using a `HashMap`. The application is driven by a `Main` class that facilitates user interaction via the console, orchestrating the flow between defining recipes and planning meals.

### UML Class Diagram

![image.png](Recipe%20Manager%20and%20Meal%20Planner/image.png)

---

## Class Descriptions and Collaboration

### Item (Abstract Class)

The `Item` class serves as the foundational **abstract base class** for the system. It encapsulates shared attributes such as a unique `id` and a `name`, which are common to all trackable entities. By defining the **abstract method** `getDetails()`, it enforces a contract that requires all subclasses to implement their own logic for displaying information. This design promotes **polymorphism**, allowing the system to treat different types of items uniformly.

### Recipe

The `Recipe` class is a concrete implementation that **inherits** from `Item`. It represents a specific dish and extends the base functionality by adding attributes for `prepTime`, `difficulty`, and a collection of ingredients.
- **Polymorphism (Overriding):** It overrides `getDetails()` to provide a formatted output of the recipe, including its ingredients.
- **Polymorphism (Overloading):** It provides multiple `addIngredient` methods, allowing flexibility in how ingredients are added (either as raw strings or objects).
- **Composition:** It maintains a list of `Ingredient` objects, establishing a strong “Has-A” relationship where the recipe acts as the container for its components.
- **Static State:** It uses a `static idCounter` to auto-generate unique IDs for every new recipe instance.

### Ingredient

The `Ingredient` class represents a component of a recipe, storing details like name, amount, and calories. It overrides the `toString()` method to provide a string representation of itself, which is used by the `Recipe` class when listing ingredients.

### RecipeManager

The `RecipeManager` class tracks all available recipes in the system. It uses an `ArrayList<Recipe>` to store the collection.
- **Encapsulation:** It hides the internal list structure and provides public methods (`addRecipe`, `listRecipes`) to manipulate the data.
- **Association:** It holds references to `Recipe` objects, managing their lifecycle within the application’s context.

### MealPlanner

The `MealPlanner` class handles the scheduling aspect of the application. It uses a `HashMap<String, Recipe>` to map days of the week (Keys) to specific `Recipe` objects (Values).
- **Efficiency:** The use of a HashMap allows for O(1) time complexity when looking up the meal for a specific day.
- **Collaboration:** It collaborates with `Recipe` objects but does not own them; it simply links a time slot to an existing recipe.

### Main

The `Main` class is the entry point of the application. It instantiates the `RecipeManager` and `MealPlanner`, creates sample data (Recipes and Ingredients), and handles user input. It acts as the coordinator, ensuring the correct flow of data between the user and the backend classes.

---

## Key Relationships

### Inheritance (IS-A)

- `Recipe` **IS-A** `Item`.
This relationship allows `Recipe` to inherit the `id` and `name` properties and the obligation to implement `getDetails()`.

### Composition (HAS-A)

- `Recipe` **HAS-A** `Ingredient`.
Recipes are composed of ingredients. This is a strong relationship where ingredients are conceptually parts of the recipe.

### Association

- `RecipeManager` is associated with `Recipe` (it manages a collection of them).
- `MealPlanner` is associated with `Recipe` (it maps days to recipes).

---

## OOP Concepts Implementation Summary

| Concept | Implementation Location |
| --- | --- |
| **Abstract Class** | `Item` class with abstract method `getDetails()` |
| **Inheritance** | `Recipe` extends `Item` |
| **Method Overriding** | `getDetails()` in `Recipe`, `toString()` in `Ingredient` |
| **Method Overloading** | `addIngredient(String, String)` vs `addIngredient(Ingredient)` |
| **Encapsulation** | Private fields (`recipes`, `weeklyPlan`) with public accessors |
| **Collections** | `ArrayList` in `RecipeManager`, `HashMap` in `MealPlanner` |
| **Static Members** | `Recipe.idCounter` (field), `Main.main` (method) |
| **Polymorphism** | `Item` references (if used) holding `Recipe` objects; overridden methods |

---

## File Structure

```
OOP_Project/
├── src/
│   ├── Item.java          # Abstract base class
│   ├── Recipe.java        # Concrete class extending Item
│   ├── Ingredient.java    # Component class for Recipe
│   ├── RecipeManager.java # Manages list of recipes
│   ├── MealPlanner.java   # Manages weekly schedule
│   └── Main.java          # Entry point and testing
├── README.md              # This documentation file
└── defense.md             # Preparation guide for oral defense
```