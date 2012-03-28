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

import com.vaadin.ui.Component;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import org.vaadin.teemu.wizards.WizardStep;

/**
 * A dummy first step to basically explain what this sample is all about.
 *
 * @author Stephane Nicoll
 */
public class FirstStep implements WizardStep {

    public String getCaption() {
        return "Welcome";
    }

    public Component getContent() {
        final VerticalLayout content = new VerticalLayout();
        content.setSpacing(true);
        content.setMargin(true);

        final Label intro = new Label("A trivial use of the Wizards for Vaadin add-on");
        content.addComponent(intro);

        final Label description = new Label(
                "This demonstrates an application where a custom widgetset has been compiled in a separate JAR " +
                        "project that is not bound to the standard build lifecycle of the project. By making this " +
                        "project optional, the lengthy compilation of the widgetset is only performed on demand. " +
                        "Besides, a full clean of your project in your IDE does not require you to rebuild the " +
                        "widgetset.");
        content.addComponent(description);


        return content;
    }


    public boolean onAdvance() {
        return true;
    }

    public boolean onBack() {
        return true;
    }
}