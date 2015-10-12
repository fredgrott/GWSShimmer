/*
 * Copyright 2014 Romain Piel
 *
 * Modifications Copyright (c) 2015 Fred Grott(GrottWorkShop)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.shareme.gwsshimmer.library;

/**
 * IShimmerViewBase, original author Romain Piel
 *
 * Created by fgrott on 5/1/2015.
 * @author Fred Grott
 */
public interface IShimmerViewBase {

    float getGradientX();
    void setGradientX(float gradientX);
    boolean isShimmering();
    void setShimmering(boolean isShimmering);
    boolean isSetUp();
    void setAnimationSetupCallback(ShimmerViewHelper.AnimationSetupCallback callback);
    int getPrimaryColor();
    void setPrimaryColor(int primaryColor);
    int getReflectionColor();
    void setReflectionColor(int reflectionColor);

}
