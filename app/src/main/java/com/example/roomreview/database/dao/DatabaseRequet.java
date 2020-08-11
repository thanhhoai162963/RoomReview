package com.example.roomreview.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.roomreview.database.entity.WordEntity;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;

@Dao
public interface DatabaseRequet {
    @Query("SELECT * FROM Word")
    Observable<List<WordEntity>> getList();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Maybe<Long> insertWord(WordEntity wordEntity);

    @Delete
    Completable deleteWord(WordEntity wordEntity);

    @Update
    Completable updateWord(WordEntity wordEntity);


}
