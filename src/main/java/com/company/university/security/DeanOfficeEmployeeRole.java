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

@ResourceRole(name = "DeanOfficeEmployee", code = "dean-office-employee")
public interface DeanOfficeEmployeeRole {
    @MenuPolicy(menuIds = {"Group_.browse", "Student.browse"})
    @ScreenPolicy(screenIds = {"Group_.browse", "Group_.edit", "Student.browse", "LoginScreen", "MainScreen", "Student.edit", "entityInfoWindow", "backgroundWorkProgressScreen", "bulkEditorWindow", "ui_LayoutAnalyzerScreen", "ui_AddConditionScreen", "ui_GroupFilterCondition.edit", "ui_JpqlFilterCondition.edit", "ui_PropertyFilterCondition.edit", "ui_FilterConfigurationModel.fragment", "inputDialog", "selectValueDialog", "ui_UiDataFilterConfigurationModel.fragment"})
    void screens();

    @EntityAttributePolicy(entityClass = Group.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Group.class, actions = EntityPolicyAction.ALL)
    void group();

    @EntityAttributePolicy(entityClass = Student.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Student.class, actions = EntityPolicyAction.ALL)
    void student();

    @EntityAttributePolicy(entityClass = Lesson.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Lesson.class, actions = EntityPolicyAction.READ)
    void lesson();

    @EntityAttributePolicy(entityClass = Auditorium.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Auditorium.class, actions = EntityPolicyAction.READ)
    void auditorium();

    @EntityAttributePolicy(entityClass = Teacher.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Teacher.class, actions = EntityPolicyAction.READ)
    void teacher();

    @SpecificPolicy(resources = {"datatools.ui.showEntityInfo", "ui.loginToUi", "ui.bulkEdit.enabled", "ui.filter.modifyConfiguration", "ui.filter.modifyJpqlCondition", "ui.presentations.global", "ui.filter.modifyGlobalConfiguration"})
    void specific();
}