/*
 * Copyright (c) 2011, 2014, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package javafx.scene.effect;

/**
Builder class for javafx.scene.effect.Lighting
@see javafx.scene.effect.Lighting
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public class LightingBuilder<B extends javafx.scene.effect.LightingBuilder<B>> implements javafx.util.Builder<javafx.scene.effect.Lighting> {
    protected LightingBuilder() {
    }

    /** Creates a new instance of LightingBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static javafx.scene.effect.LightingBuilder<?> create() {
        return new javafx.scene.effect.LightingBuilder();
    }

    private int __set;
    public void applyTo(javafx.scene.effect.Lighting x) {
        int set = __set;
        if ((set & (1 << 0)) != 0) x.setBumpInput(this.bumpInput);
        if ((set & (1 << 1)) != 0) x.setContentInput(this.contentInput);
        if ((set & (1 << 2)) != 0) x.setDiffuseConstant(this.diffuseConstant);
        if ((set & (1 << 3)) != 0) x.setLight(this.light);
        if ((set & (1 << 4)) != 0) x.setSpecularConstant(this.specularConstant);
        if ((set & (1 << 5)) != 0) x.setSpecularExponent(this.specularExponent);
        if ((set & (1 << 6)) != 0) x.setSurfaceScale(this.surfaceScale);
    }

    private javafx.scene.effect.Effect bumpInput;
    /**
    Set the value of the {@link javafx.scene.effect.Lighting#getBumpInput() bumpInput} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B bumpInput(javafx.scene.effect.Effect x) {
        this.bumpInput = x;
        __set |= 1 << 0;
        return (B) this;
    }

    private javafx.scene.effect.Effect contentInput;
    /**
    Set the value of the {@link javafx.scene.effect.Lighting#getContentInput() contentInput} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B contentInput(javafx.scene.effect.Effect x) {
        this.contentInput = x;
        __set |= 1 << 1;
        return (B) this;
    }

    private double diffuseConstant;
    /**
    Set the value of the {@link javafx.scene.effect.Lighting#getDiffuseConstant() diffuseConstant} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B diffuseConstant(double x) {
        this.diffuseConstant = x;
        __set |= 1 << 2;
        return (B) this;
    }

    private javafx.scene.effect.Light light;
    /**
    Set the value of the {@link javafx.scene.effect.Lighting#getLight() light} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B light(javafx.scene.effect.Light x) {
        this.light = x;
        __set |= 1 << 3;
        return (B) this;
    }

    private double specularConstant;
    /**
    Set the value of the {@link javafx.scene.effect.Lighting#getSpecularConstant() specularConstant} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B specularConstant(double x) {
        this.specularConstant = x;
        __set |= 1 << 4;
        return (B) this;
    }

    private double specularExponent;
    /**
    Set the value of the {@link javafx.scene.effect.Lighting#getSpecularExponent() specularExponent} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B specularExponent(double x) {
        this.specularExponent = x;
        __set |= 1 << 5;
        return (B) this;
    }

    private double surfaceScale;
    /**
    Set the value of the {@link javafx.scene.effect.Lighting#getSurfaceScale() surfaceScale} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B surfaceScale(double x) {
        this.surfaceScale = x;
        __set |= 1 << 6;
        return (B) this;
    }

    /**
    Make an instance of {@link javafx.scene.effect.Lighting} based on the properties set on this builder.
    */
    public javafx.scene.effect.Lighting build() {
        javafx.scene.effect.Lighting x = new javafx.scene.effect.Lighting();
        applyTo(x);
        return x;
    }
}
