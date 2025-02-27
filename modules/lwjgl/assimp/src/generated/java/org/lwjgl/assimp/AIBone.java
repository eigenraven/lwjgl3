/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct aiBone {
 *     {@link AIString struct aiString} mName;
 *     unsigned int mNumWeights;
 *     {@link AINode struct aiNode} * mArmature;
 *     {@link AINode struct aiNode} * mNode;
 *     {@link AIVertexWeight struct aiVertexWeight} * mWeights;
 *     {@link AIMatrix4x4 struct aiMatrix4x4} mOffsetMatrix;
 * }}</pre>
 */
@NativeType("struct aiBone")
public class AIBone extends Struct<AIBone> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MNAME,
        MNUMWEIGHTS,
        MARMATURE,
        MNODE,
        MWEIGHTS,
        MOFFSETMATRIX;

    static {
        Layout layout = __struct(
            __member(AIString.SIZEOF, AIString.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(AIMatrix4x4.SIZEOF, AIMatrix4x4.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MNAME = layout.offsetof(0);
        MNUMWEIGHTS = layout.offsetof(1);
        MARMATURE = layout.offsetof(2);
        MNODE = layout.offsetof(3);
        MWEIGHTS = layout.offsetof(4);
        MOFFSETMATRIX = layout.offsetof(5);
    }

    protected AIBone(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected AIBone create(long address, @Nullable ByteBuffer container) {
        return new AIBone(address, container);
    }

    /**
     * Creates a {@code AIBone} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIBone(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link AIString} view of the {@code mName} field. */
    @NativeType("struct aiString")
    public AIString mName() { return nmName(address()); }
    /** @return the value of the {@code mNumWeights} field. */
    @NativeType("unsigned int")
    public int mNumWeights() { return nmNumWeights(address()); }
    /** @return a {@link AINode} view of the struct pointed to by the {@code mArmature} field. */
    @NativeType("struct aiNode *")
    public AINode mArmature() { return nmArmature(address()); }
    /** @return a {@link AINode} view of the struct pointed to by the {@code mNode} field. */
    @NativeType("struct aiNode *")
    public AINode mNode() { return nmNode(address()); }
    /** @return a {@link AIVertexWeight.Buffer} view of the struct array pointed to by the {@code mWeights} field. */
    @NativeType("struct aiVertexWeight *")
    public AIVertexWeight.Buffer mWeights() { return nmWeights(address()); }
    /** @return a {@link AIMatrix4x4} view of the {@code mOffsetMatrix} field. */
    @NativeType("struct aiMatrix4x4")
    public AIMatrix4x4 mOffsetMatrix() { return nmOffsetMatrix(address()); }

    /** Copies the specified {@link AIString} to the {@code mName} field. */
    public AIBone mName(@NativeType("struct aiString") AIString value) { nmName(address(), value); return this; }
    /** Passes the {@code mName} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AIBone mName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mName()); return this; }
    /** Sets the address of the specified {@link AINode} to the {@code mArmature} field. */
    public AIBone mArmature(@NativeType("struct aiNode *") AINode value) { nmArmature(address(), value); return this; }
    /** Sets the address of the specified {@link AINode} to the {@code mNode} field. */
    public AIBone mNode(@NativeType("struct aiNode *") AINode value) { nmNode(address(), value); return this; }
    /** Sets the address of the specified {@link AIVertexWeight.Buffer} to the {@code mWeights} field. */
    public AIBone mWeights(@NativeType("struct aiVertexWeight *") AIVertexWeight.Buffer value) { nmWeights(address(), value); return this; }
    /** Copies the specified {@link AIMatrix4x4} to the {@code mOffsetMatrix} field. */
    public AIBone mOffsetMatrix(@NativeType("struct aiMatrix4x4") AIMatrix4x4 value) { nmOffsetMatrix(address(), value); return this; }
    /** Passes the {@code mOffsetMatrix} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AIBone mOffsetMatrix(java.util.function.Consumer<AIMatrix4x4> consumer) { consumer.accept(mOffsetMatrix()); return this; }

    /** Initializes this struct with the specified values. */
    public AIBone set(
        AIString mName,
        AINode mArmature,
        AINode mNode,
        AIVertexWeight.Buffer mWeights,
        AIMatrix4x4 mOffsetMatrix
    ) {
        mName(mName);
        mArmature(mArmature);
        mNode(mNode);
        mWeights(mWeights);
        mOffsetMatrix(mOffsetMatrix);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIBone set(AIBone src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIBone} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIBone malloc() {
        return new AIBone(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code AIBone} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIBone calloc() {
        return new AIBone(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code AIBone} instance allocated with {@link BufferUtils}. */
    public static AIBone create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new AIBone(memAddress(container), container);
    }

    /** Returns a new {@code AIBone} instance for the specified memory address. */
    public static AIBone create(long address) {
        return new AIBone(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable AIBone createSafe(long address) {
        return address == NULL ? null : new AIBone(address, null);
    }

    /**
     * Returns a new {@link AIBone.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIBone.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIBone.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIBone.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIBone.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIBone.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link AIBone.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIBone.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static AIBone.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIBone mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIBone callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIBone mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIBone callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIBone.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIBone.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIBone.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIBone.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIBone} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIBone malloc(MemoryStack stack) {
        return new AIBone(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code AIBone} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIBone calloc(MemoryStack stack) {
        return new AIBone(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link AIBone.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIBone.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIBone.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIBone.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mName}. */
    public static AIString nmName(long struct) { return AIString.create(struct + AIBone.MNAME); }
    /** Unsafe version of {@link #mNumWeights}. */
    public static int nmNumWeights(long struct) { return memGetInt(struct + AIBone.MNUMWEIGHTS); }
    /** Unsafe version of {@link #mArmature}. */
    public static AINode nmArmature(long struct) { return AINode.create(memGetAddress(struct + AIBone.MARMATURE)); }
    /** Unsafe version of {@link #mNode}. */
    public static AINode nmNode(long struct) { return AINode.create(memGetAddress(struct + AIBone.MNODE)); }
    /** Unsafe version of {@link #mWeights}. */
    public static AIVertexWeight.Buffer nmWeights(long struct) { return AIVertexWeight.create(memGetAddress(struct + AIBone.MWEIGHTS), nmNumWeights(struct)); }
    /** Unsafe version of {@link #mOffsetMatrix}. */
    public static AIMatrix4x4 nmOffsetMatrix(long struct) { return AIMatrix4x4.create(struct + AIBone.MOFFSETMATRIX); }

    /** Unsafe version of {@link #mName(AIString) mName}. */
    public static void nmName(long struct, AIString value) { memCopy(value.address(), struct + AIBone.MNAME, AIString.SIZEOF); }
    /** Sets the specified value to the {@code mNumWeights} field of the specified {@code struct}. */
    public static void nmNumWeights(long struct, int value) { memPutInt(struct + AIBone.MNUMWEIGHTS, value); }
    /** Unsafe version of {@link #mArmature(AINode) mArmature}. */
    public static void nmArmature(long struct, AINode value) { memPutAddress(struct + AIBone.MARMATURE, value.address()); }
    /** Unsafe version of {@link #mNode(AINode) mNode}. */
    public static void nmNode(long struct, AINode value) { memPutAddress(struct + AIBone.MNODE, value.address()); }
    /** Unsafe version of {@link #mWeights(AIVertexWeight.Buffer) mWeights}. */
    public static void nmWeights(long struct, AIVertexWeight.Buffer value) { memPutAddress(struct + AIBone.MWEIGHTS, value.address()); nmNumWeights(struct, value.remaining()); }
    /** Unsafe version of {@link #mOffsetMatrix(AIMatrix4x4) mOffsetMatrix}. */
    public static void nmOffsetMatrix(long struct, AIMatrix4x4 value) { memCopy(value.address(), struct + AIBone.MOFFSETMATRIX, AIMatrix4x4.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long mArmature = memGetAddress(struct + AIBone.MARMATURE);
        check(mArmature);
        AINode.validate(mArmature);
        long mNode = memGetAddress(struct + AIBone.MNODE);
        check(mNode);
        AINode.validate(mNode);
        check(memGetAddress(struct + AIBone.MWEIGHTS));
    }

    // -----------------------------------

    /** An array of {@link AIBone} structs. */
    public static class Buffer extends StructBuffer<AIBone, Buffer> implements NativeResource {

        private static final AIBone ELEMENT_FACTORY = AIBone.create(-1L);

        /**
         * Creates a new {@code AIBone.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIBone#SIZEOF}, and its mark will be undefined.</p>
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
        protected AIBone getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link AIString} view of the {@code mName} field. */
        @NativeType("struct aiString")
        public AIString mName() { return AIBone.nmName(address()); }
        /** @return the value of the {@code mNumWeights} field. */
        @NativeType("unsigned int")
        public int mNumWeights() { return AIBone.nmNumWeights(address()); }
        /** @return a {@link AINode} view of the struct pointed to by the {@code mArmature} field. */
        @NativeType("struct aiNode *")
        public AINode mArmature() { return AIBone.nmArmature(address()); }
        /** @return a {@link AINode} view of the struct pointed to by the {@code mNode} field. */
        @NativeType("struct aiNode *")
        public AINode mNode() { return AIBone.nmNode(address()); }
        /** @return a {@link AIVertexWeight.Buffer} view of the struct array pointed to by the {@code mWeights} field. */
        @NativeType("struct aiVertexWeight *")
        public AIVertexWeight.Buffer mWeights() { return AIBone.nmWeights(address()); }
        /** @return a {@link AIMatrix4x4} view of the {@code mOffsetMatrix} field. */
        @NativeType("struct aiMatrix4x4")
        public AIMatrix4x4 mOffsetMatrix() { return AIBone.nmOffsetMatrix(address()); }

        /** Copies the specified {@link AIString} to the {@code mName} field. */
        public AIBone.Buffer mName(@NativeType("struct aiString") AIString value) { AIBone.nmName(address(), value); return this; }
        /** Passes the {@code mName} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AIBone.Buffer mName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mName()); return this; }
        /** Sets the address of the specified {@link AINode} to the {@code mArmature} field. */
        public AIBone.Buffer mArmature(@NativeType("struct aiNode *") AINode value) { AIBone.nmArmature(address(), value); return this; }
        /** Sets the address of the specified {@link AINode} to the {@code mNode} field. */
        public AIBone.Buffer mNode(@NativeType("struct aiNode *") AINode value) { AIBone.nmNode(address(), value); return this; }
        /** Sets the address of the specified {@link AIVertexWeight.Buffer} to the {@code mWeights} field. */
        public AIBone.Buffer mWeights(@NativeType("struct aiVertexWeight *") AIVertexWeight.Buffer value) { AIBone.nmWeights(address(), value); return this; }
        /** Copies the specified {@link AIMatrix4x4} to the {@code mOffsetMatrix} field. */
        public AIBone.Buffer mOffsetMatrix(@NativeType("struct aiMatrix4x4") AIMatrix4x4 value) { AIBone.nmOffsetMatrix(address(), value); return this; }
        /** Passes the {@code mOffsetMatrix} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AIBone.Buffer mOffsetMatrix(java.util.function.Consumer<AIMatrix4x4> consumer) { consumer.accept(mOffsetMatrix()); return this; }

    }

}