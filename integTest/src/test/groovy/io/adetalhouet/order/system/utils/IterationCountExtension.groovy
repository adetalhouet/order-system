package io.adetalhouet.order.system.utils

import org.spockframework.runtime.AbstractRunListener
import org.spockframework.runtime.extension.AbstractGlobalExtension
import org.spockframework.runtime.model.FeatureInfo
import org.spockframework.runtime.model.IterationInfo
import org.spockframework.runtime.model.SpecInfo

// credit: https://stackoverflow.com/a/41850844
class IterationCountExtension extends AbstractGlobalExtension {
    @Override
    void visitSpec(SpecInfo spec) {
        spec.addListener(new IterationCountListener())
    }

    static class IterationCountListener extends AbstractRunListener {
        MetaClass metaClass
        int iterationCount

        @Override
        void beforeSpec(SpecInfo spec) {
            println spec.name
            metaClass = spec.reflection.metaClass
        }

        @Override
        void beforeFeature(FeatureInfo feature) {
            println "  " + feature.name
            iterationCount = 0
            metaClass.iterationCount = iterationCount
        }

        @Override
        void beforeIteration(IterationInfo iteration) {
            println "    " + iteration.name
            metaClass.iterationCount = iterationCount++
        }
    }
}