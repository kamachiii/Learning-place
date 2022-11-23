#Logic | boolean

==          8 == 8       -> true
!=          8 == 8       -> false
>, >=       7 >= 8       -> false
<, <=       7 <= 8        -> true

&&        1==1 && 2==2   true && true    -> true
          1==2 && 2==2   false && true   -> false
          1==1 && 1==2   true && false   -> false
          1==2 && 1==2   false && false  -> false

||        1==1 || 2==3   true || false   -> true
||        1==2 || 2==3   false || false   -> false
