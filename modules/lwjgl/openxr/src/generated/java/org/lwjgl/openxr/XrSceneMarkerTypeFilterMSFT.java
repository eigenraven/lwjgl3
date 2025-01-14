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
 * The information to filter marker query results.
 * 
 * <h5>Description</h5>
 * 
 * <p>The application <b>can</b> filter the returned scene components to specific marker types by chaining {@link XrSceneMarkerTypeFilterMSFT} to the {@code next} pointer of {@link XrSceneComponentsGetInfoMSFT} when calling {@link MSFTSceneUnderstanding#xrGetSceneComponentsMSFT GetSceneComponentsMSFT}.</p>
 * 
 * <p>When {@link XrSceneMarkerTypeFilterMSFT} is provided to {@link MSFTSceneUnderstanding#xrGetSceneComponentsMSFT GetSceneComponentsMSFT}, the runtime <b>must</b> only return scene components that match the requested types.</p>
 * 
 * <p>The application <b>must</b> provide a non-empty array of unique {@code markerTypes}, i.e. the {@code markerTypeCount} <b>must</b> be positive and the elements in the {@code markerTypes} array <b>must</b> not have duplicated values. Otherwise, the runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} for {@link MSFTSceneUnderstanding#xrGetSceneComponentsMSFT GetSceneComponentsMSFT} function.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneMarker XR_MSFT_scene_marker} extension <b>must</b> be enabled prior to using {@link XrSceneMarkerTypeFilterMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTSceneMarker#XR_TYPE_SCENE_MARKER_TYPE_FILTER_MSFT TYPE_SCENE_MARKER_TYPE_FILTER_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>If {@code markerTypeCount} is not 0, {@code markerTypes} <b>must</b> be a pointer to an array of {@code markerTypeCount} {@code XrSceneMarkerTypeMSFT} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link MSFTSceneUnderstanding#xrGetSceneComponentsMSFT GetSceneComponentsMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSceneMarkerTypeFilterMSFT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint32_t {@link #markerTypeCount};
 *     XrSceneMarkerTypeMSFT * {@link #markerTypes};
 * }</code></pre>
 */
public class XrSceneMarkerTypeFilterMSFT extends Struct<XrSceneMarkerTypeFilterMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MARKERTYPECOUNT,
        MARKERTYPES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        MARKERTYPECOUNT = layout.offsetof(2);
        MARKERTYPES = layout.offsetof(3);
    }

    protected XrSceneMarkerTypeFilterMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSceneMarkerTypeFilterMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrSceneMarkerTypeFilterMSFT(address, container);
    }

    /**
     * Creates a {@code XrSceneMarkerTypeFilterMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneMarkerTypeFilterMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** a {@code uint32_t} indicating the count of elements in the {@code markerTypes} array. */
    @NativeType("uint32_t")
    public int markerTypeCount() { return nmarkerTypeCount(address()); }
    /** an array of {@code XrSceneMarkerTypeMSFT} indicating the types of markers to return. */
    @NativeType("XrSceneMarkerTypeMSFT *")
    public @Nullable IntBuffer markerTypes() { return nmarkerTypes(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSceneMarkerTypeFilterMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSceneMarker#XR_TYPE_SCENE_MARKER_TYPE_FILTER_MSFT TYPE_SCENE_MARKER_TYPE_FILTER_MSFT} value to the {@link #type} field. */
    public XrSceneMarkerTypeFilterMSFT type$Default() { return type(MSFTSceneMarker.XR_TYPE_SCENE_MARKER_TYPE_FILTER_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSceneMarkerTypeFilterMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #markerTypeCount} field. */
    public XrSceneMarkerTypeFilterMSFT markerTypeCount(@NativeType("uint32_t") int value) { nmarkerTypeCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #markerTypes} field. */
    public XrSceneMarkerTypeFilterMSFT markerTypes(@Nullable @NativeType("XrSceneMarkerTypeMSFT *") IntBuffer value) { nmarkerTypes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneMarkerTypeFilterMSFT set(
        int type,
        long next,
        int markerTypeCount,
        @Nullable IntBuffer markerTypes
    ) {
        type(type);
        next(next);
        markerTypeCount(markerTypeCount);
        markerTypes(markerTypes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneMarkerTypeFilterMSFT set(XrSceneMarkerTypeFilterMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneMarkerTypeFilterMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneMarkerTypeFilterMSFT malloc() {
        return new XrSceneMarkerTypeFilterMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSceneMarkerTypeFilterMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneMarkerTypeFilterMSFT calloc() {
        return new XrSceneMarkerTypeFilterMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSceneMarkerTypeFilterMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSceneMarkerTypeFilterMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSceneMarkerTypeFilterMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrSceneMarkerTypeFilterMSFT} instance for the specified memory address. */
    public static XrSceneMarkerTypeFilterMSFT create(long address) {
        return new XrSceneMarkerTypeFilterMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSceneMarkerTypeFilterMSFT createSafe(long address) {
        return address == NULL ? null : new XrSceneMarkerTypeFilterMSFT(address, null);
    }

    /**
     * Returns a new {@link XrSceneMarkerTypeFilterMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMarkerTypeFilterMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneMarkerTypeFilterMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMarkerTypeFilterMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneMarkerTypeFilterMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMarkerTypeFilterMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSceneMarkerTypeFilterMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneMarkerTypeFilterMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSceneMarkerTypeFilterMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSceneMarkerTypeFilterMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneMarkerTypeFilterMSFT malloc(MemoryStack stack) {
        return new XrSceneMarkerTypeFilterMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSceneMarkerTypeFilterMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneMarkerTypeFilterMSFT calloc(MemoryStack stack) {
        return new XrSceneMarkerTypeFilterMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSceneMarkerTypeFilterMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneMarkerTypeFilterMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneMarkerTypeFilterMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneMarkerTypeFilterMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSceneMarkerTypeFilterMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSceneMarkerTypeFilterMSFT.NEXT); }
    /** Unsafe version of {@link #markerTypeCount}. */
    public static int nmarkerTypeCount(long struct) { return memGetInt(struct + XrSceneMarkerTypeFilterMSFT.MARKERTYPECOUNT); }
    /** Unsafe version of {@link #markerTypes() markerTypes}. */
    public static @Nullable IntBuffer nmarkerTypes(long struct) { return memIntBufferSafe(memGetAddress(struct + XrSceneMarkerTypeFilterMSFT.MARKERTYPES), nmarkerTypeCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSceneMarkerTypeFilterMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSceneMarkerTypeFilterMSFT.NEXT, value); }
    /** Sets the specified value to the {@code markerTypeCount} field of the specified {@code struct}. */
    public static void nmarkerTypeCount(long struct, int value) { memPutInt(struct + XrSceneMarkerTypeFilterMSFT.MARKERTYPECOUNT, value); }
    /** Unsafe version of {@link #markerTypes(IntBuffer) markerTypes}. */
    public static void nmarkerTypes(long struct, @Nullable IntBuffer value) { memPutAddress(struct + XrSceneMarkerTypeFilterMSFT.MARKERTYPES, memAddressSafe(value)); if (value != null) { nmarkerTypeCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrSceneMarkerTypeFilterMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneMarkerTypeFilterMSFT, Buffer> implements NativeResource {

        private static final XrSceneMarkerTypeFilterMSFT ELEMENT_FACTORY = XrSceneMarkerTypeFilterMSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneMarkerTypeFilterMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneMarkerTypeFilterMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSceneMarkerTypeFilterMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSceneMarkerTypeFilterMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSceneMarkerTypeFilterMSFT.ntype(address()); }
        /** @return the value of the {@link XrSceneMarkerTypeFilterMSFT#next} field. */
        @NativeType("void const *")
        public long next() { return XrSceneMarkerTypeFilterMSFT.nnext(address()); }
        /** @return the value of the {@link XrSceneMarkerTypeFilterMSFT#markerTypeCount} field. */
        @NativeType("uint32_t")
        public int markerTypeCount() { return XrSceneMarkerTypeFilterMSFT.nmarkerTypeCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link XrSceneMarkerTypeFilterMSFT#markerTypes} field. */
        @NativeType("XrSceneMarkerTypeMSFT *")
        public @Nullable IntBuffer markerTypes() { return XrSceneMarkerTypeFilterMSFT.nmarkerTypes(address()); }

        /** Sets the specified value to the {@link XrSceneMarkerTypeFilterMSFT#type} field. */
        public XrSceneMarkerTypeFilterMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSceneMarkerTypeFilterMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSceneMarker#XR_TYPE_SCENE_MARKER_TYPE_FILTER_MSFT TYPE_SCENE_MARKER_TYPE_FILTER_MSFT} value to the {@link XrSceneMarkerTypeFilterMSFT#type} field. */
        public XrSceneMarkerTypeFilterMSFT.Buffer type$Default() { return type(MSFTSceneMarker.XR_TYPE_SCENE_MARKER_TYPE_FILTER_MSFT); }
        /** Sets the specified value to the {@link XrSceneMarkerTypeFilterMSFT#next} field. */
        public XrSceneMarkerTypeFilterMSFT.Buffer next(@NativeType("void const *") long value) { XrSceneMarkerTypeFilterMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSceneMarkerTypeFilterMSFT#markerTypeCount} field. */
        public XrSceneMarkerTypeFilterMSFT.Buffer markerTypeCount(@NativeType("uint32_t") int value) { XrSceneMarkerTypeFilterMSFT.nmarkerTypeCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link XrSceneMarkerTypeFilterMSFT#markerTypes} field. */
        public XrSceneMarkerTypeFilterMSFT.Buffer markerTypes(@Nullable @NativeType("XrSceneMarkerTypeMSFT *") IntBuffer value) { XrSceneMarkerTypeFilterMSFT.nmarkerTypes(address(), value); return this; }

    }

}