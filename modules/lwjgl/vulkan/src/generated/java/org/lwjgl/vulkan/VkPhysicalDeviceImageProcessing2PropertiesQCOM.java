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
 * Structure containing image processing2 properties.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceImageProcessing2PropertiesQCOM} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <p>These are properties of the image processing2 information of a physical device.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link QCOMImageProcessing2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_PROPERTIES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_PROPERTIES_QCOM}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceImageProcessing2PropertiesQCOM {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     {@link VkExtent2D VkExtent2D} {@link #maxBlockMatchWindow};
 * }</code></pre>
 */
public class VkPhysicalDeviceImageProcessing2PropertiesQCOM extends Struct<VkPhysicalDeviceImageProcessing2PropertiesQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXBLOCKMATCHWINDOW;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXBLOCKMATCHWINDOW = layout.offsetof(2);
    }

    protected VkPhysicalDeviceImageProcessing2PropertiesQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceImageProcessing2PropertiesQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceImageProcessing2PropertiesQCOM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceImageProcessing2PropertiesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a {@link VkExtent2D} describing the largest dimensions ({@code width} and {@code height}) that <b>can</b> be specified for the block match window. */
    public VkExtent2D maxBlockMatchWindow() { return nmaxBlockMatchWindow(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMImageProcessing2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_PROPERTIES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_PROPERTIES_QCOM} value to the {@link #sType} field. */
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM sType$Default() { return sType(QCOMImageProcessing2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_PROPERTIES_QCOM); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM set(VkPhysicalDeviceImageProcessing2PropertiesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceImageProcessing2PropertiesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM malloc() {
        return new VkPhysicalDeviceImageProcessing2PropertiesQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageProcessing2PropertiesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM calloc() {
        return new VkPhysicalDeviceImageProcessing2PropertiesQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageProcessing2PropertiesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageProcessing2PropertiesQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceImageProcessing2PropertiesQCOM} instance for the specified memory address. */
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM create(long address) {
        return new VkPhysicalDeviceImageProcessing2PropertiesQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceImageProcessing2PropertiesQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessing2PropertiesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessing2PropertiesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessing2PropertiesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceImageProcessing2PropertiesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageProcessing2PropertiesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageProcessing2PropertiesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageProcessing2PropertiesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageProcessing2PropertiesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessing2PropertiesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessing2PropertiesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceImageProcessing2PropertiesQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceImageProcessing2PropertiesQCOM.PNEXT); }
    /** Unsafe version of {@link #maxBlockMatchWindow}. */
    public static VkExtent2D nmaxBlockMatchWindow(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceImageProcessing2PropertiesQCOM.MAXBLOCKMATCHWINDOW); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageProcessing2PropertiesQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceImageProcessing2PropertiesQCOM.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceImageProcessing2PropertiesQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageProcessing2PropertiesQCOM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceImageProcessing2PropertiesQCOM ELEMENT_FACTORY = VkPhysicalDeviceImageProcessing2PropertiesQCOM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceImageProcessing2PropertiesQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceImageProcessing2PropertiesQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceImageProcessing2PropertiesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceImageProcessing2PropertiesQCOM#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceImageProcessing2PropertiesQCOM.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceImageProcessing2PropertiesQCOM#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceImageProcessing2PropertiesQCOM.npNext(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkPhysicalDeviceImageProcessing2PropertiesQCOM#maxBlockMatchWindow} field. */
        public VkExtent2D maxBlockMatchWindow() { return VkPhysicalDeviceImageProcessing2PropertiesQCOM.nmaxBlockMatchWindow(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceImageProcessing2PropertiesQCOM#sType} field. */
        public VkPhysicalDeviceImageProcessing2PropertiesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceImageProcessing2PropertiesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMImageProcessing2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_PROPERTIES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_PROPERTIES_QCOM} value to the {@link VkPhysicalDeviceImageProcessing2PropertiesQCOM#sType} field. */
        public VkPhysicalDeviceImageProcessing2PropertiesQCOM.Buffer sType$Default() { return sType(QCOMImageProcessing2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_PROPERTIES_QCOM); }
        /** Sets the specified value to the {@link VkPhysicalDeviceImageProcessing2PropertiesQCOM#pNext} field. */
        public VkPhysicalDeviceImageProcessing2PropertiesQCOM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceImageProcessing2PropertiesQCOM.npNext(address(), value); return this; }

    }

}