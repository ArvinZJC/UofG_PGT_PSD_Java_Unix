/*
 * @Description: a part of Task 2
 * @Version: 1.0.0.20210206
 * @Author: Arvin Zhao
 * @Date: 2021-02-06 18:12:24
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-06 19:24:12
 */

package lab.l7.t2;

import java.util.List;
import java.util.Set;

interface PackingStrategy
{
    // An interface's methods are all public.
    Set<Bin> pack(int capacity, List<Integer> values);
} // end interface PackingStrategy