/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension enables applications to use multisampled rendering with a depth/stencil sample count that is larger than the color sample count. Having a depth/stencil sample count larger than the color sample count allows maintaining geometry and coverage information at a higher sample rate than color information. All samples are depth/stencil tested, but only the first color sample count number of samples get a corresponding color output.
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_AMD_mixed_attachment_samples}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>137</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>API Interactions</b></dt>
 * <dd><ul>
 * <li>Interacts with VK_VERSION_1_3</li>
 * <li>Interacts with VK_KHR_dynamic_rendering</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Matthaeus G. Chajdas <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_AMD_mixed_attachment_samples]%20@anteru%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_AMD_mixed_attachment_samples%20extension*">anteru</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-07-24</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Mais Alnasser, AMD</li>
 * <li>Matthaeus G. Chajdas, AMD</li>
 * <li>Maciej Jesionowski, AMD</li>
 * <li>Daniel Rakos, AMD</li>
 * </ul></dd>
 * </dl>
 */
public final class AMDMixedAttachmentSamples {

    /** The extension specification version. */
    public static final int VK_AMD_MIXED_ATTACHMENT_SAMPLES_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_AMD_MIXED_ATTACHMENT_SAMPLES_EXTENSION_NAME = "VK_AMD_mixed_attachment_samples";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD = 1000044008;

    private AMDMixedAttachmentSamples() {}

}