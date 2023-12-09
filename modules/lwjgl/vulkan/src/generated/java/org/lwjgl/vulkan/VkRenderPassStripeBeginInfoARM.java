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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying striped rendering information.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure can be included in the {@code pNext} chain of {@link VkRenderPassBeginInfo} or {@link VkRenderingInfo} to define how the render pass instance is split into stripes.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code stripeInfoCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceRenderPassStripedPropertiesARM}{@code ::maxRenderPassStripes}</li>
 * <li>The {@code stripeArea} defined by each element of {@code pStripeInfos} <b>must</b> not overlap the {@code stripeArea} of any other element</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link ARMRenderPassStriped#VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_BEGIN_INFO_ARM STRUCTURE_TYPE_RENDER_PASS_STRIPE_BEGIN_INFO_ARM}</li>
 * <li>{@code pStripeInfos} <b>must</b> be a valid pointer to an array of {@code stripeInfoCount} {@link VkRenderPassStripeInfoARM} structures</li>
 * <li>{@code stripeInfoCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRenderPassStripeInfoARM}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderPassStripeBeginInfoARM {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #stripeInfoCount};
 *     {@link VkRenderPassStripeInfoARM VkRenderPassStripeInfoARM} * {@link #pStripeInfos};
 * }</code></pre>
 */
public class VkRenderPassStripeBeginInfoARM extends Struct<VkRenderPassStripeBeginInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STRIPEINFOCOUNT,
        PSTRIPEINFOS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STRIPEINFOCOUNT = layout.offsetof(2);
        PSTRIPEINFOS = layout.offsetof(3);
    }

    protected VkRenderPassStripeBeginInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderPassStripeBeginInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkRenderPassStripeBeginInfoARM(address, container);
    }

    /**
     * Creates a {@code VkRenderPassStripeBeginInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassStripeBeginInfoARM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the number of stripes in this render pass instance */
    @NativeType("uint32_t")
    public int stripeInfoCount() { return nstripeInfoCount(address()); }
    /** a pointer to an array of {@code stripeInfoCount} {@link VkRenderPassStripeInfoARM} structures describing the stripes used by the render pass instance. */
    @NativeType("VkRenderPassStripeInfoARM *")
    public VkRenderPassStripeInfoARM.Buffer pStripeInfos() { return npStripeInfos(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkRenderPassStripeBeginInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMRenderPassStriped#VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_BEGIN_INFO_ARM STRUCTURE_TYPE_RENDER_PASS_STRIPE_BEGIN_INFO_ARM} value to the {@link #sType} field. */
    public VkRenderPassStripeBeginInfoARM sType$Default() { return sType(ARMRenderPassStriped.VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_BEGIN_INFO_ARM); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkRenderPassStripeBeginInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkRenderPassStripeInfoARM.Buffer} to the {@link #pStripeInfos} field. */
    public VkRenderPassStripeBeginInfoARM pStripeInfos(@NativeType("VkRenderPassStripeInfoARM *") VkRenderPassStripeInfoARM.Buffer value) { npStripeInfos(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassStripeBeginInfoARM set(
        int sType,
        long pNext,
        VkRenderPassStripeInfoARM.Buffer pStripeInfos
    ) {
        sType(sType);
        pNext(pNext);
        pStripeInfos(pStripeInfos);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassStripeBeginInfoARM set(VkRenderPassStripeBeginInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassStripeBeginInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassStripeBeginInfoARM malloc() {
        return new VkRenderPassStripeBeginInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassStripeBeginInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassStripeBeginInfoARM calloc() {
        return new VkRenderPassStripeBeginInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassStripeBeginInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassStripeBeginInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassStripeBeginInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassStripeBeginInfoARM} instance for the specified memory address. */
    public static VkRenderPassStripeBeginInfoARM create(long address) {
        return new VkRenderPassStripeBeginInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassStripeBeginInfoARM createSafe(long address) {
        return address == NULL ? null : new VkRenderPassStripeBeginInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkRenderPassStripeBeginInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassStripeBeginInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassStripeBeginInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassStripeBeginInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassStripeBeginInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassStripeBeginInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderPassStripeBeginInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassStripeBeginInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassStripeBeginInfoARM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRenderPassStripeBeginInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassStripeBeginInfoARM malloc(MemoryStack stack) {
        return new VkRenderPassStripeBeginInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderPassStripeBeginInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassStripeBeginInfoARM calloc(MemoryStack stack) {
        return new VkRenderPassStripeBeginInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderPassStripeBeginInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassStripeBeginInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassStripeBeginInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassStripeBeginInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassStripeBeginInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassStripeBeginInfoARM.PNEXT); }
    /** Unsafe version of {@link #stripeInfoCount}. */
    public static int nstripeInfoCount(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassStripeBeginInfoARM.STRIPEINFOCOUNT); }
    /** Unsafe version of {@link #pStripeInfos}. */
    public static VkRenderPassStripeInfoARM.Buffer npStripeInfos(long struct) { return VkRenderPassStripeInfoARM.create(memGetAddress(struct + VkRenderPassStripeBeginInfoARM.PSTRIPEINFOS), nstripeInfoCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassStripeBeginInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassStripeBeginInfoARM.PNEXT, value); }
    /** Sets the specified value to the {@code stripeInfoCount} field of the specified {@code struct}. */
    public static void nstripeInfoCount(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassStripeBeginInfoARM.STRIPEINFOCOUNT, value); }
    /** Unsafe version of {@link #pStripeInfos(VkRenderPassStripeInfoARM.Buffer) pStripeInfos}. */
    public static void npStripeInfos(long struct, VkRenderPassStripeInfoARM.Buffer value) { memPutAddress(struct + VkRenderPassStripeBeginInfoARM.PSTRIPEINFOS, value.address()); nstripeInfoCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkRenderPassStripeBeginInfoARM.PSTRIPEINFOS));
    }

    // -----------------------------------

    /** An array of {@link VkRenderPassStripeBeginInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassStripeBeginInfoARM, Buffer> implements NativeResource {

        private static final VkRenderPassStripeBeginInfoARM ELEMENT_FACTORY = VkRenderPassStripeBeginInfoARM.create(-1L);

        /**
         * Creates a new {@code VkRenderPassStripeBeginInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassStripeBeginInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderPassStripeBeginInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkRenderPassStripeBeginInfoARM#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassStripeBeginInfoARM.nsType(address()); }
        /** @return the value of the {@link VkRenderPassStripeBeginInfoARM#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassStripeBeginInfoARM.npNext(address()); }
        /** @return the value of the {@link VkRenderPassStripeBeginInfoARM#stripeInfoCount} field. */
        @NativeType("uint32_t")
        public int stripeInfoCount() { return VkRenderPassStripeBeginInfoARM.nstripeInfoCount(address()); }
        /** @return a {@link VkRenderPassStripeInfoARM.Buffer} view of the struct array pointed to by the {@link VkRenderPassStripeBeginInfoARM#pStripeInfos} field. */
        @NativeType("VkRenderPassStripeInfoARM *")
        public VkRenderPassStripeInfoARM.Buffer pStripeInfos() { return VkRenderPassStripeBeginInfoARM.npStripeInfos(address()); }

        /** Sets the specified value to the {@link VkRenderPassStripeBeginInfoARM#sType} field. */
        public VkRenderPassStripeBeginInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassStripeBeginInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMRenderPassStriped#VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_BEGIN_INFO_ARM STRUCTURE_TYPE_RENDER_PASS_STRIPE_BEGIN_INFO_ARM} value to the {@link VkRenderPassStripeBeginInfoARM#sType} field. */
        public VkRenderPassStripeBeginInfoARM.Buffer sType$Default() { return sType(ARMRenderPassStriped.VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_BEGIN_INFO_ARM); }
        /** Sets the specified value to the {@link VkRenderPassStripeBeginInfoARM#pNext} field. */
        public VkRenderPassStripeBeginInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassStripeBeginInfoARM.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkRenderPassStripeInfoARM.Buffer} to the {@link VkRenderPassStripeBeginInfoARM#pStripeInfos} field. */
        public VkRenderPassStripeBeginInfoARM.Buffer pStripeInfos(@NativeType("VkRenderPassStripeInfoARM *") VkRenderPassStripeInfoARM.Buffer value) { VkRenderPassStripeBeginInfoARM.npStripeInfos(address(), value); return this; }

    }

}