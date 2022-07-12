package com.company.university.screen.group;

import io.jmix.core.security.CurrentAuthentication;
import io.jmix.ui.component.DataGrid;
import io.jmix.ui.screen.*;
import com.company.university.entity.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;

@UiController("Group_.browse")
@UiDescriptor("group-browse.xml")
@LookupComponent("groupsTable")
public class GroupBrowse extends StandardLookup<Group> {
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
            DataGrid groupsTable = (DataGrid) getWindow().getComponent("groupsTable");
            groupsTable.setContextMenuEnabled(false);
        }
    }
}