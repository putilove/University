package com.company.university.screen.auditorium;

import io.jmix.ui.screen.*;
import com.company.university.entity.Auditorium;

@UiController("Auditorium.browse")
@UiDescriptor("auditorium-browse.xml")
@LookupComponent("auditoriumsTable")
public class AuditoriumBrowse extends StandardLookup<Auditorium> {
}