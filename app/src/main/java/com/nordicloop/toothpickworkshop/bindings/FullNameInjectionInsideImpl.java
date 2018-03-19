package com.nordicloop.toothpickworkshop.bindings;


import com.nordicloop.mylibrary.FullName;

import javax.inject.Inject;

import toothpick.Scope;
import toothpick.Toothpick;

public class FullNameInjectionInsideImpl implements FullName {
  @Inject
  Name mName;
  @Inject
  Surname mSurname;

  public FullNameInjectionInsideImpl() {
    Scope scope = Toothpick.openScope("ACTIVITY");
    Toothpick.inject(this, scope);
  }

  @Override
  public String getFullName() {
    return mName.getName() + " " + mSurname.getSurname();
  }
}
