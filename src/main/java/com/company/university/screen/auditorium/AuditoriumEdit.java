package com.company.university.screen.auditorium;

import io.jmix.ui.screen.*;
import com.company.university.entity.Auditorium;

@UiController("Auditorium.edit")
@UiDescriptor("auditorium-edit.xml")
@EditedEntityContainer("auditoriumDc")
public class AuditoriumEdit extends StandardEditor<Auditorium> {
}