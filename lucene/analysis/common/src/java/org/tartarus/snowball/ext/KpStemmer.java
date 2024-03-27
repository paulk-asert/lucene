// Generated by Snowball 2.2.0 - https://snowballstem.org/

package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;

/**
 * This class implements the stemming algorithm defined by a snowball script.
 *
 * <p>Generated by Snowball 2.2.0 - https://snowballstem.org/
 */
@SuppressWarnings("unused")
public class KpStemmer extends org.tartarus.snowball.SnowballStemmer {

  private static final long serialVersionUID = 1L;

  private static final Among a_0[] = {
    new Among("nde", -1, 7),
    new Among("en", -1, 6),
    new Among("s", -1, 2),
    new Among("'s", 2, 1),
    new Among("es", 2, 4),
    new Among("ies", 4, 3),
    new Among("aus", 2, 5)
  };

  private static final Among a_1[] = {
    new Among("de", -1, 5),
    new Among("ge", -1, 2),
    new Among("ische", -1, 4),
    new Among("je", -1, 1),
    new Among("lijke", -1, 3),
    new Among("le", -1, 9),
    new Among("ene", -1, 10),
    new Among("re", -1, 8),
    new Among("se", -1, 7),
    new Among("te", -1, 6),
    new Among("ieve", -1, 11)
  };

  private static final Among a_2[] = {
    new Among("heid", -1, 3),
    new Among("fie", -1, 6),
    new Among("gie", -1, 7),
    new Among("atie", -1, 1),
    new Among("isme", -1, 2),
    new Among("ing", -1, 2),
    new Among("arij", -1, 5),
    new Among("erij", -1, 2),
    new Among("sel", -1, 3),
    new Among("rder", -1, 4),
    new Among("ster", -1, 3),
    new Among("iteit", -1, 2),
    new Among("dst", -1, 9),
    new Among("tst", -1, 8)
  };

  private static final Among a_3[] = {
    new Among("end", -1, 9),
    new Among("atief", -1, 2),
    new Among("erig", -1, 9),
    new Among("achtig", -1, 3),
    new Among("ioneel", -1, 1),
    new Among("baar", -1, 3),
    new Among("laar", -1, 5),
    new Among("naar", -1, 4),
    new Among("raar", -1, 6),
    new Among("eriger", -1, 9),
    new Among("achtiger", -1, 3),
    new Among("lijker", -1, 8),
    new Among("tant", -1, 7),
    new Among("erigst", -1, 9),
    new Among("achtigst", -1, 3),
    new Among("lijkst", -1, 8)
  };

  private static final Among a_4[] = {
    new Among("ig", -1, 1), new Among("iger", -1, 1), new Among("igst", -1, 1)
  };

  private static final Among a_5[] = {
    new Among("ft", -1, 2), new Among("kt", -1, 1), new Among("pt", -1, 3)
  };

  private static final Among a_6[] = {
    new Among("bb", -1, 1),
    new Among("cc", -1, 2),
    new Among("dd", -1, 3),
    new Among("ff", -1, 4),
    new Among("gg", -1, 5),
    new Among("hh", -1, 6),
    new Among("jj", -1, 7),
    new Among("kk", -1, 8),
    new Among("ll", -1, 9),
    new Among("mm", -1, 10),
    new Among("nn", -1, 11),
    new Among("pp", -1, 12),
    new Among("qq", -1, 13),
    new Among("rr", -1, 14),
    new Among("ss", -1, 15),
    new Among("tt", -1, 16),
    new Among("v", -1, 4),
    new Among("vv", 16, 17),
    new Among("ww", -1, 18),
    new Among("xx", -1, 19),
    new Among("z", -1, 15),
    new Among("zz", 20, 20)
  };

  private static final Among a_7[] = {new Among("d", -1, 1), new Among("t", -1, 2)};

  private static final char g_v[] = {17, 65, 16, 1};

  private static final char g_v_WX[] = {17, 65, 208, 1};

  private static final char g_AOU[] = {1, 64, 16};

  private static final char g_AIOU[] = {1, 65, 16};

  private boolean B_GE_removed;
  private boolean B_stemmed;
  private boolean B_Y_found;
  private int I_p2;
  private int I_p1;
  private java.lang.StringBuilder S_ch = new java.lang.StringBuilder();

  private boolean r_R1() {
    return I_p1 <= cursor;
  }

  private boolean r_R2() {
    return I_p2 <= cursor;
  }

  private boolean r_V() {
    int v_1 = limit - cursor;
    lab0:
    {
      int v_2 = limit - cursor;
      lab1:
      {
        if (!(in_grouping_b(g_v, 97, 121))) {
          break lab1;
        }
        break lab0;
      }
      cursor = limit - v_2;
      if (!(eq_s_b("ij"))) {
        return false;
      }
    }
    cursor = limit - v_1;
    return true;
  }

  private boolean r_VX() {
    int v_1 = limit - cursor;
    if (cursor <= limit_backward) {
      return false;
    }
    cursor--;
    lab0:
    {
      int v_2 = limit - cursor;
      lab1:
      {
        if (!(in_grouping_b(g_v, 97, 121))) {
          break lab1;
        }
        break lab0;
      }
      cursor = limit - v_2;
      if (!(eq_s_b("ij"))) {
        return false;
      }
    }
    cursor = limit - v_1;
    return true;
  }

  private boolean r_C() {
    int v_1 = limit - cursor;
    {
      int v_2 = limit - cursor;
      lab0:
      {
        if (!(eq_s_b("ij"))) {
          break lab0;
        }
        return false;
      }
      cursor = limit - v_2;
    }
    if (!(out_grouping_b(g_v, 97, 121))) {
      return false;
    }
    cursor = limit - v_1;
    return true;
  }

  private boolean r_lengthen_V() {
    int v_1 = limit - cursor;
    lab0:
    {
      if (!(out_grouping_b(g_v_WX, 97, 121))) {
        break lab0;
      }
      ket = cursor;
      lab1:
      {
        int v_2 = limit - cursor;
        lab2:
        {
          if (!(in_grouping_b(g_AOU, 97, 117))) {
            break lab2;
          }
          bra = cursor;
          int v_3 = limit - cursor;
          lab3:
          {
            int v_4 = limit - cursor;
            lab4:
            {
              if (!(out_grouping_b(g_v, 97, 121))) {
                break lab4;
              }
              break lab3;
            }
            cursor = limit - v_4;
            if (cursor > limit_backward) {
              break lab2;
            }
          }
          cursor = limit - v_3;
          break lab1;
        }
        cursor = limit - v_2;
        if (!(eq_s_b("e"))) {
          break lab0;
        }
        bra = cursor;
        int v_5 = limit - cursor;
        lab5:
        {
          int v_6 = limit - cursor;
          lab6:
          {
            if (!(out_grouping_b(g_v, 97, 121))) {
              break lab6;
            }
            break lab5;
          }
          cursor = limit - v_6;
          if (cursor > limit_backward) {
            break lab0;
          }
        }
        {
          int v_7 = limit - cursor;
          lab7:
          {
            if (!(in_grouping_b(g_AIOU, 97, 117))) {
              break lab7;
            }
            break lab0;
          }
          cursor = limit - v_7;
        }
        {
          int v_8 = limit - cursor;
          lab8:
          {
            if (cursor <= limit_backward) {
              break lab8;
            }
            cursor--;
            if (!(in_grouping_b(g_AIOU, 97, 117))) {
              break lab8;
            }
            if (!(out_grouping_b(g_v, 97, 121))) {
              break lab8;
            }
            break lab0;
          }
          cursor = limit - v_8;
        }
        cursor = limit - v_5;
      }
      slice_to(S_ch);
      {
        int c = cursor;
        insert(cursor, cursor, S_ch);
        cursor = c;
      }
    }
    cursor = limit - v_1;
    return true;
  }

  private boolean r_Step_1() {
    int among_var;
    ket = cursor;
    among_var = find_among_b(a_0);
    if (among_var == 0) {
      return false;
    }
    bra = cursor;
    switch (among_var) {
      case 1:
        slice_del();
        break;
      case 2:
        if (!r_R1()) {
          return false;
        }
        {
          int v_1 = limit - cursor;
          lab0:
          {
            if (!(eq_s_b("t"))) {
              break lab0;
            }
            if (!r_R1()) {
              break lab0;
            }
            return false;
          }
          cursor = limit - v_1;
        }
        if (!r_C()) {
          return false;
        }
        slice_del();
        break;
      case 3:
        if (!r_R1()) {
          return false;
        }
        slice_from("ie");
        break;
      case 4:
        lab1:
        {
          int v_2 = limit - cursor;
          lab2:
          {
            if (!(eq_s_b("ar"))) {
              break lab2;
            }
            if (!r_R1()) {
              break lab2;
            }
            if (!r_C()) {
              break lab2;
            }
            bra = cursor;
            slice_del();
            r_lengthen_V();
            break lab1;
          }
          cursor = limit - v_2;
          lab3:
          {
            if (!(eq_s_b("er"))) {
              break lab3;
            }
            if (!r_R1()) {
              break lab3;
            }
            if (!r_C()) {
              break lab3;
            }
            bra = cursor;
            slice_del();
            break lab1;
          }
          cursor = limit - v_2;
          if (!r_R1()) {
            return false;
          }
          if (!r_C()) {
            return false;
          }
          slice_from("e");
        }
        break;
      case 5:
        if (!r_R1()) {
          return false;
        }
        if (!r_V()) {
          return false;
        }
        slice_from("au");
        break;
      case 6:
        lab4:
        {
          int v_3 = limit - cursor;
          lab5:
          {
            if (!(eq_s_b("hed"))) {
              break lab5;
            }
            if (!r_R1()) {
              break lab5;
            }
            bra = cursor;
            slice_from("heid");
            break lab4;
          }
          cursor = limit - v_3;
          lab6:
          {
            if (!(eq_s_b("nd"))) {
              break lab6;
            }
            slice_del();
            break lab4;
          }
          cursor = limit - v_3;
          lab7:
          {
            if (!(eq_s_b("d"))) {
              break lab7;
            }
            if (!r_R1()) {
              break lab7;
            }
            if (!r_C()) {
              break lab7;
            }
            bra = cursor;
            slice_del();
            break lab4;
          }
          cursor = limit - v_3;
          lab8:
          {
            lab9:
            {
              int v_4 = limit - cursor;
              lab10:
              {
                if (!(eq_s_b("i"))) {
                  break lab10;
                }
                break lab9;
              }
              cursor = limit - v_4;
              if (!(eq_s_b("j"))) {
                break lab8;
              }
            }
            if (!r_V()) {
              break lab8;
            }
            slice_del();
            break lab4;
          }
          cursor = limit - v_3;
          if (!r_R1()) {
            return false;
          }
          if (!r_C()) {
            return false;
          }
          slice_del();
          r_lengthen_V();
        }
        break;
      case 7:
        slice_from("nd");
        break;
    }
    return true;
  }

  private boolean r_Step_2() {
    int among_var;
    ket = cursor;
    among_var = find_among_b(a_1);
    if (among_var == 0) {
      return false;
    }
    bra = cursor;
    switch (among_var) {
      case 1:
        lab0:
        {
          int v_1 = limit - cursor;
          lab1:
          {
            if (!(eq_s_b("'t"))) {
              break lab1;
            }
            bra = cursor;
            slice_del();
            break lab0;
          }
          cursor = limit - v_1;
          lab2:
          {
            if (!(eq_s_b("et"))) {
              break lab2;
            }
            bra = cursor;
            if (!r_R1()) {
              break lab2;
            }
            if (!r_C()) {
              break lab2;
            }
            slice_del();
            break lab0;
          }
          cursor = limit - v_1;
          lab3:
          {
            if (!(eq_s_b("rnt"))) {
              break lab3;
            }
            bra = cursor;
            slice_from("rn");
            break lab0;
          }
          cursor = limit - v_1;
          lab4:
          {
            if (!(eq_s_b("t"))) {
              break lab4;
            }
            bra = cursor;
            if (!r_R1()) {
              break lab4;
            }
            if (!r_VX()) {
              break lab4;
            }
            slice_del();
            break lab0;
          }
          cursor = limit - v_1;
          lab5:
          {
            if (!(eq_s_b("ink"))) {
              break lab5;
            }
            bra = cursor;
            slice_from("ing");
            break lab0;
          }
          cursor = limit - v_1;
          lab6:
          {
            if (!(eq_s_b("mp"))) {
              break lab6;
            }
            bra = cursor;
            slice_from("m");
            break lab0;
          }
          cursor = limit - v_1;
          lab7:
          {
            if (!(eq_s_b("'"))) {
              break lab7;
            }
            bra = cursor;
            if (!r_R1()) {
              break lab7;
            }
            slice_del();
            break lab0;
          }
          cursor = limit - v_1;
          bra = cursor;
          if (!r_R1()) {
            return false;
          }
          if (!r_C()) {
            return false;
          }
          slice_del();
        }
        break;
      case 2:
        if (!r_R1()) {
          return false;
        }
        slice_from("g");
        break;
      case 3:
        if (!r_R1()) {
          return false;
        }
        slice_from("lijk");
        break;
      case 4:
        if (!r_R1()) {
          return false;
        }
        slice_from("isch");
        break;
      case 5:
        if (!r_R1()) {
          return false;
        }
        if (!r_C()) {
          return false;
        }
        slice_del();
        break;
      case 6:
        if (!r_R1()) {
          return false;
        }
        slice_from("t");
        break;
      case 7:
        if (!r_R1()) {
          return false;
        }
        slice_from("s");
        break;
      case 8:
        if (!r_R1()) {
          return false;
        }
        slice_from("r");
        break;
      case 9:
        if (!r_R1()) {
          return false;
        }
        slice_del();
        insert(cursor, cursor, "l");
        r_lengthen_V();
        break;
      case 10:
        if (!r_R1()) {
          return false;
        }
        if (!r_C()) {
          return false;
        }
        slice_del();
        insert(cursor, cursor, "en");
        r_lengthen_V();
        break;
      case 11:
        if (!r_R1()) {
          return false;
        }
        if (!r_C()) {
          return false;
        }
        slice_from("ief");
        break;
    }
    return true;
  }

  private boolean r_Step_3() {
    int among_var;
    ket = cursor;
    among_var = find_among_b(a_2);
    if (among_var == 0) {
      return false;
    }
    bra = cursor;
    switch (among_var) {
      case 1:
        if (!r_R1()) {
          return false;
        }
        slice_from("eer");
        break;
      case 2:
        if (!r_R1()) {
          return false;
        }
        slice_del();
        r_lengthen_V();
        break;
      case 3:
        if (!r_R1()) {
          return false;
        }
        slice_del();
        break;
      case 4:
        slice_from("r");
        break;
      case 5:
        if (!r_R1()) {
          return false;
        }
        if (!r_C()) {
          return false;
        }
        slice_from("aar");
        break;
      case 6:
        if (!r_R2()) {
          return false;
        }
        slice_del();
        insert(cursor, cursor, "f");
        r_lengthen_V();
        break;
      case 7:
        if (!r_R2()) {
          return false;
        }
        slice_del();
        insert(cursor, cursor, "g");
        r_lengthen_V();
        break;
      case 8:
        if (!r_R1()) {
          return false;
        }
        if (!r_C()) {
          return false;
        }
        slice_from("t");
        break;
      case 9:
        if (!r_R1()) {
          return false;
        }
        if (!r_C()) {
          return false;
        }
        slice_from("d");
        break;
    }
    return true;
  }

  private boolean r_Step_4() {
    int among_var;
    lab0:
    {
      int v_1 = limit - cursor;
      lab1:
      {
        ket = cursor;
        among_var = find_among_b(a_3);
        if (among_var == 0) {
          break lab1;
        }
        bra = cursor;
        switch (among_var) {
          case 1:
            if (!r_R1()) {
              break lab1;
            }
            slice_from("ie");
            break;
          case 2:
            if (!r_R1()) {
              break lab1;
            }
            slice_from("eer");
            break;
          case 3:
            if (!r_R1()) {
              break lab1;
            }
            slice_del();
            break;
          case 4:
            if (!r_R1()) {
              break lab1;
            }
            if (!r_V()) {
              break lab1;
            }
            slice_from("n");
            break;
          case 5:
            if (!r_R1()) {
              break lab1;
            }
            if (!r_V()) {
              break lab1;
            }
            slice_from("l");
            break;
          case 6:
            if (!r_R1()) {
              break lab1;
            }
            if (!r_V()) {
              break lab1;
            }
            slice_from("r");
            break;
          case 7:
            if (!r_R1()) {
              break lab1;
            }
            slice_from("teer");
            break;
          case 8:
            if (!r_R1()) {
              break lab1;
            }
            slice_from("lijk");
            break;
          case 9:
            if (!r_R1()) {
              break lab1;
            }
            if (!r_C()) {
              break lab1;
            }
            slice_del();
            r_lengthen_V();
            break;
        }
        break lab0;
      }
      cursor = limit - v_1;
      ket = cursor;
      if (find_among_b(a_4) == 0) {
        return false;
      }
      bra = cursor;
      if (!r_R1()) {
        return false;
      }
      if (!r_C()) {
        return false;
      }
      slice_del();
      r_lengthen_V();
    }
    return true;
  }

  private boolean r_Step_7() {
    int among_var;
    ket = cursor;
    among_var = find_among_b(a_5);
    if (among_var == 0) {
      return false;
    }
    bra = cursor;
    switch (among_var) {
      case 1:
        slice_from("k");
        break;
      case 2:
        slice_from("f");
        break;
      case 3:
        slice_from("p");
        break;
    }
    return true;
  }

  private boolean r_Step_6() {
    int among_var;
    ket = cursor;
    among_var = find_among_b(a_6);
    if (among_var == 0) {
      return false;
    }
    bra = cursor;
    switch (among_var) {
      case 1:
        slice_from("b");
        break;
      case 2:
        slice_from("c");
        break;
      case 3:
        slice_from("d");
        break;
      case 4:
        slice_from("f");
        break;
      case 5:
        slice_from("g");
        break;
      case 6:
        slice_from("h");
        break;
      case 7:
        slice_from("j");
        break;
      case 8:
        slice_from("k");
        break;
      case 9:
        slice_from("l");
        break;
      case 10:
        slice_from("m");
        break;
      case 11:
        slice_from("n");
        break;
      case 12:
        slice_from("p");
        break;
      case 13:
        slice_from("q");
        break;
      case 14:
        slice_from("r");
        break;
      case 15:
        slice_from("s");
        break;
      case 16:
        slice_from("t");
        break;
      case 17:
        slice_from("v");
        break;
      case 18:
        slice_from("w");
        break;
      case 19:
        slice_from("x");
        break;
      case 20:
        slice_from("z");
        break;
    }
    return true;
  }

  private boolean r_Step_1c() {
    int among_var;
    ket = cursor;
    among_var = find_among_b(a_7);
    if (among_var == 0) {
      return false;
    }
    bra = cursor;
    if (!r_R1()) {
      return false;
    }
    if (!r_C()) {
      return false;
    }
    switch (among_var) {
      case 1:
        {
          int v_1 = limit - cursor;
          lab0:
          {
            if (!(eq_s_b("n"))) {
              break lab0;
            }
            if (!r_R1()) {
              break lab0;
            }
            return false;
          }
          cursor = limit - v_1;
        }
        slice_del();
        break;
      case 2:
        {
          int v_2 = limit - cursor;
          lab1:
          {
            if (!(eq_s_b("h"))) {
              break lab1;
            }
            if (!r_R1()) {
              break lab1;
            }
            return false;
          }
          cursor = limit - v_2;
        }
        slice_del();
        break;
    }
    return true;
  }

  private boolean r_Lose_prefix() {
    bra = cursor;
    if (!(eq_s("ge"))) {
      return false;
    }
    ket = cursor;
    int v_1 = cursor;
    {
      int c = cursor + 3;
      if (c > limit) {
        return false;
      }
      cursor = c;
    }
    cursor = v_1;
    golab0:
    while (true) {
      int v_2 = cursor;
      lab1:
      {
        if (!(in_grouping(g_v, 97, 121))) {
          break lab1;
        }
        cursor = v_2;
        break golab0;
      }
      cursor = v_2;
      if (cursor >= limit) {
        return false;
      }
      cursor++;
    }
    golab2:
    while (true) {
      int v_3 = cursor;
      lab3:
      {
        if (!(out_grouping(g_v, 97, 121))) {
          break lab3;
        }
        cursor = v_3;
        break golab2;
      }
      cursor = v_3;
      if (cursor >= limit) {
        return false;
      }
      cursor++;
    }
    B_GE_removed = true;
    slice_del();
    return true;
  }

  private boolean r_Lose_infix() {
    if (cursor >= limit) {
      return false;
    }
    cursor++;
    golab0:
    while (true) {
      lab1:
      {
        bra = cursor;
        if (!(eq_s("ge"))) {
          break lab1;
        }
        ket = cursor;
        break golab0;
      }
      if (cursor >= limit) {
        return false;
      }
      cursor++;
    }
    int v_2 = cursor;
    {
      int c = cursor + 3;
      if (c > limit) {
        return false;
      }
      cursor = c;
    }
    cursor = v_2;
    golab2:
    while (true) {
      int v_3 = cursor;
      lab3:
      {
        if (!(in_grouping(g_v, 97, 121))) {
          break lab3;
        }
        cursor = v_3;
        break golab2;
      }
      cursor = v_3;
      if (cursor >= limit) {
        return false;
      }
      cursor++;
    }
    golab4:
    while (true) {
      int v_4 = cursor;
      lab5:
      {
        if (!(out_grouping(g_v, 97, 121))) {
          break lab5;
        }
        cursor = v_4;
        break golab4;
      }
      cursor = v_4;
      if (cursor >= limit) {
        return false;
      }
      cursor++;
    }
    B_GE_removed = true;
    slice_del();
    return true;
  }

  private boolean r_measure() {
    I_p1 = limit;
    I_p2 = limit;
    int v_1 = cursor;
    lab0:
    {
      while (true) {
        lab1:
        {
          if (!(out_grouping(g_v, 97, 121))) {
            break lab1;
          }
          continue;
        }
        break;
      }
      {
        int v_3 = 1;
        while (true) {
          int v_4 = cursor;
          lab2:
          {
            lab3:
            {
              int v_5 = cursor;
              lab4:
              {
                if (!(eq_s("ij"))) {
                  break lab4;
                }
                break lab3;
              }
              cursor = v_5;
              if (!(in_grouping(g_v, 97, 121))) {
                break lab2;
              }
            }
            v_3--;
            continue;
          }
          cursor = v_4;
          break;
        }
        if (v_3 > 0) {
          break lab0;
        }
      }
      if (!(out_grouping(g_v, 97, 121))) {
        break lab0;
      }
      I_p1 = cursor;
      while (true) {
        lab5:
        {
          if (!(out_grouping(g_v, 97, 121))) {
            break lab5;
          }
          continue;
        }
        break;
      }
      {
        int v_7 = 1;
        while (true) {
          int v_8 = cursor;
          lab6:
          {
            lab7:
            {
              int v_9 = cursor;
              lab8:
              {
                if (!(eq_s("ij"))) {
                  break lab8;
                }
                break lab7;
              }
              cursor = v_9;
              if (!(in_grouping(g_v, 97, 121))) {
                break lab6;
              }
            }
            v_7--;
            continue;
          }
          cursor = v_8;
          break;
        }
        if (v_7 > 0) {
          break lab0;
        }
      }
      if (!(out_grouping(g_v, 97, 121))) {
        break lab0;
      }
      I_p2 = cursor;
    }
    cursor = v_1;
    return true;
  }

  @Override
  public boolean stem() {
    B_Y_found = false;
    B_stemmed = false;
    int v_1 = cursor;
    lab0:
    {
      bra = cursor;
      if (!(eq_s("y"))) {
        break lab0;
      }
      ket = cursor;
      slice_from("Y");
      B_Y_found = true;
    }
    cursor = v_1;
    int v_2 = cursor;
    lab1:
    {
      while (true) {
        int v_3 = cursor;
        lab2:
        {
          golab3:
          while (true) {
            int v_4 = cursor;
            lab4:
            {
              if (!(in_grouping(g_v, 97, 121))) {
                break lab4;
              }
              bra = cursor;
              if (!(eq_s("y"))) {
                break lab4;
              }
              ket = cursor;
              cursor = v_4;
              break golab3;
            }
            cursor = v_4;
            if (cursor >= limit) {
              break lab2;
            }
            cursor++;
          }
          slice_from("Y");
          B_Y_found = true;
          continue;
        }
        cursor = v_3;
        break;
      }
    }
    cursor = v_2;
    r_measure();
    limit_backward = cursor;
    cursor = limit;
    int v_5 = limit - cursor;
    lab5:
    {
      if (!r_Step_1()) {
        break lab5;
      }
      B_stemmed = true;
    }
    cursor = limit - v_5;
    int v_6 = limit - cursor;
    lab6:
    {
      if (!r_Step_2()) {
        break lab6;
      }
      B_stemmed = true;
    }
    cursor = limit - v_6;
    int v_7 = limit - cursor;
    lab7:
    {
      if (!r_Step_3()) {
        break lab7;
      }
      B_stemmed = true;
    }
    cursor = limit - v_7;
    int v_8 = limit - cursor;
    lab8:
    {
      if (!r_Step_4()) {
        break lab8;
      }
      B_stemmed = true;
    }
    cursor = limit - v_8;
    cursor = limit_backward;
    B_GE_removed = false;
    int v_9 = cursor;
    lab9:
    {
      int v_10 = cursor;
      if (!r_Lose_prefix()) {
        break lab9;
      }
      cursor = v_10;
      r_measure();
    }
    cursor = v_9;
    limit_backward = cursor;
    cursor = limit;
    int v_11 = limit - cursor;
    lab10:
    {
      if (!(B_GE_removed)) {
        break lab10;
      }
      if (!r_Step_1c()) {
        break lab10;
      }
    }
    cursor = limit - v_11;
    cursor = limit_backward;
    B_GE_removed = false;
    int v_12 = cursor;
    lab11:
    {
      int v_13 = cursor;
      if (!r_Lose_infix()) {
        break lab11;
      }
      cursor = v_13;
      r_measure();
    }
    cursor = v_12;
    limit_backward = cursor;
    cursor = limit;
    int v_14 = limit - cursor;
    lab12:
    {
      if (!(B_GE_removed)) {
        break lab12;
      }
      if (!r_Step_1c()) {
        break lab12;
      }
    }
    cursor = limit - v_14;
    cursor = limit_backward;
    limit_backward = cursor;
    cursor = limit;
    int v_15 = limit - cursor;
    lab13:
    {
      if (!r_Step_7()) {
        break lab13;
      }
      B_stemmed = true;
    }
    cursor = limit - v_15;
    int v_16 = limit - cursor;
    lab14:
    {
      lab15:
      {
        lab16:
        {
          if (!(B_stemmed)) {
            break lab16;
          }
          break lab15;
        }
        if (!(B_GE_removed)) {
          break lab14;
        }
      }
      if (!r_Step_6()) {
        break lab14;
      }
    }
    cursor = limit - v_16;
    cursor = limit_backward;
    int v_18 = cursor;
    lab17:
    {
      if (!(B_Y_found)) {
        break lab17;
      }
      while (true) {
        int v_19 = cursor;
        lab18:
        {
          golab19:
          while (true) {
            int v_20 = cursor;
            lab20:
            {
              bra = cursor;
              if (!(eq_s("Y"))) {
                break lab20;
              }
              ket = cursor;
              cursor = v_20;
              break golab19;
            }
            cursor = v_20;
            if (cursor >= limit) {
              break lab18;
            }
            cursor++;
          }
          slice_from("y");
          continue;
        }
        cursor = v_19;
        break;
      }
    }
    cursor = v_18;
    return true;
  }

  @Override
  public boolean equals(Object o) {
    return o instanceof KpStemmer;
  }

  @Override
  public int hashCode() {
    return KpStemmer.class.getName().hashCode();
  }
}
