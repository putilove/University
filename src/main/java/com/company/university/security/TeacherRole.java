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

@ResourceRole(name = "TeacherRole", code = "teacher-role")
public interface TeacherRole {
    @MenuPolicy(menuIds = {"Group_.browse", "Lesson.browse", "Student.browse"})
    @ScreenPolicy(screenIds = {"LoginScreen", "MainScreen", "entityInfoWindow", "backgroundWorkProgressScreen", "bulkEditorWindow", "ui_LayoutAnalyzerScreen", "ui_AddConditionScreen", "ui_GroupFilterCondition.edit", "ui_JpqlFilterCondition.edit", "ui_PropertyFilterCondition.edit", "ui_FilterConfigurationModel.fragment", "inputDialog", "selectValueDialog", "ui_UiDataFilterConfigurationModel.fragment", "Group_.browse", "Lesson.browse", "Student.browse"})
    void screens();

    @EntityAttributePolicy(entityClass = Auditorium.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Auditorium.class, actions = EntityPolicyAction.READ)
    void auditorium();

    @EntityAttributePolicy(entityClass = Group.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Group.class, actions = EntityPolicyAction.READ)
    void group();

    @EntityAttributePolicy(entityClass = Lesson.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Lesson.class, actions = EntityPolicyAction.READ)
    void lesson();

    @EntityAttributePolicy(entityClass = Student.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Student.class, actions = EntityPolicyAction.READ)
    void student();

    @EntityAttributePolicy(entityClass = Teacher.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Teacher.class, actions = EntityPolicyAction.READ)
    void teacher();

    @SpecificPolicy(resources = {"ui.presentations.global", "ui.filter.modifyJpqlCondition", "ui.filter.modifyConfiguration", "ui.bulkEdit.enabled", "ui.loginToUi", "datatools.ui.showEntityInfo", "ui.filter.modifyGlobalConfiguration"})
    void specific();
}