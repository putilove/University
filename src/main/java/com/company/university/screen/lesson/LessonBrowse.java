package com.company.university.screen.lesson;

import io.jmix.ui.screen.*;
import com.company.university.entity.Lesson;

@UiController("Lesson.browse")
@UiDescriptor("lesson-browse.xml")
@LookupComponent("lessonsTable")
public class LessonBrowse extends StandardLookup<Lesson> {
}