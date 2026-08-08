class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res=new ArrayList<>();
        if(nums==null||nums.length==0){
            return res;
        }
        int a=0, c1=0;
        int b=1, c2=0;
        for(int num:nums){
            if(num==a){
                c1++;
            }else if(num==b){
                c2++;
            }else if(c1==0){
                a=num;
                c1=1;
            }else if(c2==0){
                b=num;
                c2=1;
            }else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int num:nums){
            if(num==a){
                c1++;
            }else if(num==b){
                c2++;
            }
        }
        int thres=nums.length/3;
        if(c1>thres){
            res.add(a);
        }
        if(c2>thres){
            res.add(b);
        }
        return res;
    }
}