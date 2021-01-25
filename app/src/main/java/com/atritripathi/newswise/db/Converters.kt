package com.atritripathi.newswise.db

import androidx.room.TypeConverter
import com.atritripathi.newswise.models.Source

/**
 * Converts Source objects into String and vice-versa, so that
 * the Source object in Article entity can be stored in the DB.
 */
class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}