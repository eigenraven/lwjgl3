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
 * Structure describing an available display device.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDisplayProperties2KHR}, {@link VkExtent2D}, {@link KHRDisplay#vkGetPhysicalDeviceDisplayPropertiesKHR GetPhysicalDeviceDisplayPropertiesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDisplayPropertiesKHR {
 *     VkDisplayKHR {@link #display};
 *     char const * {@link #displayName};
 *     {@link VkExtent2D VkExtent2D} {@link #physicalDimensions};
 *     {@link VkExtent2D VkExtent2D} {@link #physicalResolution};
 *     VkSurfaceTransformFlagsKHR {@link #supportedTransforms};
 *     VkBool32 {@link #planeReorderPossible};
 *     VkBool32 {@link #persistentContent};
 * }</code></pre>
 */
public class VkDisplayPropertiesKHR extends Struct<VkDisplayPropertiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DISPLAY,
        DISPLAYNAME,
        PHYSICALDIMENSIONS,
        PHYSICALRESOLUTION,
        SUPPORTEDTRANSFORMS,
        PLANEREORDERPOSSIBLE,
        PERSISTENTCONTENT;

    static {
        Layout layout = __struct(
            __member(8),
            __member(POINTER_SIZE),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DISPLAY = layout.offsetof(0);
        DISPLAYNAME = layout.offsetof(1);
        PHYSICALDIMENSIONS = layout.offsetof(2);
        PHYSICALRESOLUTION = layout.offsetof(3);
        SUPPORTEDTRANSFORMS = layout.offsetof(4);
        PLANEREORDERPOSSIBLE = layout.offsetof(5);
        PERSISTENTCONTENT = layout.offsetof(6);
    }

    protected VkDisplayPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDisplayPropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkDisplayPropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkDisplayPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDisplayPropertiesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a handle that is used to refer to the display described here. This handle will be valid for the lifetime of the Vulkan instance. */
    @NativeType("VkDisplayKHR")
    public long display() { return ndisplay(address()); }
    /** {@code NULL} or a pointer to a null-terminated UTF-8 string containing the name of the display. Generally, this will be the name provided by the display’s EDID. If {@code NULL}, no suitable name is available. If not {@code NULL}, the string pointed to <b>must</b> remain accessible and unmodified as long as {@code display} is valid. */
    @NativeType("char const *")
    public ByteBuffer displayName() { return ndisplayName(address()); }
    /** {@code NULL} or a pointer to a null-terminated UTF-8 string containing the name of the display. Generally, this will be the name provided by the display’s EDID. If {@code NULL}, no suitable name is available. If not {@code NULL}, the string pointed to <b>must</b> remain accessible and unmodified as long as {@code display} is valid. */
    @NativeType("char const *")
    public String displayNameString() { return ndisplayNameString(address()); }
    /** describes the physical width and height of the visible portion of the display, in millimeters. */
    public VkExtent2D physicalDimensions() { return nphysicalDimensions(address()); }
    /**
     * describes the physical, native, or preferred resolution of the display.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>For devices which have no natural value to return here, implementations <b>should</b> return the maximum resolution supported.</p>
     * </div>
     */
    public VkExtent2D physicalResolution() { return nphysicalResolution(address()); }
    /** a bitmask of {@code VkSurfaceTransformFlagBitsKHR} describing which transforms are supported by this display. */
    @NativeType("VkSurfaceTransformFlagsKHR")
    public int supportedTransforms() { return nsupportedTransforms(address()); }
    /** tells whether the planes on this display <b>can</b> have their z order changed. If this is {@link VK10#VK_TRUE TRUE}, the application <b>can</b> re-arrange the planes on this display in any order relative to each other. */
    @NativeType("VkBool32")
    public boolean planeReorderPossible() { return nplaneReorderPossible(address()) != 0; }
    /**
     * tells whether the display supports self-refresh/internal buffering. If this is true, the application <b>can</b> submit persistent present operations on swapchains created against this display.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Persistent presents <b>may</b> have higher latency, and <b>may</b> use less power when the screen content is updated infrequently, or when only a portion of the screen needs to be updated in most frames.</p>
     * </div>
     */
    @NativeType("VkBool32")
    public boolean persistentContent() { return npersistentContent(address()) != 0; }

    // -----------------------------------

    /** Returns a new {@code VkDisplayPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDisplayPropertiesKHR malloc() {
        return new VkDisplayPropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDisplayPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDisplayPropertiesKHR calloc() {
        return new VkDisplayPropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDisplayPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkDisplayPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDisplayPropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkDisplayPropertiesKHR} instance for the specified memory address. */
    public static VkDisplayPropertiesKHR create(long address) {
        return new VkDisplayPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDisplayPropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkDisplayPropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkDisplayPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDisplayPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDisplayPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDisplayPropertiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayPropertiesKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayPropertiesKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayPropertiesKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayPropertiesKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayPropertiesKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayPropertiesKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayPropertiesKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayPropertiesKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDisplayPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayPropertiesKHR malloc(MemoryStack stack) {
        return new VkDisplayPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDisplayPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayPropertiesKHR calloc(MemoryStack stack) {
        return new VkDisplayPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDisplayPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetLong(struct + VkDisplayPropertiesKHR.DISPLAY); }
    /** Unsafe version of {@link #displayName}. */
    public static ByteBuffer ndisplayName(long struct) { return memByteBufferNT1(memGetAddress(struct + VkDisplayPropertiesKHR.DISPLAYNAME)); }
    /** Unsafe version of {@link #displayNameString}. */
    public static String ndisplayNameString(long struct) { return memUTF8(memGetAddress(struct + VkDisplayPropertiesKHR.DISPLAYNAME)); }
    /** Unsafe version of {@link #physicalDimensions}. */
    public static VkExtent2D nphysicalDimensions(long struct) { return VkExtent2D.create(struct + VkDisplayPropertiesKHR.PHYSICALDIMENSIONS); }
    /** Unsafe version of {@link #physicalResolution}. */
    public static VkExtent2D nphysicalResolution(long struct) { return VkExtent2D.create(struct + VkDisplayPropertiesKHR.PHYSICALRESOLUTION); }
    /** Unsafe version of {@link #supportedTransforms}. */
    public static int nsupportedTransforms(long struct) { return memGetInt(struct + VkDisplayPropertiesKHR.SUPPORTEDTRANSFORMS); }
    /** Unsafe version of {@link #planeReorderPossible}. */
    public static int nplaneReorderPossible(long struct) { return memGetInt(struct + VkDisplayPropertiesKHR.PLANEREORDERPOSSIBLE); }
    /** Unsafe version of {@link #persistentContent}. */
    public static int npersistentContent(long struct) { return memGetInt(struct + VkDisplayPropertiesKHR.PERSISTENTCONTENT); }

    // -----------------------------------

    /** An array of {@link VkDisplayPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkDisplayPropertiesKHR, Buffer> implements NativeResource {

        private static final VkDisplayPropertiesKHR ELEMENT_FACTORY = VkDisplayPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkDisplayPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDisplayPropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDisplayPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDisplayPropertiesKHR#display} field. */
        @NativeType("VkDisplayKHR")
        public long display() { return VkDisplayPropertiesKHR.ndisplay(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link VkDisplayPropertiesKHR#displayName} field. */
        @NativeType("char const *")
        public ByteBuffer displayName() { return VkDisplayPropertiesKHR.ndisplayName(address()); }
        /** @return the null-terminated string pointed to by the {@link VkDisplayPropertiesKHR#displayName} field. */
        @NativeType("char const *")
        public String displayNameString() { return VkDisplayPropertiesKHR.ndisplayNameString(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkDisplayPropertiesKHR#physicalDimensions} field. */
        public VkExtent2D physicalDimensions() { return VkDisplayPropertiesKHR.nphysicalDimensions(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkDisplayPropertiesKHR#physicalResolution} field. */
        public VkExtent2D physicalResolution() { return VkDisplayPropertiesKHR.nphysicalResolution(address()); }
        /** @return the value of the {@link VkDisplayPropertiesKHR#supportedTransforms} field. */
        @NativeType("VkSurfaceTransformFlagsKHR")
        public int supportedTransforms() { return VkDisplayPropertiesKHR.nsupportedTransforms(address()); }
        /** @return the value of the {@link VkDisplayPropertiesKHR#planeReorderPossible} field. */
        @NativeType("VkBool32")
        public boolean planeReorderPossible() { return VkDisplayPropertiesKHR.nplaneReorderPossible(address()) != 0; }
        /** @return the value of the {@link VkDisplayPropertiesKHR#persistentContent} field. */
        @NativeType("VkBool32")
        public boolean persistentContent() { return VkDisplayPropertiesKHR.npersistentContent(address()) != 0; }

    }

}