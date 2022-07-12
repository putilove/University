package com.company.university.security;

import com.company.university.entity.*;
import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.security.role.annotation.SpecificPolicy;
import io.jmix.securityui.role.annotation.MenuPolicy;
import io.jmix.securityui.role.annotation.ScreenPolicy;

@ResourceRole(name = "TimetableCompilerRole", code = "timetable-compiler-role")
public interface TimetableCompilerRole {
    @MenuPolicy(menuIds = {"Auditorium.browse", "Lesson.browse"})
    @ScreenPolicy(screenIds = {"LoginScreen", "MainScreen", "entityInfoWindow", "backgroundWorkProgressScreen", "bulkEditorWindow", "ui_LayoutAnalyzerScreen", "ui_AddConditionScreen", "ui_GroupFilterCondition.edit", "ui_PropertyFilterCondition.edit", "ui_JpqlFilterCondition.edit", "ui_FilterConfigurationModel.fragment", "selectValueDialog", "ui_UiDataFilterConfigurationModel.fragment", "Auditorium.edit", "Lesson.edit", "Auditorium.browse", "Lesson.browse", "Group_.browse", "Teacher.browse"})
    void screens();

    @EntityAttributePolicy(entityClass = Auditorium.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Auditorium.class, actions = EntityPolicyAction.ALL)
    void auditorium();

    @EntityAttributePolicy(entityClass = Lesson.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Lesson.class, actions = EntityPolicyAction.ALL)
    void lesson();

    @EntityPolicy(entityClass = Group.class, actions = EntityPolicyAction.READ)
    @EntityAttributePolicy(entityClass = Group.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    void group();

    @EntityPolicy(entityClass = Student.class, actions = EntityPolicyAction.READ)
    @EntityAttributePolicy(entityClass = Student.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    void student();

    @EntityPolicy(entityClass = Teacher.class, actions = EntityPolicyAction.READ)
    @EntityAttributePolicy(entityClass = Teacher.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    void teacher();

    @SpecificPolicy(resources = {"datatools.ui.showEntityInfo", "ui.loginToUi", "ui.filter.modifyConfiguration", "ui.bulkEdit.enabled", "ui.presentations.global", "ui.filter.modifyGlobalConfiguration"})
    void specific();
}