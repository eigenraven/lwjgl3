/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_workgroup_memory_explicit_layout = "KHRWorkgroupMemoryExplicitLayout".nativeClassVK("KHR_workgroup_memory_explicit_layout", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension adds Vulkan support for the <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_workgroup_memory_explicit_layout.html">{@code SPV_KHR_workgroup_memory_explicit_layout}</a> SPIR-V extension, which allows shaders to explicitly define the layout of {@code Workgroup} storage class memory and create aliases between variables from that storage class in a compute shader.

        The aliasing feature allows different “{@code views}” on the same data, so the shader can bulk copy data from another storage class using one type (e.g. an array of large vectors), and then use the data with a more specific type. It also enables reducing the amount of workgroup memory consumed by allowing the shader to alias data whose lifetimes do not overlap.

        The explicit layout support and some form of aliasing is also required for layering OpenCL on top of Vulkan.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_workgroup_memory_explicit_layout}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>337</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#versions-1.1">Version 1.1</a></dd>

            <dt><b>SPIR-V Dependencies</b></dt>
            <dd><ul>
                <li><a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_workgroup_memory_explicit_layout.html">SPV_KHR_workgroup_memory_explicit_layout</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Caio Marcelo de Oliveira Filho <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_workgroup_memory_explicit_layout]%20@cmarcelo%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_workgroup_memory_explicit_layout%20extension*">cmarcelo</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2020-06-01</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension provides API support for <a href="https://github.com/KhronosGroup/GLSL/blob/main/extensions/ext/GL_EXT_shared_memory_block.txt">{@code GL_EXT_shared_memory_block}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Caio Marcelo de Oliveira Filho, Intel</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Graeme Leese, Broadcom</li>
                <li>Faith Ekstrand, Intel</li>
                <li>Daniel Koch, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_EXTENSION_NAME".."VK_KHR_workgroup_memory_explicit_layout"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_FEATURES_KHR".."1000336000"
    )
}