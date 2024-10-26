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
 * Structure specifying the input parameters of a calibrated timestamp query.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code timeDomain} <b>must</b> be one of the {@code VkTimeDomainKHR} values returned by {@link KHRCalibratedTimestamps#vkGetPhysicalDeviceCalibrateableTimeDomainsKHR GetPhysicalDeviceCalibrateableTimeDomainsKHR}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRCalibratedTimestamps#VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code timeDomain} <b>must</b> be a valid {@code VkTimeDomainKHR} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTCalibratedTimestamps#vkGetCalibratedTimestampsEXT GetCalibratedTimestampsEXT}, {@link KHRCalibratedTimestamps#vkGetCalibratedTimestampsKHR GetCalibratedTimestampsKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCalibratedTimestampInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkTimeDomainKHR {@link #timeDomain};
 * }</code></pre>
 */
public class VkCalibratedTimestampInfoKHR extends Struct<VkCalibratedTimestampInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TIMEDOMAIN;

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
        TIMEDOMAIN = layout.offsetof(2);
    }

    protected VkCalibratedTimestampInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCalibratedTimestampInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkCalibratedTimestampInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkCalibratedTimestampInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCalibratedTimestampInfoKHR(ByteBuffer container) {
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
    /** a {@code VkTimeDomainKHR} value specifying the time domain from which the calibrated timestamp value should be returned. */
    @NativeType("VkTimeDomainKHR")
    public int timeDomain() { return ntimeDomain(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCalibratedTimestampInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRCalibratedTimestamps#VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR} value to the {@link #sType} field. */
    public VkCalibratedTimestampInfoKHR sType$Default() { return sType(KHRCalibratedTimestamps.VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCalibratedTimestampInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #timeDomain} field. */
    public VkCalibratedTimestampInfoKHR timeDomain(@NativeType("VkTimeDomainKHR") int value) { ntimeDomain(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCalibratedTimestampInfoKHR set(
        int sType,
        long pNext,
        int timeDomain
    ) {
        sType(sType);
        pNext(pNext);
        timeDomain(timeDomain);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCalibratedTimestampInfoKHR set(VkCalibratedTimestampInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCalibratedTimestampInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCalibratedTimestampInfoKHR malloc() {
        return new VkCalibratedTimestampInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCalibratedTimestampInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCalibratedTimestampInfoKHR calloc() {
        return new VkCalibratedTimestampInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCalibratedTimestampInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkCalibratedTimestampInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCalibratedTimestampInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkCalibratedTimestampInfoKHR} instance for the specified memory address. */
    public static VkCalibratedTimestampInfoKHR create(long address) {
        return new VkCalibratedTimestampInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCalibratedTimestampInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkCalibratedTimestampInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkCalibratedTimestampInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCalibratedTimestampInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCalibratedTimestampInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCalibratedTimestampInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCalibratedTimestampInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCalibratedTimestampInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCalibratedTimestampInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCalibratedTimestampInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCalibratedTimestampInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCalibratedTimestampInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCalibratedTimestampInfoKHR malloc(MemoryStack stack) {
        return new VkCalibratedTimestampInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCalibratedTimestampInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCalibratedTimestampInfoKHR calloc(MemoryStack stack) {
        return new VkCalibratedTimestampInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCalibratedTimestampInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCalibratedTimestampInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCalibratedTimestampInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCalibratedTimestampInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCalibratedTimestampInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCalibratedTimestampInfoKHR.PNEXT); }
    /** Unsafe version of {@link #timeDomain}. */
    public static int ntimeDomain(long struct) { return memGetInt(struct + VkCalibratedTimestampInfoKHR.TIMEDOMAIN); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCalibratedTimestampInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCalibratedTimestampInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #timeDomain(int) timeDomain}. */
    public static void ntimeDomain(long struct, int value) { memPutInt(struct + VkCalibratedTimestampInfoKHR.TIMEDOMAIN, value); }

    // -----------------------------------

    /** An array of {@link VkCalibratedTimestampInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkCalibratedTimestampInfoKHR, Buffer> implements NativeResource {

        private static final VkCalibratedTimestampInfoKHR ELEMENT_FACTORY = VkCalibratedTimestampInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkCalibratedTimestampInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCalibratedTimestampInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCalibratedTimestampInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCalibratedTimestampInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCalibratedTimestampInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkCalibratedTimestampInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCalibratedTimestampInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkCalibratedTimestampInfoKHR#timeDomain} field. */
        @NativeType("VkTimeDomainKHR")
        public int timeDomain() { return VkCalibratedTimestampInfoKHR.ntimeDomain(address()); }

        /** Sets the specified value to the {@link VkCalibratedTimestampInfoKHR#sType} field. */
        public VkCalibratedTimestampInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkCalibratedTimestampInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRCalibratedTimestamps#VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR} value to the {@link VkCalibratedTimestampInfoKHR#sType} field. */
        public VkCalibratedTimestampInfoKHR.Buffer sType$Default() { return sType(KHRCalibratedTimestamps.VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR); }
        /** Sets the specified value to the {@link VkCalibratedTimestampInfoKHR#pNext} field. */
        public VkCalibratedTimestampInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkCalibratedTimestampInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkCalibratedTimestampInfoKHR#timeDomain} field. */
        public VkCalibratedTimestampInfoKHR.Buffer timeDomain(@NativeType("VkTimeDomainKHR") int value) { VkCalibratedTimestampInfoKHR.ntimeDomain(address(), value); return this; }

    }

}