package com.company.university.screen.auditorium;

import io.jmix.core.security.CurrentAuthentication;
import io.jmix.ui.component.DataGrid;
import io.jmix.ui.screen.*;
import com.company.university.entity.Auditorium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;

@UiController("Auditorium.browse")
@UiDescriptor("auditorium-browse.xml")
@LookupComponent("auditoriumsTable")
public class AuditoriumBrowse extends StandardLookup<Auditorium> {
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
            DataGrid auditoriumsTable = (DataGrid) getWindow().getComponent("auditoriumsTable");
            auditoriumsTable.setContextMenuEnabled(false);
        }
    }
}