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
 * The final step already.
 *
 * @author Stephane Nicoll
 */
public class FinalStep implements WizardStep {

    public String getCaption() {
        return "Finish";
    }

    public Component getContent() {
        final VerticalLayout content = new VerticalLayout();

        content.setMargin(true);

        final Label sorry = new Label("We sincerely hope that you were not expecting a demo of a " +
                "kick-ass Wizard :)");
        content.addComponent(sorry);

        return content;
    }

    public boolean onAdvance() {
        return true;
    }

    public boolean onBack() {
        return true;
    }
}
