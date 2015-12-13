/**
 * Copyright (c) 2014-2015 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
/*
 * generated by Xtext
 */
package org.eclipse.smarthome.model;

import org.eclipse.smarthome.model.valueconverter.SitemapConverters;
import org.eclipse.xtext.conversion.IValueConverterService;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class SitemapRuntimeModule extends org.eclipse.smarthome.model.AbstractSitemapRuntimeModule {

    @Override
    public Class<? extends IValueConverterService> bindIValueConverterService() {
        return SitemapConverters.class;
    }

}
