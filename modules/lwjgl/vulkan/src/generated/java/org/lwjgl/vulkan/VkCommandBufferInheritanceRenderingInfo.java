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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkCommandBufferInheritanceRenderingInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkRenderingFlags flags;
 *     uint32_t viewMask;
 *     uint32_t colorAttachmentCount;
 *     VkFormat const * pColorAttachmentFormats;
 *     VkFormat depthAttachmentFormat;
 *     VkFormat stencilAttachmentFormat;
 *     VkSampleCountFlagBits rasterizationSamples;
 * }}</pre>
 */
public class VkCommandBufferInheritanceRenderingInfo extends Struct<VkCommandBufferInheritanceRenderingInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        VIEWMASK,
        COLORATTACHMENTCOUNT,
        PCOLORATTACHMENTFORMATS,
        DEPTHATTACHMENTFORMAT,
        STENCILATTACHMENTFORMAT,
        RASTERIZATIONSAMPLES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        VIEWMASK = layout.offsetof(3);
        COLORATTACHMENTCOUNT = layout.offsetof(4);
        PCOLORATTACHMENTFORMATS = layout.offsetof(5);
        DEPTHATTACHMENTFORMAT = layout.offsetof(6);
        STENCILATTACHMENTFORMAT = layout.offsetof(7);
        RASTERIZATIONSAMPLES = layout.offsetof(8);
    }

    protected VkCommandBufferInheritanceRenderingInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCommandBufferInheritanceRenderingInfo create(long address, @Nullable ByteBuffer container) {
        return new VkCommandBufferInheritanceRenderingInfo(address, container);
    }

    /**
     * Creates a {@code VkCommandBufferInheritanceRenderingInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCommandBufferInheritanceRenderingInfo(ByteBuffer container) {
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
    @NativeType("VkRenderingFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code viewMask} field. */
    @NativeType("uint32_t")
    public int viewMask() { return nviewMask(address()); }
    /** @return the value of the {@code colorAttachmentCount} field. */
    @NativeType("uint32_t")
    public int colorAttachmentCount() { return ncolorAttachmentCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pColorAttachmentFormats} field. */
    @NativeType("VkFormat const *")
    public @Nullable IntBuffer pColorAttachmentFormats() { return npColorAttachmentFormats(address()); }
    /** @return the value of the {@code depthAttachmentFormat} field. */
    @NativeType("VkFormat")
    public int depthAttachmentFormat() { return ndepthAttachmentFormat(address()); }
    /** @return the value of the {@code stencilAttachmentFormat} field. */
    @NativeType("VkFormat")
    public int stencilAttachmentFormat() { return nstencilAttachmentFormat(address()); }
    /** @return the value of the {@code rasterizationSamples} field. */
    @NativeType("VkSampleCountFlagBits")
    public int rasterizationSamples() { return nrasterizationSamples(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCommandBufferInheritanceRenderingInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO} value to the {@code sType} field. */
    public VkCommandBufferInheritanceRenderingInfo sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCommandBufferInheritanceRenderingInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkCommandBufferInheritanceRenderingInfo flags(@NativeType("VkRenderingFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code viewMask} field. */
    public VkCommandBufferInheritanceRenderingInfo viewMask(@NativeType("uint32_t") int value) { nviewMask(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pColorAttachmentFormats} field. */
    public VkCommandBufferInheritanceRenderingInfo pColorAttachmentFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { npColorAttachmentFormats(address(), value); return this; }
    /** Sets the specified value to the {@code depthAttachmentFormat} field. */
    public VkCommandBufferInheritanceRenderingInfo depthAttachmentFormat(@NativeType("VkFormat") int value) { ndepthAttachmentFormat(address(), value); return this; }
    /** Sets the specified value to the {@code stencilAttachmentFormat} field. */
    public VkCommandBufferInheritanceRenderingInfo stencilAttachmentFormat(@NativeType("VkFormat") int value) { nstencilAttachmentFormat(address(), value); return this; }
    /** Sets the specified value to the {@code rasterizationSamples} field. */
    public VkCommandBufferInheritanceRenderingInfo rasterizationSamples(@NativeType("VkSampleCountFlagBits") int value) { nrasterizationSamples(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCommandBufferInheritanceRenderingInfo set(
        int sType,
        long pNext,
        int flags,
        int viewMask,
        @Nullable IntBuffer pColorAttachmentFormats,
        int depthAttachmentFormat,
        int stencilAttachmentFormat,
        int rasterizationSamples
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        viewMask(viewMask);
        pColorAttachmentFormats(pColorAttachmentFormats);
        depthAttachmentFormat(depthAttachmentFormat);
        stencilAttachmentFormat(stencilAttachmentFormat);
        rasterizationSamples(rasterizationSamples);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCommandBufferInheritanceRenderingInfo set(VkCommandBufferInheritanceRenderingInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCommandBufferInheritanceRenderingInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCommandBufferInheritanceRenderingInfo malloc() {
        return new VkCommandBufferInheritanceRenderingInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCommandBufferInheritanceRenderingInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCommandBufferInheritanceRenderingInfo calloc() {
        return new VkCommandBufferInheritanceRenderingInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCommandBufferInheritanceRenderingInfo} instance allocated with {@link BufferUtils}. */
    public static VkCommandBufferInheritanceRenderingInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCommandBufferInheritanceRenderingInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkCommandBufferInheritanceRenderingInfo} instance for the specified memory address. */
    public static VkCommandBufferInheritanceRenderingInfo create(long address) {
        return new VkCommandBufferInheritanceRenderingInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCommandBufferInheritanceRenderingInfo createSafe(long address) {
        return address == NULL ? null : new VkCommandBufferInheritanceRenderingInfo(address, null);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderingInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderingInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderingInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderingInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderingInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderingInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCommandBufferInheritanceRenderingInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderingInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCommandBufferInheritanceRenderingInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCommandBufferInheritanceRenderingInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferInheritanceRenderingInfo malloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceRenderingInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCommandBufferInheritanceRenderingInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferInheritanceRenderingInfo calloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceRenderingInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderingInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderingInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderingInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderingInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCommandBufferInheritanceRenderingInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCommandBufferInheritanceRenderingInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkCommandBufferInheritanceRenderingInfo.FLAGS); }
    /** Unsafe version of {@link #viewMask}. */
    public static int nviewMask(long struct) { return memGetInt(struct + VkCommandBufferInheritanceRenderingInfo.VIEWMASK); }
    /** Unsafe version of {@link #colorAttachmentCount}. */
    public static int ncolorAttachmentCount(long struct) { return memGetInt(struct + VkCommandBufferInheritanceRenderingInfo.COLORATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pColorAttachmentFormats() pColorAttachmentFormats}. */
    public static @Nullable IntBuffer npColorAttachmentFormats(long struct) { return memIntBufferSafe(memGetAddress(struct + VkCommandBufferInheritanceRenderingInfo.PCOLORATTACHMENTFORMATS), ncolorAttachmentCount(struct)); }
    /** Unsafe version of {@link #depthAttachmentFormat}. */
    public static int ndepthAttachmentFormat(long struct) { return memGetInt(struct + VkCommandBufferInheritanceRenderingInfo.DEPTHATTACHMENTFORMAT); }
    /** Unsafe version of {@link #stencilAttachmentFormat}. */
    public static int nstencilAttachmentFormat(long struct) { return memGetInt(struct + VkCommandBufferInheritanceRenderingInfo.STENCILATTACHMENTFORMAT); }
    /** Unsafe version of {@link #rasterizationSamples}. */
    public static int nrasterizationSamples(long struct) { return memGetInt(struct + VkCommandBufferInheritanceRenderingInfo.RASTERIZATIONSAMPLES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceRenderingInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCommandBufferInheritanceRenderingInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceRenderingInfo.FLAGS, value); }
    /** Unsafe version of {@link #viewMask(int) viewMask}. */
    public static void nviewMask(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceRenderingInfo.VIEWMASK, value); }
    /** Sets the specified value to the {@code colorAttachmentCount} field of the specified {@code struct}. */
    public static void ncolorAttachmentCount(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceRenderingInfo.COLORATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pColorAttachmentFormats(IntBuffer) pColorAttachmentFormats}. */
    public static void npColorAttachmentFormats(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkCommandBufferInheritanceRenderingInfo.PCOLORATTACHMENTFORMATS, memAddressSafe(value)); ncolorAttachmentCount(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #depthAttachmentFormat(int) depthAttachmentFormat}. */
    public static void ndepthAttachmentFormat(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceRenderingInfo.DEPTHATTACHMENTFORMAT, value); }
    /** Unsafe version of {@link #stencilAttachmentFormat(int) stencilAttachmentFormat}. */
    public static void nstencilAttachmentFormat(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceRenderingInfo.STENCILATTACHMENTFORMAT, value); }
    /** Unsafe version of {@link #rasterizationSamples(int) rasterizationSamples}. */
    public static void nrasterizationSamples(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceRenderingInfo.RASTERIZATIONSAMPLES, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ncolorAttachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkCommandBufferInheritanceRenderingInfo.PCOLORATTACHMENTFORMATS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkCommandBufferInheritanceRenderingInfo} structs. */
    public static class Buffer extends StructBuffer<VkCommandBufferInheritanceRenderingInfo, Buffer> implements NativeResource {

        private static final VkCommandBufferInheritanceRenderingInfo ELEMENT_FACTORY = VkCommandBufferInheritanceRenderingInfo.create(-1L);

        /**
         * Creates a new {@code VkCommandBufferInheritanceRenderingInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCommandBufferInheritanceRenderingInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCommandBufferInheritanceRenderingInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCommandBufferInheritanceRenderingInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCommandBufferInheritanceRenderingInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkRenderingFlags")
        public int flags() { return VkCommandBufferInheritanceRenderingInfo.nflags(address()); }
        /** @return the value of the {@code viewMask} field. */
        @NativeType("uint32_t")
        public int viewMask() { return VkCommandBufferInheritanceRenderingInfo.nviewMask(address()); }
        /** @return the value of the {@code colorAttachmentCount} field. */
        @NativeType("uint32_t")
        public int colorAttachmentCount() { return VkCommandBufferInheritanceRenderingInfo.ncolorAttachmentCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pColorAttachmentFormats} field. */
        @NativeType("VkFormat const *")
        public @Nullable IntBuffer pColorAttachmentFormats() { return VkCommandBufferInheritanceRenderingInfo.npColorAttachmentFormats(address()); }
        /** @return the value of the {@code depthAttachmentFormat} field. */
        @NativeType("VkFormat")
        public int depthAttachmentFormat() { return VkCommandBufferInheritanceRenderingInfo.ndepthAttachmentFormat(address()); }
        /** @return the value of the {@code stencilAttachmentFormat} field. */
        @NativeType("VkFormat")
        public int stencilAttachmentFormat() { return VkCommandBufferInheritanceRenderingInfo.nstencilAttachmentFormat(address()); }
        /** @return the value of the {@code rasterizationSamples} field. */
        @NativeType("VkSampleCountFlagBits")
        public int rasterizationSamples() { return VkCommandBufferInheritanceRenderingInfo.nrasterizationSamples(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCommandBufferInheritanceRenderingInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkCommandBufferInheritanceRenderingInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO} value to the {@code sType} field. */
        public VkCommandBufferInheritanceRenderingInfo.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCommandBufferInheritanceRenderingInfo.Buffer pNext(@NativeType("void const *") long value) { VkCommandBufferInheritanceRenderingInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkCommandBufferInheritanceRenderingInfo.Buffer flags(@NativeType("VkRenderingFlags") int value) { VkCommandBufferInheritanceRenderingInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code viewMask} field. */
        public VkCommandBufferInheritanceRenderingInfo.Buffer viewMask(@NativeType("uint32_t") int value) { VkCommandBufferInheritanceRenderingInfo.nviewMask(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pColorAttachmentFormats} field. */
        public VkCommandBufferInheritanceRenderingInfo.Buffer pColorAttachmentFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { VkCommandBufferInheritanceRenderingInfo.npColorAttachmentFormats(address(), value); return this; }
        /** Sets the specified value to the {@code depthAttachmentFormat} field. */
        public VkCommandBufferInheritanceRenderingInfo.Buffer depthAttachmentFormat(@NativeType("VkFormat") int value) { VkCommandBufferInheritanceRenderingInfo.ndepthAttachmentFormat(address(), value); return this; }
        /** Sets the specified value to the {@code stencilAttachmentFormat} field. */
        public VkCommandBufferInheritanceRenderingInfo.Buffer stencilAttachmentFormat(@NativeType("VkFormat") int value) { VkCommandBufferInheritanceRenderingInfo.nstencilAttachmentFormat(address(), value); return this; }
        /** Sets the specified value to the {@code rasterizationSamples} field. */
        public VkCommandBufferInheritanceRenderingInfo.Buffer rasterizationSamples(@NativeType("VkSampleCountFlagBits") int value) { VkCommandBufferInheritanceRenderingInfo.nrasterizationSamples(address(), value); return this; }

    }

}