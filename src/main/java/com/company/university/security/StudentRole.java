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

@ResourceRole(name = "StudentRole", code = "student-role")
public interface StudentRole {
    @MenuPolicy(menuIds = "Lesson.browse")
    @ScreenPolicy(screenIds = {"LoginScreen", "MainScreen", "ui_GroupFilterCondition.edit", "ui_AddConditionScreen", "ui_JpqlFilterCondition.edit", "ui_PropertyFilterCondition.edit", "inputDialog", "entityInfoWindow", "backgroundWorkProgressScreen", "ui_LayoutAnalyzerScreen", "bulkEditorWindow", "ui_FilterConfigurationModel.fragment", "selectValueDialog", "ui_UiDataFilterConfigurationModel.fragment", "Lesson.browse"})
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

    @SpecificPolicy(resources = {"datatools.ui.showEntityInfo", "ui.loginToUi", "ui.filter.modifyConfiguration", "ui.filter.modifyJpqlCondition", "ui.presentations.global", "ui.filter.modifyGlobalConfiguration", "ui.bulkEdit.enabled"})
    void specific();
}