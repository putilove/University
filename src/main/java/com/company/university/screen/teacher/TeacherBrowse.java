package com.company.university.screen.teacher;

import io.jmix.core.security.CurrentAuthentication;
import io.jmix.ui.component.DataGrid;
import io.jmix.ui.component.Table;
import io.jmix.ui.screen.*;
import com.company.university.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;

@UiController("Teacher.browse")
@UiDescriptor("teacher-browse.xml")
@LookupComponent("teachersTable")
public class TeacherBrowse extends StandardLookup<Teacher> {
    @Autowired
    private CurrentAuthentication currentAuthentication;

    @Override
    protected void initActions(InitEvent event) {
        super.initActions(event);
        GrantedAuthority authority = (GrantedAuthority)currentAuthentication.getUser().getAuthorities().toArray()[0];
        if(!authority.getAuthority().equals("system-full-access")) {
            getWindow().getComponent("buttonsPanel").setEnabled(false);
            getWindow().getComponent("buttonsPanel").setVisible(false);
            DataGrid teachersTable = (DataGrid) getWindow().getComponent("teachersTable");
            teachersTable.setContextMenuEnabled(false);

        }
    }
}