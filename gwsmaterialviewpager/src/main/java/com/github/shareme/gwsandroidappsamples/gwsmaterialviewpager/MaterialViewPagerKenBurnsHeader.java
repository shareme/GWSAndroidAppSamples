/*
 * Copyright 2015 florent37, Inc.
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
 *
 */
package com.github.shareme.gwsandroidappsamples.gwsmaterialviewpager;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

import com.github.shareme.gwsandroidappsamples.gwsmaterialviewpager.kbv.KenBurnsView;

/**
 * The MaterialViewPager animated Header
 * Using com.flaviofaria.kenburnsview.KenBurnsView
 * https://github.com/flavioarfaria/KenBurnsView
 * Created by fgrott on 6/12/2016.
 */
@SuppressWarnings("unused")
public class MaterialViewPagerKenBurnsHeader extends KenBurnsView {

  //region construct

  public MaterialViewPagerKenBurnsHeader(Context context) {
    super(context);
  }

  public MaterialViewPagerKenBurnsHeader(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public MaterialViewPagerKenBurnsHeader(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
  }

  //endregion

  /**
   * change the image with a fade
   *
   * @param urlImage
   * @param fadeDuration TODO : remove Picasso
   */
  public void setImageUrl(final String urlImage, final int fadeDuration) {
    MaterialViewPagerImageHelper.setImageUrl(this, urlImage, fadeDuration);
  }

  /**
   * change the image with a fade
   *
   * @param drawable
   * @param fadeDuration
   */
  public void setImageDrawable(final Drawable drawable, final int fadeDuration) {
    MaterialViewPagerImageHelper.setImageDrawable(this, drawable, fadeDuration);
  }

}
