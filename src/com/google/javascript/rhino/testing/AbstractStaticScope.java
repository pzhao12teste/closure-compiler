/*
 *
 * ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is Rhino code, released
 * May 6, 1999.
 *
 * The Initial Developer of the Original Code is
 * Netscape Communications Corporation.
 * Portions created by the Initial Developer are Copyright (C) 1997-1999
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 *   Nick Santos
 *
 * Alternatively, the contents of this file may be used under the terms of
 * the GNU General Public License Version 2 or later (the "GPL"), in which
 * case the provisions of the GPL are applicable instead of those above. If
 * you wish to allow use of your version of this file only under the terms of
 * the GPL and not to allow others to use your version of this file under the
 * MPL, indicate your decision by deleting the provisions above and replacing
 * them with the notice and other provisions required by the GPL. If you do
 * not delete the provisions above, a recipient may use your version of this
 * file under either the MPL or the GPL.
 *
 * ***** END LICENSE BLOCK ***** */

package com.google.javascript.rhino.testing;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.TypeI;
import com.google.javascript.rhino.jstype.StaticTypedScope;
import com.google.javascript.rhino.jstype.StaticTypedSlot;

/**
 * A scope that just returns null for everything.
 * @author nicksantos@google.com (Nick Santos)
 */
public abstract class AbstractStaticScope<T extends TypeI> implements StaticTypedScope<T> {

  @Override
  public Node getRootNode() {
    return null;
  }

  @Override
  public StaticTypedScope<T> getParentScope() {
    return null;
  }

  @Override
  public abstract StaticTypedSlot<T> getSlot(String name);

  @Override
  public StaticTypedSlot<T> getOwnSlot(String name) {
    return getSlot(name);
  }

  @Override
  public T getTypeOfThis() {
    return null;
  }

  @Override
  public TypeI getTypeIOfThis() {
    return null;
  }
}
