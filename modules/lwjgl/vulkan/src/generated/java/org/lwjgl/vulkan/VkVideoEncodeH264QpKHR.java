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
 * Structure describing H.264 QP values per picture type.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH264QualityLevelPropertiesKHR}, {@link VkVideoEncodeH264RateControlLayerInfoKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH264QpKHR {
 *     int32_t {@link #qpI};
 *     int32_t {@link #qpP};
 *     int32_t {@link #qpB};
 * }</code></pre>
 */
public class VkVideoEncodeH264QpKHR extends Struct<VkVideoEncodeH264QpKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        QPI,
        QPP,
        QPB;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        QPI = layout.offsetof(0);
        QPP = layout.offsetof(1);
        QPB = layout.offsetof(2);
    }

    protected VkVideoEncodeH264QpKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH264QpKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264QpKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH264QpKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264QpKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the QP to be used for <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h264-i-pic">I pictures</a>. */
    @NativeType("int32_t")
    public int qpI() { return nqpI(address()); }
    /** the QP to be used for <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h264-p-pic">P pictures</a>. */
    @NativeType("int32_t")
    public int qpP() { return nqpP(address()); }
    /** the QP to be used for <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h264-b-pic">B pictures</a>. */
    @NativeType("int32_t")
    public int qpB() { return nqpB(address()); }

    /** Sets the specified value to the {@link #qpI} field. */
    public VkVideoEncodeH264QpKHR qpI(@NativeType("int32_t") int value) { nqpI(address(), value); return this; }
    /** Sets the specified value to the {@link #qpP} field. */
    public VkVideoEncodeH264QpKHR qpP(@NativeType("int32_t") int value) { nqpP(address(), value); return this; }
    /** Sets the specified value to the {@link #qpB} field. */
    public VkVideoEncodeH264QpKHR qpB(@NativeType("int32_t") int value) { nqpB(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264QpKHR set(
        int qpI,
        int qpP,
        int qpB
    ) {
        qpI(qpI);
        qpP(qpP);
        qpB(qpB);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH264QpKHR set(VkVideoEncodeH264QpKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264QpKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264QpKHR malloc() {
        return new VkVideoEncodeH264QpKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264QpKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264QpKHR calloc() {
        return new VkVideoEncodeH264QpKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264QpKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264QpKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264QpKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264QpKHR} instance for the specified memory address. */
    public static VkVideoEncodeH264QpKHR create(long address) {
        return new VkVideoEncodeH264QpKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264QpKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH264QpKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264QpKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264QpKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264QpKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264QpKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264QpKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264QpKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH264QpKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264QpKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264QpKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264QpKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264QpKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH264QpKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264QpKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264QpKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH264QpKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264QpKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264QpKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264QpKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264QpKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #qpI}. */
    public static int nqpI(long struct) { return memGetInt(struct + VkVideoEncodeH264QpKHR.QPI); }
    /** Unsafe version of {@link #qpP}. */
    public static int nqpP(long struct) { return memGetInt(struct + VkVideoEncodeH264QpKHR.QPP); }
    /** Unsafe version of {@link #qpB}. */
    public static int nqpB(long struct) { return memGetInt(struct + VkVideoEncodeH264QpKHR.QPB); }

    /** Unsafe version of {@link #qpI(int) qpI}. */
    public static void nqpI(long struct, int value) { memPutInt(struct + VkVideoEncodeH264QpKHR.QPI, value); }
    /** Unsafe version of {@link #qpP(int) qpP}. */
    public static void nqpP(long struct, int value) { memPutInt(struct + VkVideoEncodeH264QpKHR.QPP, value); }
    /** Unsafe version of {@link #qpB(int) qpB}. */
    public static void nqpB(long struct, int value) { memPutInt(struct + VkVideoEncodeH264QpKHR.QPB, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264QpKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264QpKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264QpKHR ELEMENT_FACTORY = VkVideoEncodeH264QpKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264QpKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264QpKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH264QpKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH264QpKHR#qpI} field. */
        @NativeType("int32_t")
        public int qpI() { return VkVideoEncodeH264QpKHR.nqpI(address()); }
        /** @return the value of the {@link VkVideoEncodeH264QpKHR#qpP} field. */
        @NativeType("int32_t")
        public int qpP() { return VkVideoEncodeH264QpKHR.nqpP(address()); }
        /** @return the value of the {@link VkVideoEncodeH264QpKHR#qpB} field. */
        @NativeType("int32_t")
        public int qpB() { return VkVideoEncodeH264QpKHR.nqpB(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH264QpKHR#qpI} field. */
        public VkVideoEncodeH264QpKHR.Buffer qpI(@NativeType("int32_t") int value) { VkVideoEncodeH264QpKHR.nqpI(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264QpKHR#qpP} field. */
        public VkVideoEncodeH264QpKHR.Buffer qpP(@NativeType("int32_t") int value) { VkVideoEncodeH264QpKHR.nqpP(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264QpKHR#qpB} field. */
        public VkVideoEncodeH264QpKHR.Buffer qpB(@NativeType("int32_t") int value) { VkVideoEncodeH264QpKHR.nqpB(address(), value); return this; }

    }

}