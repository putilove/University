package com.company.university.screen.teacher;

import io.jmix.core.security.CurrentAuthentication;
import io.jmix.ui.component.DataGrid;
import io.jmix.ui.component.GroupBoxLayout;
import io.jmix.ui.component.Table;
import io.jmix.ui.screen.*;
import com.company.university.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;

@UiController("Teacher.edit")
@UiDescriptor("teacher-edit.xml")
@EditedEntityContainer("teacherDc")
public class TeacherEdit extends StandardEditor<Teacher> {
    @Autowired
    private CurrentAuthentication currentAuthentication;

    @Override
    protected void initActions(InitEvent event) {
        super.initActions(event);
        GrantedAuthority authority = (GrantedAuthority)currentAuthentication.getUser().getAuthorities().toArray()[0];
        if(!authority.getAuthority().equals("system-full-access")) {
            getWindow().getComponent("buttonsPanel").setEnabled(false);
            getWindow().getComponent("buttonsPanel").setVisible(false);
            Table timetableTable = (Table) getWindow().getComponent("timetableTable");
            timetableTable.setContextMenuEnabled(false);

        }
    }
}