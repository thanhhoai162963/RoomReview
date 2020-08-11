package com.example.roomreview.database.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Word")
public class WordEntity {
    @PrimaryKey(autoGenerate = true)
    long id;

    @ColumnInfo(name = "English")
    String en;

    @ColumnInfo(name = "VietNam")
    String vn;

    @ColumnInfo(name = "Ismemorized",defaultValue = "false")
    Boolean ismemorized;

    @Ignore
    public WordEntity(String en, String vn) {
        this.en = en;
        this.vn = vn;
    }
    public WordEntity(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }

    public Boolean getIsmemorized() {
        return ismemorized;
    }

    public void setIsmemorized(Boolean ismemorized) {
        this.ismemorized = ismemorized;
    }
}
