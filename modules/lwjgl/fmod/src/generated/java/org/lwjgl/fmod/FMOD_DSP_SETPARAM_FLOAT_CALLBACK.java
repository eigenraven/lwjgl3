/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * FMOD_RESULT (*{@link #invoke}) (
 *     struct FMOD_DSP_STATE *dsp_state,
 *     int index,
 *     float value
 * )</code></pre>
 */
public abstract class FMOD_DSP_SETPARAM_FLOAT_CALLBACK extends Callback implements FMOD_DSP_SETPARAM_FLOAT_CALLBACKI {

    /**
     * Creates a {@code FMOD_DSP_SETPARAM_FLOAT_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_DSP_SETPARAM_FLOAT_CALLBACK}
     */
    public static FMOD_DSP_SETPARAM_FLOAT_CALLBACK create(long functionPointer) {
        FMOD_DSP_SETPARAM_FLOAT_CALLBACKI instance = Callback.get(functionPointer);
        return instance instanceof FMOD_DSP_SETPARAM_FLOAT_CALLBACK
            ? (FMOD_DSP_SETPARAM_FLOAT_CALLBACK)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_DSP_SETPARAM_FLOAT_CALLBACK createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FMOD_DSP_SETPARAM_FLOAT_CALLBACK} instance that delegates to the specified {@code FMOD_DSP_SETPARAM_FLOAT_CALLBACKI} instance. */
    public static FMOD_DSP_SETPARAM_FLOAT_CALLBACK create(FMOD_DSP_SETPARAM_FLOAT_CALLBACKI instance) {
        return instance instanceof FMOD_DSP_SETPARAM_FLOAT_CALLBACK
            ? (FMOD_DSP_SETPARAM_FLOAT_CALLBACK)instance
            : new Container(instance.address(), instance);
    }

    protected FMOD_DSP_SETPARAM_FLOAT_CALLBACK() {
        super(CIF);
    }

    FMOD_DSP_SETPARAM_FLOAT_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FMOD_DSP_SETPARAM_FLOAT_CALLBACK {

        private final FMOD_DSP_SETPARAM_FLOAT_CALLBACKI delegate;

        Container(long functionPointer, FMOD_DSP_SETPARAM_FLOAT_CALLBACKI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long dsp_state, int index, float value) {
            return delegate.invoke(dsp_state, index, value);
        }

    }

}