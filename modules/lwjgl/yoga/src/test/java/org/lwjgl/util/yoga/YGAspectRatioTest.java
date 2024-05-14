/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 *
 * @generated SignedSource<<474f52d92a8fc32c66d5b5c1cc446124>>
 * generated by gentest/gentest-driver.ts from gentest/fixtures/YGAspectRatioTest.html
 */

package org.lwjgl.util.yoga;

import org.testng.annotations.*;

import static org.lwjgl.util.yoga.YogaNode.*;
import static org.testng.AssertJUnit.assertEquals;

public class YGAspectRatioTest {
    @Test
    @Ignore
    public void test_aspect_ratio_does_not_stretch_cross_axis_dim() {
        YogaConfig config = YogaConfigFactory.create();

        YogaNode root = createNode(config);
        root.setPositionType(YogaPositionType.ABSOLUTE);
        root.setWidth(300f);
        root.setHeight(300f);

        YogaNode root_child0 = createNode(config);
        root_child0.setOverflow(YogaOverflow.SCROLL);
        root_child0.setFlexGrow(1f);
        root_child0.setFlexShrink(1f);
        root_child0.setFlexBasisPercent(0f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child0_child0 = createNode(config);
        root_child0_child0.setFlexDirection(YogaFlexDirection.ROW);
        root_child0.addChildAt(root_child0_child0, 0);

        YogaNode root_child0_child0_child0 = createNode(config);
        root_child0_child0_child0.setFlexGrow(2f);
        root_child0_child0_child0.setFlexShrink(1f);
        root_child0_child0_child0.setFlexBasisPercent(0f);
        root_child0_child0_child0.setAspectRatio(1 / 1f);
        root_child0_child0.addChildAt(root_child0_child0_child0, 0);

        YogaNode root_child0_child0_child1 = createNode(config);
        root_child0_child0_child1.setWidth(5f);
        root_child0_child0.addChildAt(root_child0_child0_child1, 1);

        YogaNode root_child0_child0_child2 = createNode(config);
        root_child0_child0_child2.setFlexGrow(1f);
        root_child0_child0_child2.setFlexShrink(1f);
        root_child0_child0_child2.setFlexBasisPercent(0f);
        root_child0_child0.addChildAt(root_child0_child0_child2, 2);

        YogaNode root_child0_child0_child2_child0 = createNode(config);
        root_child0_child0_child2_child0.setFlexGrow(1f);
        root_child0_child0_child2_child0.setFlexShrink(1f);
        root_child0_child0_child2_child0.setFlexBasisPercent(0f);
        root_child0_child0_child2_child0.setAspectRatio(1 / 1f);
        root_child0_child0_child2.addChildAt(root_child0_child0_child2_child0, 0);

        YogaNode root_child0_child0_child2_child0_child0 = createNode(config);
        root_child0_child0_child2_child0_child0.setWidth(5f);
        root_child0_child0_child2_child0.addChildAt(root_child0_child0_child2_child0_child0, 0);

        YogaNode root_child0_child0_child2_child0_child1 = createNode(config);
        root_child0_child0_child2_child0_child1.setFlexGrow(1f);
        root_child0_child0_child2_child0_child1.setFlexShrink(1f);
        root_child0_child0_child2_child0_child1.setFlexBasisPercent(0f);
        root_child0_child0_child2_child0_child1.setAspectRatio(1 / 1f);
        root_child0_child0_child2_child0.addChildAt(root_child0_child0_child2_child0_child1, 1);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(300f, root.getLayoutWidth(), 0.0f);
        assertEquals(300f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(300f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(300f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
        assertEquals(300f, root_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(197f, root_child0_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0_child0_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0_child0.getLayoutY(), 0.0f);
        assertEquals(197f, root_child0_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(197f, root_child0_child0_child0.getLayoutHeight(), 0.0f);

        assertEquals(197f, root_child0_child0_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0_child1.getLayoutY(), 0.0f);
        assertEquals(5f, root_child0_child0_child1.getLayoutWidth(), 0.0f);
        assertEquals(197f, root_child0_child0_child1.getLayoutHeight(), 0.0f);

        assertEquals(202f, root_child0_child0_child2.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0_child2.getLayoutY(), 0.0f);
        assertEquals(98f, root_child0_child0_child2.getLayoutWidth(), 0.0f);
        assertEquals(197f, root_child0_child0_child2.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0_child0_child2_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0_child2_child0.getLayoutY(), 0.0f);
        assertEquals(98f, root_child0_child0_child2_child0.getLayoutWidth(), 0.0f);
        assertEquals(197f, root_child0_child0_child2_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0_child0_child2_child0_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0_child2_child0_child0.getLayoutY(), 0.0f);
        assertEquals(5f, root_child0_child0_child2_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(0f, root_child0_child0_child2_child0_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0_child0_child2_child0_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0_child2_child0_child1.getLayoutY(), 0.0f);
        assertEquals(98f, root_child0_child0_child2_child0_child1.getLayoutWidth(), 0.0f);
        assertEquals(197f, root_child0_child0_child2_child0_child1.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(300f, root.getLayoutWidth(), 0.0f);
        assertEquals(300f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(300f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(300f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
        assertEquals(300f, root_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(197f, root_child0_child0.getLayoutHeight(), 0.0f);

        assertEquals(103f, root_child0_child0_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0_child0.getLayoutY(), 0.0f);
        assertEquals(197f, root_child0_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(197f, root_child0_child0_child0.getLayoutHeight(), 0.0f);

        assertEquals(98f, root_child0_child0_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0_child1.getLayoutY(), 0.0f);
        assertEquals(5f, root_child0_child0_child1.getLayoutWidth(), 0.0f);
        assertEquals(197f, root_child0_child0_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0_child0_child2.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0_child2.getLayoutY(), 0.0f);
        assertEquals(98f, root_child0_child0_child2.getLayoutWidth(), 0.0f);
        assertEquals(197f, root_child0_child0_child2.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0_child0_child2_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0_child2_child0.getLayoutY(), 0.0f);
        assertEquals(98f, root_child0_child0_child2_child0.getLayoutWidth(), 0.0f);
        assertEquals(197f, root_child0_child0_child2_child0.getLayoutHeight(), 0.0f);

        assertEquals(93f, root_child0_child0_child2_child0_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0_child2_child0_child0.getLayoutY(), 0.0f);
        assertEquals(5f, root_child0_child0_child2_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(0f, root_child0_child0_child2_child0_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0_child0_child2_child0_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0_child2_child0_child1.getLayoutY(), 0.0f);
        assertEquals(98f, root_child0_child0_child2_child0_child1.getLayoutWidth(), 0.0f);
        assertEquals(197f, root_child0_child0_child2_child0_child1.getLayoutHeight(), 0.0f);
    }
}