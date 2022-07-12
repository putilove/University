package com.company.university.screen.lesson;

import io.jmix.core.security.CurrentAuthentication;
import io.jmix.ui.component.DataGrid;
import io.jmix.ui.screen.*;
import com.company.university.entity.Lesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;

@UiController("Lesson.browse")
@UiDescriptor("lesson-browse.xml")
@LookupComponent("lessonsTable")
public class LessonBrowse extends StandardLookup<Lesson> {
    @Autowired
    private CurrentAuthentication currentAuthentication;

    @Override
    protected void initActions(InitEvent event) {
        super.initActions(event);
        GrantedAuthority authority = (GrantedAuthority)currentAuthentication.getUser().getAuthorities().toArray()[0];
        if(!authority.getAuthority().equals("system-full-access") &&
                !authority.getAuthority().equals("timetable-compiler-role")) {
            getWindow().getComponent("buttonsPanel").setEnabled(false);
            getWindow().getComponent("buttonsPanel").setVisible(false);
            DataGrid lessonsTable = (DataGrid) getWindow().getComponent("lessonsTable");
            lessonsTable.setContextMenuEnabled(false);
        }
    }
}