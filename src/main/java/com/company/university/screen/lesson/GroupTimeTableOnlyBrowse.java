package com.company.university.screen.lesson;

import io.jmix.ui.screen.*;
import com.company.university.entity.Lesson;

@UiController("GroupTimeTable.OnlyBrowse")
@UiDescriptor("GroupTimetable-OnlyBrowse.xml")
@LookupComponent("lessonsTable")
public class GroupTimeTableOnlyBrowse extends StandardLookup<Lesson> {
}