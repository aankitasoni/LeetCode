class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return (rec1[0] < rec2[2] &&
            rec1[1] < rec2[3] &&
            rec1[2] > rec2[0] &&
            rec1[3] > rec2[1]);
    }
}

//         int fx1=rect1[0];
//         int fx2=rect1[2];
//         int fy1=rect1[1];
//         int fy2=rect1[3];

//         int sx1=rect2[0];
//         int sx2=rect2[2];
//         int sy1=rect2[1];
//         int sy2=rect2[3];

//         return !((sy1>=fy2) ||
//                (fy1>=sy2) ||
//                (fx1>=sx2) ||
//                (fx2<=sx1));