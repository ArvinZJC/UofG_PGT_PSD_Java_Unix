/*
 * @Description: a part of Task 2
 * @Version: 1.0.1.20210306
 * @Author: Arvin Zhao
 * @Date: 2021-02-06 18:12:24
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-03-06 19:24:12
 */

package labs.l7.t2;

import java.util.List;
import java.util.Set;

interface PackingStrategy
{
    // An interface's methods are all public.
    Set<Bin> pack(int capacity, List<Integer> values);
} // end interface PackingStrategy