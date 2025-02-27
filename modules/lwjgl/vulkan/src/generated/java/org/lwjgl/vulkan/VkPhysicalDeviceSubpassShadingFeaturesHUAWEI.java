/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceSubpassShadingFeaturesHUAWEI {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 subpassShading;
 * }}</pre>
 */
public class VkPhysicalDeviceSubpassShadingFeaturesHUAWEI extends Struct<VkPhysicalDeviceSubpassShadingFeaturesHUAWEI> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUBPASSSHADING;

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
        SUBPASSSHADING = layout.offsetof(2);
    }

    protected VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceSubpassShadingFeaturesHUAWEI create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceSubpassShadingFeaturesHUAWEI} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code subpassShading} field. */
    @NativeType("VkBool32")
    public boolean subpassShading() { return nsubpassShading(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link HUAWEISubpassShading#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI} value to the {@code sType} field. */
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI sType$Default() { return sType(HUAWEISubpassShading.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code subpassShading} field. */
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI subpassShading(@NativeType("VkBool32") boolean value) { nsubpassShading(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI set(
        int sType,
        long pNext,
        boolean subpassShading
    ) {
        sType(sType);
        pNext(pNext);
        subpassShading(subpassShading);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI set(VkPhysicalDeviceSubpassShadingFeaturesHUAWEI src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSubpassShadingFeaturesHUAWEI} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI malloc() {
        return new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceSubpassShadingFeaturesHUAWEI} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI calloc() {
        return new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceSubpassShadingFeaturesHUAWEI} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSubpassShadingFeaturesHUAWEI} instance for the specified memory address. */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI create(long address) {
        return new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceSubpassShadingFeaturesHUAWEI createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSubpassShadingFeaturesHUAWEI} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSubpassShadingFeaturesHUAWEI} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.PNEXT); }
    /** Unsafe version of {@link #subpassShading}. */
    public static int nsubpassShading(long struct) { return memGetInt(struct + VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.SUBPASSSHADING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.PNEXT, value); }
    /** Unsafe version of {@link #subpassShading(boolean) subpassShading}. */
    public static void nsubpassShading(long struct, int value) { memPutInt(struct + VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.SUBPASSSHADING, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSubpassShadingFeaturesHUAWEI, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceSubpassShadingFeaturesHUAWEI ELEMENT_FACTORY = VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkPhysicalDeviceSubpassShadingFeaturesHUAWEI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.npNext(address()); }
        /** @return the value of the {@code subpassShading} field. */
        @NativeType("VkBool32")
        public boolean subpassShading() { return VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.nsubpassShading(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.nsType(address(), value); return this; }
        /** Sets the {@link HUAWEISubpassShading#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI} value to the {@code sType} field. */
        public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer sType$Default() { return sType(HUAWEISubpassShading.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code subpassShading} field. */
        public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer subpassShading(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.nsubpassShading(address(), value ? 1 : 0); return this; }

    }

}