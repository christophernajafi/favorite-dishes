package com.chrisnajafi.favdish.model.database

import androidx.room.Dao
import androidx.room.Insert
import com.chrisnajafi.favdish.model.entities.FavDish

@Dao
interface FavDishDao {

    @Insert
    suspend fun insertFavDishDetails(favDish: FavDish) {

    }
}