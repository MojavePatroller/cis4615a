/*
Vulnerable code 5
MET01-J. Never use assertions to validate method arguments 
*/

public static int getAbsAdd(int x, int y) {
assert x != Integer.MIN_VALUE;
assert y != Integer.MIN VALUE;
int absX = Math.abs(x);
int absY = Math.abs(y);
assert (absX <= Integer.MAXVALUE - absY);
return absX + absY;
}
//Usage : getAbsAdd(Integer.MIN_VALUE, 1);