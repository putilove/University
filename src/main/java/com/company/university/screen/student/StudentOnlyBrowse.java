package com.company.university.screen.student;

import io.jmix.ui.screen.*;
import com.company.university.entity.Student;

@UiController("Student.OnlyBrowse")
@UiDescriptor("student-onlyBrowse.xml")
@LookupComponent("studentsTable")
public class StudentOnlyBrowse extends StandardLookup<Student> {
}