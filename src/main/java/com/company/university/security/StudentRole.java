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

@ResourceRole(name = "Student", code = "student")
public interface StudentRole {
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

    @MenuPolicy(menuIds = {"Student.browse", "Auditorium.browse", "Group_.browse", "Teacher.browse", "Lesson.Onbrowse"})
    @ScreenPolicy(screenIds = {"Student.browse", "Auditorium.browse", "Group_.browse", "Teacher.browse", "MainScreen", "LoginScreen", "entityInfoWindow", "Lesson.Onbrowse", "ui_AddConditionScreen", "ui_GroupFilterCondition.edit", "ui_PropertyFilterCondition.edit", "ui_JpqlFilterCondition.edit", "ui_FilterConfigurationModel.fragment", "inputDialog"})
    void screens();

    @EntityAttributePolicy(entityClass = Auditorium.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Auditorium.class, actions = EntityPolicyAction.READ)
    void auditorium();

    @SpecificPolicy(resources = {"datatools.ui.showEntityInfo", "ui.loginToUi", "ui.showExceptionDetails", "ui.filter.modifyConfiguration", "ui.filter.modifyJpqlCondition", "ui.presentations.global", "ui.filter.modifyGlobalConfiguration"})
    void specific();
}