class Solution:

    def encode(self, strs: List[str]) -> str:
        res=""
        for s in strs:
            res+= s+"Z"
        return res

    def decode(self, s: str) -> List[str]:
        res ,i= [],0
        j=0
        while i< len(s):
            j=i
            while s[j]!= 'Z':
                j+=1
            length = len(s[i:j])
            res.append(s[i:i+length])
            i=i+length+1
        return res

        
