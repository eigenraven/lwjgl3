/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct SDL_PenAxisEvent {
 *     SDL_EventType type;
 *     Uint32 reserved;
 *     Uint64 timestamp;
 *     SDL_WindowID windowID;
 *     SDL_PenID which;
 *     SDL_PenInputFlags pen_state;
 *     float x;
 *     float y;
 *     SDL_PenAxis axis;
 *     float value;
 * }}</pre>
 */
public class SDL_PenAxisEvent extends Struct<SDL_PenAxisEvent> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        RESERVED,
        TIMESTAMP,
        WINDOWID,
        WHICH,
        PEN_STATE,
        X,
        Y,
        AXIS,
        VALUE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WINDOWID = layout.offsetof(3);
        WHICH = layout.offsetof(4);
        PEN_STATE = layout.offsetof(5);
        X = layout.offsetof(6);
        Y = layout.offsetof(7);
        AXIS = layout.offsetof(8);
        VALUE = layout.offsetof(9);
    }

    protected SDL_PenAxisEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_PenAxisEvent create(long address, @Nullable ByteBuffer container) {
        return new SDL_PenAxisEvent(address, container);
    }

    /**
     * Creates a {@code SDL_PenAxisEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_PenAxisEvent(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("SDL_EventType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code reserved} field. */
    @NativeType("Uint32")
    public int reserved() { return nreserved(address()); }
    /** @return the value of the {@code timestamp} field. */
    @NativeType("Uint64")
    public long timestamp() { return ntimestamp(address()); }
    /** @return the value of the {@code windowID} field. */
    @NativeType("SDL_WindowID")
    public int windowID() { return nwindowID(address()); }
    /** @return the value of the {@code which} field. */
    @NativeType("SDL_PenID")
    public int which() { return nwhich(address()); }
    /** @return the value of the {@code pen_state} field. */
    @NativeType("SDL_PenInputFlags")
    public int pen_state() { return npen_state(address()); }
    /** @return the value of the {@code x} field. */
    public float x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    public float y() { return ny(address()); }
    /** @return the value of the {@code axis} field. */
    @NativeType("SDL_PenAxis")
    public int axis() { return naxis(address()); }
    /** @return the value of the {@code value} field. */
    public float value() { return nvalue(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_PenAxisEvent type(@NativeType("SDL_EventType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public SDL_PenAxisEvent reserved(@NativeType("Uint32") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public SDL_PenAxisEvent timestamp(@NativeType("Uint64") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code windowID} field. */
    public SDL_PenAxisEvent windowID(@NativeType("SDL_WindowID") int value) { nwindowID(address(), value); return this; }
    /** Sets the specified value to the {@code which} field. */
    public SDL_PenAxisEvent which(@NativeType("SDL_PenID") int value) { nwhich(address(), value); return this; }
    /** Sets the specified value to the {@code pen_state} field. */
    public SDL_PenAxisEvent pen_state(@NativeType("SDL_PenInputFlags") int value) { npen_state(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public SDL_PenAxisEvent x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public SDL_PenAxisEvent y(float value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code axis} field. */
    public SDL_PenAxisEvent axis(@NativeType("SDL_PenAxis") int value) { naxis(address(), value); return this; }
    /** Sets the specified value to the {@code value} field. */
    public SDL_PenAxisEvent value(float value) { nvalue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_PenAxisEvent set(
        int type,
        int reserved,
        long timestamp,
        int windowID,
        int which,
        int pen_state,
        float x,
        float y,
        int axis,
        float value
    ) {
        type(type);
        reserved(reserved);
        timestamp(timestamp);
        windowID(windowID);
        which(which);
        pen_state(pen_state);
        x(x);
        y(y);
        axis(axis);
        value(value);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_PenAxisEvent set(SDL_PenAxisEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_PenAxisEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_PenAxisEvent malloc() {
        return new SDL_PenAxisEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_PenAxisEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_PenAxisEvent calloc() {
        return new SDL_PenAxisEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_PenAxisEvent} instance allocated with {@link BufferUtils}. */
    public static SDL_PenAxisEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_PenAxisEvent(memAddress(container), container);
    }

    /** Returns a new {@code SDL_PenAxisEvent} instance for the specified memory address. */
    public static SDL_PenAxisEvent create(long address) {
        return new SDL_PenAxisEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_PenAxisEvent createSafe(long address) {
        return address == NULL ? null : new SDL_PenAxisEvent(address, null);
    }

    /**
     * Returns a new {@link SDL_PenAxisEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_PenAxisEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_PenAxisEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_PenAxisEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_PenAxisEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_PenAxisEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_PenAxisEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_PenAxisEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_PenAxisEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_PenAxisEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_PenAxisEvent malloc(MemoryStack stack) {
        return new SDL_PenAxisEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_PenAxisEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_PenAxisEvent calloc(MemoryStack stack) {
        return new SDL_PenAxisEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_PenAxisEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_PenAxisEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_PenAxisEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_PenAxisEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_PenAxisEvent.TYPE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + SDL_PenAxisEvent.RESERVED); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + SDL_PenAxisEvent.TIMESTAMP); }
    /** Unsafe version of {@link #windowID}. */
    public static int nwindowID(long struct) { return memGetInt(struct + SDL_PenAxisEvent.WINDOWID); }
    /** Unsafe version of {@link #which}. */
    public static int nwhich(long struct) { return memGetInt(struct + SDL_PenAxisEvent.WHICH); }
    /** Unsafe version of {@link #pen_state}. */
    public static int npen_state(long struct) { return memGetInt(struct + SDL_PenAxisEvent.PEN_STATE); }
    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + SDL_PenAxisEvent.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + SDL_PenAxisEvent.Y); }
    /** Unsafe version of {@link #axis}. */
    public static int naxis(long struct) { return memGetInt(struct + SDL_PenAxisEvent.AXIS); }
    /** Unsafe version of {@link #value}. */
    public static float nvalue(long struct) { return memGetFloat(struct + SDL_PenAxisEvent.VALUE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_PenAxisEvent.TYPE, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + SDL_PenAxisEvent.RESERVED, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + SDL_PenAxisEvent.TIMESTAMP, value); }
    /** Unsafe version of {@link #windowID(int) windowID}. */
    public static void nwindowID(long struct, int value) { memPutInt(struct + SDL_PenAxisEvent.WINDOWID, value); }
    /** Unsafe version of {@link #which(int) which}. */
    public static void nwhich(long struct, int value) { memPutInt(struct + SDL_PenAxisEvent.WHICH, value); }
    /** Unsafe version of {@link #pen_state(int) pen_state}. */
    public static void npen_state(long struct, int value) { memPutInt(struct + SDL_PenAxisEvent.PEN_STATE, value); }
    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { memPutFloat(struct + SDL_PenAxisEvent.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { memPutFloat(struct + SDL_PenAxisEvent.Y, value); }
    /** Unsafe version of {@link #axis(int) axis}. */
    public static void naxis(long struct, int value) { memPutInt(struct + SDL_PenAxisEvent.AXIS, value); }
    /** Unsafe version of {@link #value(float) value}. */
    public static void nvalue(long struct, float value) { memPutFloat(struct + SDL_PenAxisEvent.VALUE, value); }

    // -----------------------------------

    /** An array of {@link SDL_PenAxisEvent} structs. */
    public static class Buffer extends StructBuffer<SDL_PenAxisEvent, Buffer> implements NativeResource {

        private static final SDL_PenAxisEvent ELEMENT_FACTORY = SDL_PenAxisEvent.create(-1L);

        /**
         * Creates a new {@code SDL_PenAxisEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_PenAxisEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_PenAxisEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_EventType")
        public int type() { return SDL_PenAxisEvent.ntype(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("Uint32")
        public int reserved() { return SDL_PenAxisEvent.nreserved(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("Uint64")
        public long timestamp() { return SDL_PenAxisEvent.ntimestamp(address()); }
        /** @return the value of the {@code windowID} field. */
        @NativeType("SDL_WindowID")
        public int windowID() { return SDL_PenAxisEvent.nwindowID(address()); }
        /** @return the value of the {@code which} field. */
        @NativeType("SDL_PenID")
        public int which() { return SDL_PenAxisEvent.nwhich(address()); }
        /** @return the value of the {@code pen_state} field. */
        @NativeType("SDL_PenInputFlags")
        public int pen_state() { return SDL_PenAxisEvent.npen_state(address()); }
        /** @return the value of the {@code x} field. */
        public float x() { return SDL_PenAxisEvent.nx(address()); }
        /** @return the value of the {@code y} field. */
        public float y() { return SDL_PenAxisEvent.ny(address()); }
        /** @return the value of the {@code axis} field. */
        @NativeType("SDL_PenAxis")
        public int axis() { return SDL_PenAxisEvent.naxis(address()); }
        /** @return the value of the {@code value} field. */
        public float value() { return SDL_PenAxisEvent.nvalue(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_PenAxisEvent.Buffer type(@NativeType("SDL_EventType") int value) { SDL_PenAxisEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public SDL_PenAxisEvent.Buffer reserved(@NativeType("Uint32") int value) { SDL_PenAxisEvent.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public SDL_PenAxisEvent.Buffer timestamp(@NativeType("Uint64") long value) { SDL_PenAxisEvent.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code windowID} field. */
        public SDL_PenAxisEvent.Buffer windowID(@NativeType("SDL_WindowID") int value) { SDL_PenAxisEvent.nwindowID(address(), value); return this; }
        /** Sets the specified value to the {@code which} field. */
        public SDL_PenAxisEvent.Buffer which(@NativeType("SDL_PenID") int value) { SDL_PenAxisEvent.nwhich(address(), value); return this; }
        /** Sets the specified value to the {@code pen_state} field. */
        public SDL_PenAxisEvent.Buffer pen_state(@NativeType("SDL_PenInputFlags") int value) { SDL_PenAxisEvent.npen_state(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public SDL_PenAxisEvent.Buffer x(float value) { SDL_PenAxisEvent.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public SDL_PenAxisEvent.Buffer y(float value) { SDL_PenAxisEvent.ny(address(), value); return this; }
        /** Sets the specified value to the {@code axis} field. */
        public SDL_PenAxisEvent.Buffer axis(@NativeType("SDL_PenAxis") int value) { SDL_PenAxisEvent.naxis(address(), value); return this; }
        /** Sets the specified value to the {@code value} field. */
        public SDL_PenAxisEvent.Buffer value(float value) { SDL_PenAxisEvent.nvalue(address(), value); return this; }

    }

}