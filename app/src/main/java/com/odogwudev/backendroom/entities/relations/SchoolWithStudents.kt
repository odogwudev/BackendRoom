package com.odogwudev.backendroom.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.odogwudev.backendroom.entities.School
import com.odogwudev.backendroom.entities.Student

data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students: List<Student>
)