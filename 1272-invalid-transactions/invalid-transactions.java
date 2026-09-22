class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        HashMap<String,List<String[]>> map = new HashMap<>();
        List<String> list = new ArrayList<String>();
        boolean [] vis = new boolean[transactions.length]; 
        for(int i = 0 ; i < transactions.length ; i++)
        {
            String[] arr = transactions[i].split(",");
            String name = arr[0];
            String time = arr[1];
            String amount = arr[2];
            String city = arr[3];
            String[] value = {time,amount,city,String.valueOf(i)};
            if(Integer.parseInt(amount) >= 1000)
            {
                vis[i] = true;
            }

            if(map.containsKey(name))
            {
                for(int j = 0 ; j < map.get(name).size() ; j++)
                {
                    String arr1[] = map.get(name).get(j);
                    int ind = Integer.parseInt(arr1[3]);
                    String c = arr1[2];
                    if(Math.abs(Integer.parseInt(arr1[0])-Integer.parseInt(time)) <= 60 && !c.equals(city))
                    {
                        vis[ind] = true;
                        vis[i] = true;
                    }
                }
               
            }

            if(!map.containsKey(name))
            {
                List<String[]> l = new ArrayList<>();
                l.add(value);
                map.put(name,l);
            }
            else
            {
                map.get(name).add(value);
            }

        }

        for(int i = 0 ; i < transactions.length ; i++)
        {
            if(vis[i])
            {
                list.add(transactions[i]);
            }
            
        }

        return list;
    }
}