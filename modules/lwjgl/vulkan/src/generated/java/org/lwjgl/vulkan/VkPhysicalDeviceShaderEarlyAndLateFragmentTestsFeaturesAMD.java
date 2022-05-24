/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing whether early and late fragment tests can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link AMDShaderEarlyAndLateFragmentTests#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EARLY_AND_LATE_FRAGMENT_TESTS_FEATURES_AMD STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EARLY_AND_LATE_FRAGMENT_TESTS_FEATURES_AMD}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #shaderEarlyAndLateFragmentTests};
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADEREARLYANDLATEFRAGMENTTESTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADEREARLYANDLATEFRAGMENTTESTS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates whether the implementation supports the {@code EarlyAndLateFragmentTestsAMD} {@code Execution} {@code Mode}. */
    @NativeType("VkBool32")
    public boolean shaderEarlyAndLateFragmentTests() { return nshaderEarlyAndLateFragmentTests(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDShaderEarlyAndLateFragmentTests#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EARLY_AND_LATE_FRAGMENT_TESTS_FEATURES_AMD STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EARLY_AND_LATE_FRAGMENT_TESTS_FEATURES_AMD} value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD sType$Default() { return sType(AMDShaderEarlyAndLateFragmentTests.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EARLY_AND_LATE_FRAGMENT_TESTS_FEATURES_AMD); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #shaderEarlyAndLateFragmentTests} field. */
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD shaderEarlyAndLateFragmentTests(@NativeType("VkBool32") boolean value) { nshaderEarlyAndLateFragmentTests(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD set(
        int sType,
        long pNext,
        boolean shaderEarlyAndLateFragmentTests
    ) {
        sType(sType);
        pNext(pNext);
        shaderEarlyAndLateFragmentTests(shaderEarlyAndLateFragmentTests);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD set(VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD malloc() {
        return wrap(VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD calloc() {
        return wrap(VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD create(long address) {
        return wrap(VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.PNEXT); }
    /** Unsafe version of {@link #shaderEarlyAndLateFragmentTests}. */
    public static int nshaderEarlyAndLateFragmentTests(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.SHADEREARLYANDLATEFRAGMENTTESTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.PNEXT, value); }
    /** Unsafe version of {@link #shaderEarlyAndLateFragmentTests(boolean) shaderEarlyAndLateFragmentTests}. */
    public static void nshaderEarlyAndLateFragmentTests(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.SHADEREARLYANDLATEFRAGMENTTESTS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD ELEMENT_FACTORY = VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD#shaderEarlyAndLateFragmentTests} field. */
        @NativeType("VkBool32")
        public boolean shaderEarlyAndLateFragmentTests() { return VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.nshaderEarlyAndLateFragmentTests(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD#sType} field. */
        public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.nsType(address(), value); return this; }
        /** Sets the {@link AMDShaderEarlyAndLateFragmentTests#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EARLY_AND_LATE_FRAGMENT_TESTS_FEATURES_AMD STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EARLY_AND_LATE_FRAGMENT_TESTS_FEATURES_AMD} value to the {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD#sType} field. */
        public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer sType$Default() { return sType(AMDShaderEarlyAndLateFragmentTests.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EARLY_AND_LATE_FRAGMENT_TESTS_FEATURES_AMD); }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD#pNext} field. */
        public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD#shaderEarlyAndLateFragmentTests} field. */
        public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer shaderEarlyAndLateFragmentTests(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.nshaderEarlyAndLateFragmentTests(address(), value ? 1 : 0); return this; }

    }

}