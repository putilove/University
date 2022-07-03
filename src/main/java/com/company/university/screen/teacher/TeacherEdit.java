package com.company.university.screen.teacher;

import io.jmix.ui.screen.*;
import com.company.university.entity.Teacher;

@UiController("Teacher.edit")
@UiDescriptor("teacher-edit.xml")
@EditedEntityContainer("teacherDc")
public class TeacherEdit extends StandardEditor<Teacher> {
}