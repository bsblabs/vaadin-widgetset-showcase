/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bsb.samples.vaadin.wizard.core;

import com.vaadin.Application;
import com.vaadin.terminal.Sizeable;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import org.vaadin.teemu.wizards.Wizard;

/**
 * A simple application that adds our sample wizard.
 *
 * @author Stephane Nicoll
 */
public class WizardSampleApplication extends Application {

    @Override
    public void init() {
        final VerticalLayout mainLayout = new VerticalLayout();
        mainLayout.setSizeFull();
        mainLayout.setMargin(true);

        final Wizard wizard = new Wizard();
        wizard.addStep(new FirstStep(), "First");
        wizard.addStep(new FinalStep(), "Final");
        wizard.setWidth(800, Sizeable.UNITS_PIXELS);
        wizard.setHeight(600, Sizeable.UNITS_PIXELS);

        mainLayout.addComponent(wizard);
        mainLayout.setComponentAlignment(wizard, Alignment.MIDDLE_CENTER);

        final Window mainWindow = new Window("Wizard Sample");
        mainWindow.setContent(mainLayout);
        setMainWindow(mainWindow);

    }

}
