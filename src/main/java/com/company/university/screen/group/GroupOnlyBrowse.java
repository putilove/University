package com.company.university.screen.group;

import io.jmix.ui.screen.*;
import com.company.university.entity.Group;

@UiController("Group_.Onlybrowse")
@UiDescriptor("group-Onlybrowse.xml")
@LookupComponent("groupsTable")
public class GroupOnlyBrowse extends StandardLookup<Group> {
}