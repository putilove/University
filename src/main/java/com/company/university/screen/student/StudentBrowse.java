package com.company.university.screen.student;

import io.jmix.core.security.CurrentAuthentication;
import io.jmix.ui.component.DataGrid;
import io.jmix.ui.screen.*;
import com.company.university.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;

@UiController("Student.browse")
@UiDescriptor("student-browse.xml")
@LookupComponent("studentsTable")
public class StudentBrowse extends StandardLookup<Student> {
    @Autowired
    private CurrentAuthentication currentAuthentication;

    @Override
    protected void initActions(InitEvent event) {
        super.initActions(event);
        GrantedAuthority authority = (GrantedAuthority)currentAuthentication.getUser().getAuthorities().toArray()[0];
        if(!authority.getAuthority().equals("system-full-access") &&
                !authority.getAuthority().equals("dean-office-employee")) {
            getWindow().getComponent("buttonsPanel").setEnabled(false);
            getWindow().getComponent("buttonsPanel").setVisible(false);
            DataGrid studentsTable = (DataGrid) getWindow().getComponent("studentsTable");
            studentsTable.setContextMenuEnabled(false);
        }
    }
}