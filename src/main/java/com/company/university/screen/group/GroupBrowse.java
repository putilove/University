package com.company.university.screen.group;

import io.jmix.ui.screen.*;
import com.company.university.entity.Group;

@UiController("Group_.browse")
@UiDescriptor("group-browse.xml")
@LookupComponent("groupsTable")
public class GroupBrowse extends StandardLookup<Group> {
}