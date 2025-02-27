/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct VkMemoryType {
 *     VkMemoryPropertyFlags propertyFlags;
 *     uint32_t heapIndex;
 * }}</pre>
 */
public class VkMemoryType extends Struct<VkMemoryType> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PROPERTYFLAGS,
        HEAPINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PROPERTYFLAGS = layout.offsetof(0);
        HEAPINDEX = layout.offsetof(1);
    }

    protected VkMemoryType(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryType create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryType(address, container);
    }

    /**
     * Creates a {@code VkMemoryType} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryType(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code propertyFlags} field. */
    @NativeType("VkMemoryPropertyFlags")
    public int propertyFlags() { return npropertyFlags(address()); }
    /** @return the value of the {@code heapIndex} field. */
    @NativeType("uint32_t")
    public int heapIndex() { return nheapIndex(address()); }

    // -----------------------------------

    /** Returns a new {@code VkMemoryType} instance for the specified memory address. */
    public static VkMemoryType create(long address) {
        return new VkMemoryType(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMemoryType createSafe(long address) {
        return address == NULL ? null : new VkMemoryType(address, null);
    }

    /**
     * Create a {@link VkMemoryType.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryType.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMemoryType.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #propertyFlags}. */
    public static int npropertyFlags(long struct) { return memGetInt(struct + VkMemoryType.PROPERTYFLAGS); }
    /** Unsafe version of {@link #heapIndex}. */
    public static int nheapIndex(long struct) { return memGetInt(struct + VkMemoryType.HEAPINDEX); }

    // -----------------------------------

    /** An array of {@link VkMemoryType} structs. */
    public static class Buffer extends StructBuffer<VkMemoryType, Buffer> {

        private static final VkMemoryType ELEMENT_FACTORY = VkMemoryType.create(-1L);

        /**
         * Creates a new {@code VkMemoryType.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryType#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryType getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code propertyFlags} field. */
        @NativeType("VkMemoryPropertyFlags")
        public int propertyFlags() { return VkMemoryType.npropertyFlags(address()); }
        /** @return the value of the {@code heapIndex} field. */
        @NativeType("uint32_t")
        public int heapIndex() { return VkMemoryType.nheapIndex(address()); }

    }

}