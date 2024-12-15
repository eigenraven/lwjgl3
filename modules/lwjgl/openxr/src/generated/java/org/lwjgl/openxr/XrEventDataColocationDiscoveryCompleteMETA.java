/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * discovery complete event.
 * 
 * <h5>Description</h5>
 * 
 * <p>The runtime <b>must</b> queue exactly one {@link XrEventDataColocationDiscoveryCompleteMETA} event whenever an active colocation discovery is stopped. This includes if the colocation discovery is stopped due to an application calling {@link METAColocationDiscovery#xrStopColocationDiscoveryMETA StopColocationDiscoveryMETA}, or the runtime needs to stop the colocation discovery for any reason. When the {@code XrSession} is destroyed, the runtime <b>must</b> stop all active advertisements started from the same {@code XrSession}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAColocationDiscovery XR_META_colocation_discovery} extension <b>must</b> be enabled prior to using {@link XrEventDataColocationDiscoveryCompleteMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAColocationDiscovery#XR_TYPE_EVENT_DATA_COLOCATION_DISCOVERY_COMPLETE_META TYPE_EVENT_DATA_COLOCATION_DISCOVERY_COMPLETE_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code result} <b>must</b> be a valid {@code XrResult} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link METAColocationDiscovery#xrStartColocationDiscoveryMETA StartColocationDiscoveryMETA}, {@link METAColocationDiscovery#xrStopColocationDiscoveryMETA StopColocationDiscoveryMETA}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataColocationDiscoveryCompleteMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrAsyncRequestIdFB {@link #discoveryRequestId};
 *     XrResult {@link #result};
 * }</code></pre>
 */
public class XrEventDataColocationDiscoveryCompleteMETA extends Struct<XrEventDataColocationDiscoveryCompleteMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        DISCOVERYREQUESTID,
        RESULT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        DISCOVERYREQUESTID = layout.offsetof(2);
        RESULT = layout.offsetof(3);
    }

    protected XrEventDataColocationDiscoveryCompleteMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataColocationDiscoveryCompleteMETA create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataColocationDiscoveryCompleteMETA(address, container);
    }

    /**
     * Creates a {@code XrEventDataColocationDiscoveryCompleteMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataColocationDiscoveryCompleteMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** an {@code XrAsyncRequestIdFB} specifying the original start discovery async request id. The runtime <b>must</b> return a value which matches a previously returned {@code discoveryRequestId} value from an {@link METAColocationDiscovery#xrStartColocationDiscoveryMETA StartColocationDiscoveryMETA} request. */
    @NativeType("XrAsyncRequestIdFB")
    public long discoveryRequestId() { return ndiscoveryRequestId(address()); }
    /** an {@code XrResult} representing the discovery process result. The valid {@code result} values are: {@link XR10#XR_SUCCESS SUCCESS}, {@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}, and {@link METAColocationDiscovery#XR_ERROR_COLOCATION_DISCOVERY_NO_DISCOVERY_METHOD_META ERROR_COLOCATION_DISCOVERY_NO_DISCOVERY_METHOD_META}. */
    @NativeType("XrResult")
    public int result() { return nresult(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEventDataColocationDiscoveryCompleteMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAColocationDiscovery#XR_TYPE_EVENT_DATA_COLOCATION_DISCOVERY_COMPLETE_META TYPE_EVENT_DATA_COLOCATION_DISCOVERY_COMPLETE_META} value to the {@link #type} field. */
    public XrEventDataColocationDiscoveryCompleteMETA type$Default() { return type(METAColocationDiscovery.XR_TYPE_EVENT_DATA_COLOCATION_DISCOVERY_COMPLETE_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEventDataColocationDiscoveryCompleteMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #discoveryRequestId} field. */
    public XrEventDataColocationDiscoveryCompleteMETA discoveryRequestId(@NativeType("XrAsyncRequestIdFB") long value) { ndiscoveryRequestId(address(), value); return this; }
    /** Sets the specified value to the {@link #result} field. */
    public XrEventDataColocationDiscoveryCompleteMETA result(@NativeType("XrResult") int value) { nresult(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataColocationDiscoveryCompleteMETA set(
        int type,
        long next,
        long discoveryRequestId,
        int result
    ) {
        type(type);
        next(next);
        discoveryRequestId(discoveryRequestId);
        result(result);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEventDataColocationDiscoveryCompleteMETA set(XrEventDataColocationDiscoveryCompleteMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataColocationDiscoveryCompleteMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataColocationDiscoveryCompleteMETA malloc() {
        return new XrEventDataColocationDiscoveryCompleteMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataColocationDiscoveryCompleteMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataColocationDiscoveryCompleteMETA calloc() {
        return new XrEventDataColocationDiscoveryCompleteMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataColocationDiscoveryCompleteMETA} instance allocated with {@link BufferUtils}. */
    public static XrEventDataColocationDiscoveryCompleteMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataColocationDiscoveryCompleteMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataColocationDiscoveryCompleteMETA} instance for the specified memory address. */
    public static XrEventDataColocationDiscoveryCompleteMETA create(long address) {
        return new XrEventDataColocationDiscoveryCompleteMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataColocationDiscoveryCompleteMETA createSafe(long address) {
        return address == NULL ? null : new XrEventDataColocationDiscoveryCompleteMETA(address, null);
    }

    /**
     * Returns a new {@link XrEventDataColocationDiscoveryCompleteMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataColocationDiscoveryCompleteMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataColocationDiscoveryCompleteMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataColocationDiscoveryCompleteMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataColocationDiscoveryCompleteMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataColocationDiscoveryCompleteMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataColocationDiscoveryCompleteMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataColocationDiscoveryCompleteMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataColocationDiscoveryCompleteMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrEventDataColocationDiscoveryCompleteMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataColocationDiscoveryCompleteMETA malloc(MemoryStack stack) {
        return new XrEventDataColocationDiscoveryCompleteMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataColocationDiscoveryCompleteMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataColocationDiscoveryCompleteMETA calloc(MemoryStack stack) {
        return new XrEventDataColocationDiscoveryCompleteMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataColocationDiscoveryCompleteMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataColocationDiscoveryCompleteMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataColocationDiscoveryCompleteMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataColocationDiscoveryCompleteMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataColocationDiscoveryCompleteMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataColocationDiscoveryCompleteMETA.NEXT); }
    /** Unsafe version of {@link #discoveryRequestId}. */
    public static long ndiscoveryRequestId(long struct) { return memGetLong(struct + XrEventDataColocationDiscoveryCompleteMETA.DISCOVERYREQUESTID); }
    /** Unsafe version of {@link #result}. */
    public static int nresult(long struct) { return memGetInt(struct + XrEventDataColocationDiscoveryCompleteMETA.RESULT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataColocationDiscoveryCompleteMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataColocationDiscoveryCompleteMETA.NEXT, value); }
    /** Unsafe version of {@link #discoveryRequestId(long) discoveryRequestId}. */
    public static void ndiscoveryRequestId(long struct, long value) { memPutLong(struct + XrEventDataColocationDiscoveryCompleteMETA.DISCOVERYREQUESTID, value); }
    /** Unsafe version of {@link #result(int) result}. */
    public static void nresult(long struct, int value) { memPutInt(struct + XrEventDataColocationDiscoveryCompleteMETA.RESULT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataColocationDiscoveryCompleteMETA} structs. */
    public static class Buffer extends StructBuffer<XrEventDataColocationDiscoveryCompleteMETA, Buffer> implements NativeResource {

        private static final XrEventDataColocationDiscoveryCompleteMETA ELEMENT_FACTORY = XrEventDataColocationDiscoveryCompleteMETA.create(-1L);

        /**
         * Creates a new {@code XrEventDataColocationDiscoveryCompleteMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataColocationDiscoveryCompleteMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataColocationDiscoveryCompleteMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEventDataColocationDiscoveryCompleteMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataColocationDiscoveryCompleteMETA.ntype(address()); }
        /** @return the value of the {@link XrEventDataColocationDiscoveryCompleteMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataColocationDiscoveryCompleteMETA.nnext(address()); }
        /** @return the value of the {@link XrEventDataColocationDiscoveryCompleteMETA#discoveryRequestId} field. */
        @NativeType("XrAsyncRequestIdFB")
        public long discoveryRequestId() { return XrEventDataColocationDiscoveryCompleteMETA.ndiscoveryRequestId(address()); }
        /** @return the value of the {@link XrEventDataColocationDiscoveryCompleteMETA#result} field. */
        @NativeType("XrResult")
        public int result() { return XrEventDataColocationDiscoveryCompleteMETA.nresult(address()); }

        /** Sets the specified value to the {@link XrEventDataColocationDiscoveryCompleteMETA#type} field. */
        public XrEventDataColocationDiscoveryCompleteMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataColocationDiscoveryCompleteMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAColocationDiscovery#XR_TYPE_EVENT_DATA_COLOCATION_DISCOVERY_COMPLETE_META TYPE_EVENT_DATA_COLOCATION_DISCOVERY_COMPLETE_META} value to the {@link XrEventDataColocationDiscoveryCompleteMETA#type} field. */
        public XrEventDataColocationDiscoveryCompleteMETA.Buffer type$Default() { return type(METAColocationDiscovery.XR_TYPE_EVENT_DATA_COLOCATION_DISCOVERY_COMPLETE_META); }
        /** Sets the specified value to the {@link XrEventDataColocationDiscoveryCompleteMETA#next} field. */
        public XrEventDataColocationDiscoveryCompleteMETA.Buffer next(@NativeType("void const *") long value) { XrEventDataColocationDiscoveryCompleteMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataColocationDiscoveryCompleteMETA#discoveryRequestId} field. */
        public XrEventDataColocationDiscoveryCompleteMETA.Buffer discoveryRequestId(@NativeType("XrAsyncRequestIdFB") long value) { XrEventDataColocationDiscoveryCompleteMETA.ndiscoveryRequestId(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataColocationDiscoveryCompleteMETA#result} field. */
        public XrEventDataColocationDiscoveryCompleteMETA.Buffer result(@NativeType("XrResult") int value) { XrEventDataColocationDiscoveryCompleteMETA.nresult(address(), value); return this; }

    }

}