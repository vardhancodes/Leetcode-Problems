class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i = 0 ; i < bulbs.size() ; i++)
        {
            if(map.containsKey(bulbs.get(i)))
            {
                map.remove(bulbs.get(i));
            }
            else
            {
                map.put(bulbs.get(i),1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            list.add(entry.getKey());
        }

        return list; 
    }

}