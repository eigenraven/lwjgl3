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
 * struct VkDisplaySurfaceCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDisplaySurfaceCreateFlagsKHR flags;
 *     VkDisplayModeKHR displayMode;
 *     uint32_t planeIndex;
 *     uint32_t planeStackIndex;
 *     VkSurfaceTransformFlagBitsKHR transform;
 *     float globalAlpha;
 *     VkDisplayPlaneAlphaFlagBitsKHR alphaMode;
 *     {@link VkExtent2D VkExtent2D} imageExtent;
 * }}</pre>
 */
public class VkDisplaySurfaceCreateInfoKHR extends Struct<VkDisplaySurfaceCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        DISPLAYMODE,
        PLANEINDEX,
        PLANESTACKINDEX,
        TRANSFORM,
        GLOBALALPHA,
        ALPHAMODE,
        IMAGEEXTENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DISPLAYMODE = layout.offsetof(3);
        PLANEINDEX = layout.offsetof(4);
        PLANESTACKINDEX = layout.offsetof(5);
        TRANSFORM = layout.offsetof(6);
        GLOBALALPHA = layout.offsetof(7);
        ALPHAMODE = layout.offsetof(8);
        IMAGEEXTENT = layout.offsetof(9);
    }

    protected VkDisplaySurfaceCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDisplaySurfaceCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkDisplaySurfaceCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkDisplaySurfaceCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDisplaySurfaceCreateInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkDisplaySurfaceCreateFlagsKHR")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code displayMode} field. */
    @NativeType("VkDisplayModeKHR")
    public long displayMode() { return ndisplayMode(address()); }
    /** @return the value of the {@code planeIndex} field. */
    @NativeType("uint32_t")
    public int planeIndex() { return nplaneIndex(address()); }
    /** @return the value of the {@code planeStackIndex} field. */
    @NativeType("uint32_t")
    public int planeStackIndex() { return nplaneStackIndex(address()); }
    /** @return the value of the {@code transform} field. */
    @NativeType("VkSurfaceTransformFlagBitsKHR")
    public int transform() { return ntransform(address()); }
    /** @return the value of the {@code globalAlpha} field. */
    public float globalAlpha() { return nglobalAlpha(address()); }
    /** @return the value of the {@code alphaMode} field. */
    @NativeType("VkDisplayPlaneAlphaFlagBitsKHR")
    public int alphaMode() { return nalphaMode(address()); }
    /** @return a {@link VkExtent2D} view of the {@code imageExtent} field. */
    public VkExtent2D imageExtent() { return nimageExtent(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDisplaySurfaceCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDisplay#VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR} value to the {@code sType} field. */
    public VkDisplaySurfaceCreateInfoKHR sType$Default() { return sType(KHRDisplay.VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDisplaySurfaceCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDisplaySurfaceStereoCreateInfoNV} value to the {@code pNext} chain. */
    public VkDisplaySurfaceCreateInfoKHR pNext(VkDisplaySurfaceStereoCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkDisplaySurfaceCreateInfoKHR flags(@NativeType("VkDisplaySurfaceCreateFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code displayMode} field. */
    public VkDisplaySurfaceCreateInfoKHR displayMode(@NativeType("VkDisplayModeKHR") long value) { ndisplayMode(address(), value); return this; }
    /** Sets the specified value to the {@code planeIndex} field. */
    public VkDisplaySurfaceCreateInfoKHR planeIndex(@NativeType("uint32_t") int value) { nplaneIndex(address(), value); return this; }
    /** Sets the specified value to the {@code planeStackIndex} field. */
    public VkDisplaySurfaceCreateInfoKHR planeStackIndex(@NativeType("uint32_t") int value) { nplaneStackIndex(address(), value); return this; }
    /** Sets the specified value to the {@code transform} field. */
    public VkDisplaySurfaceCreateInfoKHR transform(@NativeType("VkSurfaceTransformFlagBitsKHR") int value) { ntransform(address(), value); return this; }
    /** Sets the specified value to the {@code globalAlpha} field. */
    public VkDisplaySurfaceCreateInfoKHR globalAlpha(float value) { nglobalAlpha(address(), value); return this; }
    /** Sets the specified value to the {@code alphaMode} field. */
    public VkDisplaySurfaceCreateInfoKHR alphaMode(@NativeType("VkDisplayPlaneAlphaFlagBitsKHR") int value) { nalphaMode(address(), value); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@code imageExtent} field. */
    public VkDisplaySurfaceCreateInfoKHR imageExtent(VkExtent2D value) { nimageExtent(address(), value); return this; }
    /** Passes the {@code imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDisplaySurfaceCreateInfoKHR imageExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(imageExtent()); return this; }

    /** Initializes this struct with the specified values. */
    public VkDisplaySurfaceCreateInfoKHR set(
        int sType,
        long pNext,
        int flags,
        long displayMode,
        int planeIndex,
        int planeStackIndex,
        int transform,
        float globalAlpha,
        int alphaMode,
        VkExtent2D imageExtent
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        displayMode(displayMode);
        planeIndex(planeIndex);
        planeStackIndex(planeStackIndex);
        transform(transform);
        globalAlpha(globalAlpha);
        alphaMode(alphaMode);
        imageExtent(imageExtent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDisplaySurfaceCreateInfoKHR set(VkDisplaySurfaceCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDisplaySurfaceCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDisplaySurfaceCreateInfoKHR malloc() {
        return new VkDisplaySurfaceCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDisplaySurfaceCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDisplaySurfaceCreateInfoKHR calloc() {
        return new VkDisplaySurfaceCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDisplaySurfaceCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDisplaySurfaceCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDisplaySurfaceCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkDisplaySurfaceCreateInfoKHR} instance for the specified memory address. */
    public static VkDisplaySurfaceCreateInfoKHR create(long address) {
        return new VkDisplaySurfaceCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDisplaySurfaceCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkDisplaySurfaceCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkDisplaySurfaceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplaySurfaceCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDisplaySurfaceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplaySurfaceCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplaySurfaceCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplaySurfaceCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDisplaySurfaceCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDisplaySurfaceCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDisplaySurfaceCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplaySurfaceCreateInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplaySurfaceCreateInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplaySurfaceCreateInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplaySurfaceCreateInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplaySurfaceCreateInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplaySurfaceCreateInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplaySurfaceCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplaySurfaceCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDisplaySurfaceCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplaySurfaceCreateInfoKHR malloc(MemoryStack stack) {
        return new VkDisplaySurfaceCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDisplaySurfaceCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplaySurfaceCreateInfoKHR calloc(MemoryStack stack) {
        return new VkDisplaySurfaceCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDisplaySurfaceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplaySurfaceCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplaySurfaceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplaySurfaceCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDisplaySurfaceCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDisplaySurfaceCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkDisplaySurfaceCreateInfoKHR.FLAGS); }
    /** Unsafe version of {@link #displayMode}. */
    public static long ndisplayMode(long struct) { return memGetLong(struct + VkDisplaySurfaceCreateInfoKHR.DISPLAYMODE); }
    /** Unsafe version of {@link #planeIndex}. */
    public static int nplaneIndex(long struct) { return memGetInt(struct + VkDisplaySurfaceCreateInfoKHR.PLANEINDEX); }
    /** Unsafe version of {@link #planeStackIndex}. */
    public static int nplaneStackIndex(long struct) { return memGetInt(struct + VkDisplaySurfaceCreateInfoKHR.PLANESTACKINDEX); }
    /** Unsafe version of {@link #transform}. */
    public static int ntransform(long struct) { return memGetInt(struct + VkDisplaySurfaceCreateInfoKHR.TRANSFORM); }
    /** Unsafe version of {@link #globalAlpha}. */
    public static float nglobalAlpha(long struct) { return memGetFloat(struct + VkDisplaySurfaceCreateInfoKHR.GLOBALALPHA); }
    /** Unsafe version of {@link #alphaMode}. */
    public static int nalphaMode(long struct) { return memGetInt(struct + VkDisplaySurfaceCreateInfoKHR.ALPHAMODE); }
    /** Unsafe version of {@link #imageExtent}. */
    public static VkExtent2D nimageExtent(long struct) { return VkExtent2D.create(struct + VkDisplaySurfaceCreateInfoKHR.IMAGEEXTENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDisplaySurfaceCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDisplaySurfaceCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkDisplaySurfaceCreateInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #displayMode(long) displayMode}. */
    public static void ndisplayMode(long struct, long value) { memPutLong(struct + VkDisplaySurfaceCreateInfoKHR.DISPLAYMODE, value); }
    /** Unsafe version of {@link #planeIndex(int) planeIndex}. */
    public static void nplaneIndex(long struct, int value) { memPutInt(struct + VkDisplaySurfaceCreateInfoKHR.PLANEINDEX, value); }
    /** Unsafe version of {@link #planeStackIndex(int) planeStackIndex}. */
    public static void nplaneStackIndex(long struct, int value) { memPutInt(struct + VkDisplaySurfaceCreateInfoKHR.PLANESTACKINDEX, value); }
    /** Unsafe version of {@link #transform(int) transform}. */
    public static void ntransform(long struct, int value) { memPutInt(struct + VkDisplaySurfaceCreateInfoKHR.TRANSFORM, value); }
    /** Unsafe version of {@link #globalAlpha(float) globalAlpha}. */
    public static void nglobalAlpha(long struct, float value) { memPutFloat(struct + VkDisplaySurfaceCreateInfoKHR.GLOBALALPHA, value); }
    /** Unsafe version of {@link #alphaMode(int) alphaMode}. */
    public static void nalphaMode(long struct, int value) { memPutInt(struct + VkDisplaySurfaceCreateInfoKHR.ALPHAMODE, value); }
    /** Unsafe version of {@link #imageExtent(VkExtent2D) imageExtent}. */
    public static void nimageExtent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkDisplaySurfaceCreateInfoKHR.IMAGEEXTENT, VkExtent2D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkDisplaySurfaceCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkDisplaySurfaceCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkDisplaySurfaceCreateInfoKHR ELEMENT_FACTORY = VkDisplaySurfaceCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDisplaySurfaceCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDisplaySurfaceCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDisplaySurfaceCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDisplaySurfaceCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDisplaySurfaceCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkDisplaySurfaceCreateFlagsKHR")
        public int flags() { return VkDisplaySurfaceCreateInfoKHR.nflags(address()); }
        /** @return the value of the {@code displayMode} field. */
        @NativeType("VkDisplayModeKHR")
        public long displayMode() { return VkDisplaySurfaceCreateInfoKHR.ndisplayMode(address()); }
        /** @return the value of the {@code planeIndex} field. */
        @NativeType("uint32_t")
        public int planeIndex() { return VkDisplaySurfaceCreateInfoKHR.nplaneIndex(address()); }
        /** @return the value of the {@code planeStackIndex} field. */
        @NativeType("uint32_t")
        public int planeStackIndex() { return VkDisplaySurfaceCreateInfoKHR.nplaneStackIndex(address()); }
        /** @return the value of the {@code transform} field. */
        @NativeType("VkSurfaceTransformFlagBitsKHR")
        public int transform() { return VkDisplaySurfaceCreateInfoKHR.ntransform(address()); }
        /** @return the value of the {@code globalAlpha} field. */
        public float globalAlpha() { return VkDisplaySurfaceCreateInfoKHR.nglobalAlpha(address()); }
        /** @return the value of the {@code alphaMode} field. */
        @NativeType("VkDisplayPlaneAlphaFlagBitsKHR")
        public int alphaMode() { return VkDisplaySurfaceCreateInfoKHR.nalphaMode(address()); }
        /** @return a {@link VkExtent2D} view of the {@code imageExtent} field. */
        public VkExtent2D imageExtent() { return VkDisplaySurfaceCreateInfoKHR.nimageExtent(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDisplaySurfaceCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDisplaySurfaceCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRDisplay#VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR} value to the {@code sType} field. */
        public VkDisplaySurfaceCreateInfoKHR.Buffer sType$Default() { return sType(KHRDisplay.VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDisplaySurfaceCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkDisplaySurfaceCreateInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDisplaySurfaceStereoCreateInfoNV} value to the {@code pNext} chain. */
        public VkDisplaySurfaceCreateInfoKHR.Buffer pNext(VkDisplaySurfaceStereoCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkDisplaySurfaceCreateInfoKHR.Buffer flags(@NativeType("VkDisplaySurfaceCreateFlagsKHR") int value) { VkDisplaySurfaceCreateInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code displayMode} field. */
        public VkDisplaySurfaceCreateInfoKHR.Buffer displayMode(@NativeType("VkDisplayModeKHR") long value) { VkDisplaySurfaceCreateInfoKHR.ndisplayMode(address(), value); return this; }
        /** Sets the specified value to the {@code planeIndex} field. */
        public VkDisplaySurfaceCreateInfoKHR.Buffer planeIndex(@NativeType("uint32_t") int value) { VkDisplaySurfaceCreateInfoKHR.nplaneIndex(address(), value); return this; }
        /** Sets the specified value to the {@code planeStackIndex} field. */
        public VkDisplaySurfaceCreateInfoKHR.Buffer planeStackIndex(@NativeType("uint32_t") int value) { VkDisplaySurfaceCreateInfoKHR.nplaneStackIndex(address(), value); return this; }
        /** Sets the specified value to the {@code transform} field. */
        public VkDisplaySurfaceCreateInfoKHR.Buffer transform(@NativeType("VkSurfaceTransformFlagBitsKHR") int value) { VkDisplaySurfaceCreateInfoKHR.ntransform(address(), value); return this; }
        /** Sets the specified value to the {@code globalAlpha} field. */
        public VkDisplaySurfaceCreateInfoKHR.Buffer globalAlpha(float value) { VkDisplaySurfaceCreateInfoKHR.nglobalAlpha(address(), value); return this; }
        /** Sets the specified value to the {@code alphaMode} field. */
        public VkDisplaySurfaceCreateInfoKHR.Buffer alphaMode(@NativeType("VkDisplayPlaneAlphaFlagBitsKHR") int value) { VkDisplaySurfaceCreateInfoKHR.nalphaMode(address(), value); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@code imageExtent} field. */
        public VkDisplaySurfaceCreateInfoKHR.Buffer imageExtent(VkExtent2D value) { VkDisplaySurfaceCreateInfoKHR.nimageExtent(address(), value); return this; }
        /** Passes the {@code imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDisplaySurfaceCreateInfoKHR.Buffer imageExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(imageExtent()); return this; }

    }

}