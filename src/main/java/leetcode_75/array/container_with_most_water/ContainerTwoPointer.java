package leetcode_75.array.container_with_most_water;

class ContainerTwoPointer {
    public int maxArea(int[] height) {
        //two pointer
        //while (l < r)
        //l++
        //calculation the area
        //  (r - l) * Math.min(num[l], num[r])
        //get max

        //r--
        //calculation the area
        //get max

        //initialize
        int l = 0;
        int r = height.length - 1;
        int maxArea = calArea(height, l, r);
        while(l < r){
                maxArea = Math.max(maxArea, calArea(height, ++l, r));
                maxArea = Math.max(maxArea, calArea(height, l, --r));
        }
        return maxArea;
    }

    private int calArea(int[] height,int l, int r){
        return (r - l) * Math.min(height[l], height[r]);
    }

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        ContainerTwoPointer containerTwoPointer = new ContainerTwoPointer();
        System.out.println(containerTwoPointer.maxArea(height));
    }
}
