package com.company.university.screen.lesson;

import io.jmix.ui.screen.*;
import com.company.university.entity.Lesson;

@UiController("Lesson.Onbrowse")
@UiDescriptor("lesson-Onbrowse.xml")
@LookupComponent("lessonsTable")
public class LessonOnBrowse extends StandardLookup<Lesson> {
}