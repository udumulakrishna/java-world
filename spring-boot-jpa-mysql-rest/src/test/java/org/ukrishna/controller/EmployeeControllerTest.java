package org.ukrishna.controller;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.ukrishna.repository.EmployeeRepository;

@ContextConfiguration(classes = {EmployeeController.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeControllerTest {
    @Autowired
    private EmployeeController employeeController;

    @MockBean
    private EmployeeRepository employeeRepository;

    /**
     * Method under test: {@link EmployeeController#getAll()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetAll() throws Exception {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:127)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:502)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:488)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:543)
        //   org.mockito.exceptions.base.MockitoException:
        //   Mockito cannot mock this class: interface org.ukrishna.repository.EmployeeRepository.
        //   If you're not sure why you're getting this error, please report to the mailing list.
        //   Java               : 11
        //   JVM vendor name    : Oracle Corporation
        //   JVM vendor version : 11.0.17+10-LTS-269
        //   JVM name           : Java HotSpot(TM) 64-Bit Server VM
        //   JVM version        : 11.0.17+10-LTS-269
        //   JVM info           : mixed mode
        //   OS name            : Windows 11
        //   OS version         : 10.0
        //   You are seeing this disclaimer because Mockito is configured to create inlined mocks.
        //   You can learn about inline mocks and their limitations under item #39 of the Mockito class javadoc.
        //   Underlying exception : java.lang.UnsupportedOperationException: Cannot define class using reflection
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:127)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:502)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:488)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:543)
        //   java.lang.UnsupportedOperationException: Cannot define class using reflection
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Unavailable.defineClass(ClassInjector.java:821)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection.inject(ClassInjector.java:185)
        //       at net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$InjectionDispatcher.load(ClassLoadingStrategy.java:187)
        //       at net.bytebuddy.dynamic.TypeResolutionStrategy$Passive.initialize(TypeResolutionStrategy.java:79)
        //       at net.bytebuddy.dynamic.DynamicType$Default$Unloaded.load(DynamicType.java:4457)
        //       at org.mockito.internal.creation.bytebuddy.SubclassBytecodeGenerator.mockClass(SubclassBytecodeGenerator.java:121)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:37)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:34)
        //       at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:138)
        //       at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:346)
        //       at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:161)
        //       at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:355)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator.mockClass(TypeCachingBytecodeGenerator.java:32)
        //       at org.mockito.internal.creation.bytebuddy.InlineBytecodeGenerator.mockClass(InlineBytecodeGenerator.java:101)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:37)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:34)
        //       at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:138)
        //       at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:346)
        //       at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:161)
        //       at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:355)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator.mockClass(TypeCachingBytecodeGenerator.java:32)
        //       at org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker.createMockType(InlineByteBuddyMockMaker.java:200)
        //       at org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker.createMock(InlineByteBuddyMockMaker.java:181)
        //       at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:35)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:65)
        //       at org.mockito.Mockito.mock(Mockito.java:1855)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:127)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:502)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:488)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:543)
        //   java.lang.IllegalStateException: Could not find sun.misc.Unsafe
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Disabled.initialize(ClassInjector.java:1366)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe.inject(ClassInjector.java:1202)
        //       at net.bytebuddy.dynamic.loading.ClassLoadingStrategy$ForUnsafeInjection.load(ClassLoadingStrategy.java:458)
        //       at net.bytebuddy.dynamic.TypeResolutionStrategy$Passive.initialize(TypeResolutionStrategy.java:79)
        //       at net.bytebuddy.dynamic.DynamicType$Default$Unloaded.load(DynamicType.java:4457)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Indirect.make(ClassInjector.java:684)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$CreationAction.run(ClassInjector.java:302)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$CreationAction.run(ClassInjector.java:290)
        //       at java.security.AccessController.doPrivileged(Native Method)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection.<clinit>(ClassInjector.java:70)
        //       at net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$InjectionDispatcher.load(ClassLoadingStrategy.java:184)
        //       at net.bytebuddy.dynamic.TypeResolutionStrategy$Passive.initialize(TypeResolutionStrategy.java:79)
        //       at net.bytebuddy.dynamic.DynamicType$Default$Unloaded.load(DynamicType.java:4457)
        //       at org.mockito.internal.creation.bytebuddy.SubclassBytecodeGenerator.mockClass(SubclassBytecodeGenerator.java:121)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:37)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:34)
        //       at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:138)
        //       at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:346)
        //       at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:161)
        //       at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:355)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator.mockClass(TypeCachingBytecodeGenerator.java:32)
        //       at org.mockito.internal.creation.bytebuddy.InlineBytecodeGenerator.mockClass(InlineBytecodeGenerator.java:101)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:37)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:34)
        //       at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:138)
        //       at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:346)
        //       at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:161)
        //       at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:355)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator.mockClass(TypeCachingBytecodeGenerator.java:32)
        //       at org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker.createMockType(InlineByteBuddyMockMaker.java:200)
        //       at org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker.createMock(InlineByteBuddyMockMaker.java:181)
        //       at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:35)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:65)
        //       at org.mockito.Mockito.mock(Mockito.java:1855)
        //   java.lang.NoSuchMethodException: sun.misc.Unsafe.defineClass(java.lang.String, [B, int, int, java.lang.ClassLoader, java.security.ProtectionDomain)
        //       at java.lang.Class.getMethod(Class.java:2108)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$CreationAction.run(ClassInjector.java:1269)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$CreationAction.run(ClassInjector.java:1257)
        //       at java.security.AccessController.doPrivileged(Native Method)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe.<clinit>(ClassInjector.java:1136)
        //       at net.bytebuddy.dynamic.loading.ClassLoadingStrategy$ForUnsafeInjection.load(ClassLoadingStrategy.java:458)
        //       at net.bytebuddy.dynamic.TypeResolutionStrategy$Passive.initialize(TypeResolutionStrategy.java:79)
        //       at net.bytebuddy.dynamic.DynamicType$Default$Unloaded.load(DynamicType.java:4457)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Indirect.make(ClassInjector.java:684)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$CreationAction.run(ClassInjector.java:302)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$CreationAction.run(ClassInjector.java:290)
        //       at java.security.AccessController.doPrivileged(Native Method)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection.<clinit>(ClassInjector.java:70)
        //       at net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$InjectionDispatcher.load(ClassLoadingStrategy.java:184)
        //       at net.bytebuddy.dynamic.TypeResolutionStrategy$Passive.initialize(TypeResolutionStrategy.java:79)
        //       at net.bytebuddy.dynamic.DynamicType$Default$Unloaded.load(DynamicType.java:4457)
        //       at org.mockito.internal.creation.bytebuddy.SubclassBytecodeGenerator.mockClass(SubclassBytecodeGenerator.java:121)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:37)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:34)
        //       at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:138)
        //       at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:346)
        //       at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:161)
        //       at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:355)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator.mockClass(TypeCachingBytecodeGenerator.java:32)
        //       at org.mockito.internal.creation.bytebuddy.InlineBytecodeGenerator.mockClass(InlineBytecodeGenerator.java:101)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:37)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:34)
        //       at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:138)
        //       at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:346)
        //       at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:161)
        //       at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:355)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator.mockClass(TypeCachingBytecodeGenerator.java:32)
        //       at org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker.createMockType(InlineByteBuddyMockMaker.java:200)
        //       at org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker.createMock(InlineByteBuddyMockMaker.java:181)
        //       at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:35)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:65)
        //       at org.mockito.Mockito.mock(Mockito.java:1855)
        //   See https://diff.blue/R026 to resolve this issue.

        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/employee/all");
        MockMvcBuilders.standaloneSetup(employeeController).build().perform(requestBuilder);
    }

    /**
     * Method under test: {@link EmployeeController#getOne(Integer)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetOne() throws Exception {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:127)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:502)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:488)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:543)
        //   org.mockito.exceptions.base.MockitoException:
        //   Mockito cannot mock this class: interface org.ukrishna.repository.EmployeeRepository.
        //   If you're not sure why you're getting this error, please report to the mailing list.
        //   Java               : 11
        //   JVM vendor name    : Oracle Corporation
        //   JVM vendor version : 11.0.17+10-LTS-269
        //   JVM name           : Java HotSpot(TM) 64-Bit Server VM
        //   JVM version        : 11.0.17+10-LTS-269
        //   JVM info           : mixed mode
        //   OS name            : Windows 11
        //   OS version         : 10.0
        //   You are seeing this disclaimer because Mockito is configured to create inlined mocks.
        //   You can learn about inline mocks and their limitations under item #39 of the Mockito class javadoc.
        //   Underlying exception : java.lang.UnsupportedOperationException: Cannot define class using reflection
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:127)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:502)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:488)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:543)
        //   java.lang.UnsupportedOperationException: Cannot define class using reflection
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Unavailable.defineClass(ClassInjector.java:821)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection.inject(ClassInjector.java:185)
        //       at net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$InjectionDispatcher.load(ClassLoadingStrategy.java:187)
        //       at net.bytebuddy.dynamic.TypeResolutionStrategy$Passive.initialize(TypeResolutionStrategy.java:79)
        //       at net.bytebuddy.dynamic.DynamicType$Default$Unloaded.load(DynamicType.java:4457)
        //       at org.mockito.internal.creation.bytebuddy.SubclassBytecodeGenerator.mockClass(SubclassBytecodeGenerator.java:121)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:37)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:34)
        //       at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:138)
        //       at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:346)
        //       at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:161)
        //       at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:355)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator.mockClass(TypeCachingBytecodeGenerator.java:32)
        //       at org.mockito.internal.creation.bytebuddy.InlineBytecodeGenerator.mockClass(InlineBytecodeGenerator.java:101)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:37)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:34)
        //       at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:138)
        //       at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:346)
        //       at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:161)
        //       at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:355)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator.mockClass(TypeCachingBytecodeGenerator.java:32)
        //       at org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker.createMockType(InlineByteBuddyMockMaker.java:200)
        //       at org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker.createMock(InlineByteBuddyMockMaker.java:181)
        //       at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:35)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:65)
        //       at org.mockito.Mockito.mock(Mockito.java:1855)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:127)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:502)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:488)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:543)
        //   java.lang.IllegalStateException: Could not find sun.misc.Unsafe
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Disabled.initialize(ClassInjector.java:1366)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe.inject(ClassInjector.java:1202)
        //       at net.bytebuddy.dynamic.loading.ClassLoadingStrategy$ForUnsafeInjection.load(ClassLoadingStrategy.java:458)
        //       at net.bytebuddy.dynamic.TypeResolutionStrategy$Passive.initialize(TypeResolutionStrategy.java:79)
        //       at net.bytebuddy.dynamic.DynamicType$Default$Unloaded.load(DynamicType.java:4457)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Indirect.make(ClassInjector.java:684)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$CreationAction.run(ClassInjector.java:302)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$CreationAction.run(ClassInjector.java:290)
        //       at java.security.AccessController.doPrivileged(Native Method)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection.<clinit>(ClassInjector.java:70)
        //       at net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$InjectionDispatcher.load(ClassLoadingStrategy.java:184)
        //       at net.bytebuddy.dynamic.TypeResolutionStrategy$Passive.initialize(TypeResolutionStrategy.java:79)
        //       at net.bytebuddy.dynamic.DynamicType$Default$Unloaded.load(DynamicType.java:4457)
        //       at org.mockito.internal.creation.bytebuddy.SubclassBytecodeGenerator.mockClass(SubclassBytecodeGenerator.java:121)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:37)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:34)
        //       at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:138)
        //       at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:346)
        //       at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:161)
        //       at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:355)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator.mockClass(TypeCachingBytecodeGenerator.java:32)
        //       at org.mockito.internal.creation.bytebuddy.InlineBytecodeGenerator.mockClass(InlineBytecodeGenerator.java:101)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:37)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:34)
        //       at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:138)
        //       at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:346)
        //       at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:161)
        //       at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:355)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator.mockClass(TypeCachingBytecodeGenerator.java:32)
        //       at org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker.createMockType(InlineByteBuddyMockMaker.java:200)
        //       at org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker.createMock(InlineByteBuddyMockMaker.java:181)
        //       at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:35)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:65)
        //       at org.mockito.Mockito.mock(Mockito.java:1855)
        //   java.lang.NoSuchMethodException: sun.misc.Unsafe.defineClass(java.lang.String, [B, int, int, java.lang.ClassLoader, java.security.ProtectionDomain)
        //       at java.lang.Class.getMethod(Class.java:2108)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$CreationAction.run(ClassInjector.java:1269)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$CreationAction.run(ClassInjector.java:1257)
        //       at java.security.AccessController.doPrivileged(Native Method)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe.<clinit>(ClassInjector.java:1136)
        //       at net.bytebuddy.dynamic.loading.ClassLoadingStrategy$ForUnsafeInjection.load(ClassLoadingStrategy.java:458)
        //       at net.bytebuddy.dynamic.TypeResolutionStrategy$Passive.initialize(TypeResolutionStrategy.java:79)
        //       at net.bytebuddy.dynamic.DynamicType$Default$Unloaded.load(DynamicType.java:4457)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Indirect.make(ClassInjector.java:684)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$CreationAction.run(ClassInjector.java:302)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$CreationAction.run(ClassInjector.java:290)
        //       at java.security.AccessController.doPrivileged(Native Method)
        //       at net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection.<clinit>(ClassInjector.java:70)
        //       at net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$InjectionDispatcher.load(ClassLoadingStrategy.java:184)
        //       at net.bytebuddy.dynamic.TypeResolutionStrategy$Passive.initialize(TypeResolutionStrategy.java:79)
        //       at net.bytebuddy.dynamic.DynamicType$Default$Unloaded.load(DynamicType.java:4457)
        //       at org.mockito.internal.creation.bytebuddy.SubclassBytecodeGenerator.mockClass(SubclassBytecodeGenerator.java:121)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:37)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:34)
        //       at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:138)
        //       at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:346)
        //       at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:161)
        //       at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:355)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator.mockClass(TypeCachingBytecodeGenerator.java:32)
        //       at org.mockito.internal.creation.bytebuddy.InlineBytecodeGenerator.mockClass(InlineBytecodeGenerator.java:101)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:37)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:34)
        //       at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:138)
        //       at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:346)
        //       at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:161)
        //       at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:355)
        //       at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator.mockClass(TypeCachingBytecodeGenerator.java:32)
        //       at org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker.createMockType(InlineByteBuddyMockMaker.java:200)
        //       at org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker.createMock(InlineByteBuddyMockMaker.java:181)
        //       at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:35)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:65)
        //       at org.mockito.Mockito.mock(Mockito.java:1855)
        //   See https://diff.blue/R026 to resolve this issue.

        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/employee/{id}", 1);
        MockMvcBuilders.standaloneSetup(employeeController).build().perform(requestBuilder);
    }
}

