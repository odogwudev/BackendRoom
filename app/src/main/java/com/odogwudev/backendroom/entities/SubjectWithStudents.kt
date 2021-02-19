package com.odogwudev.backendroom.entities

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.odogwudev.backendroom.entities.relations.StudentSubjectCrossRef

data class SubjectWithStudents(
    @Embedded val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val students: List<Student>
)