package com.company.university.screen.testtimetable;

import com.company.university.entity.Lesson;
import io.jmix.ui.component.GroupTable;
import io.jmix.ui.screen.LookupComponent;
import io.jmix.ui.screen.Screen;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("TestTimetable")
@UiDescriptor("test-Timetable.xml")
@LookupComponent("lessonsTable")
public class TestTimetable extends Screen {
    @Autowired
    private GroupTable<Lesson> lessonsTable;
}