package com.company.university.screen.group;

import io.jmix.ui.screen.*;
import com.company.university.entity.Group;

@UiController("Group_.edit")
@UiDescriptor("group-edit.xml")
@EditedEntityContainer("groupDc")
public class GroupEdit extends StandardEditor<Group> {
}