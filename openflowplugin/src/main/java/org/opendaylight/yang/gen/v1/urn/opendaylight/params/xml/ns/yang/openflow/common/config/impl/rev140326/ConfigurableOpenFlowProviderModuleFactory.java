/**
* Generated file

* Generated from: yang module name: openflow-provider-impl  yang module local name: openflow-provider-impl
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Wed Apr 02 16:59:36 PDT 2014
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.openflow.common.config.impl.rev140326;

import org.opendaylight.controller.config.api.DependencyResolver;
import org.osgi.framework.BundleContext;

/**
 * the only purpose of this overwritings is to deliver bundleContext from osgi to module
 */
public class ConfigurableOpenFlowProviderModuleFactory extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.openflow.common.config.impl.rev140326.AbstractConfigurableOpenFlowProviderModuleFactory
{
    @Override
    public ConfigurableOpenFlowProviderModule instantiateModule(
            String instanceName, DependencyResolver dependencyResolver,
            BundleContext bundleContext) {
        ConfigurableOpenFlowProviderModule module = super.instantiateModule(instanceName, dependencyResolver, bundleContext);
        module.setBundleContext(bundleContext);
        return module;
    }
    
    @Override
    public ConfigurableOpenFlowProviderModule instantiateModule(
            String instanceName, DependencyResolver dependencyResolver,
            ConfigurableOpenFlowProviderModule oldModule,
            AutoCloseable oldInstance, BundleContext bundleContext) {
        ConfigurableOpenFlowProviderModule module = super.instantiateModule(instanceName, dependencyResolver, oldModule,
                        oldInstance, bundleContext);
        module.setBundleContext(bundleContext);
        return module;
    }
}
