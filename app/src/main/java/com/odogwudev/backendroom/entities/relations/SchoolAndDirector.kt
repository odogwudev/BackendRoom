package com.odogwudev.backendroom.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.odogwudev.backendroom.entities.Director
import com.odogwudev.backendroom.entities.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)