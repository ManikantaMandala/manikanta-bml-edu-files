class WebBrowser:                               #class decalaration
    def __init__ (self,page):                   #initiation of a object
        self.page_current=page                  #intance variables (created when an object is created)
        self.history=[page]                     #intance variables (created when an object is created)
        self.is_incognito=False                 #intance variables (created when an object is created)
    def navigate(self,page):                    #intacnce method (created when an object is created)
        self.page_current=page
        if not self.is_incognito:
            self.history.append(page)
    def clear_history(self):                    #instance method (created when an object is created)
        self.history[:-1]=[]
    @classmethod                                #class method (only done in class)
    def with_incognito(cls,page):
        instance=cls(page)
        instance.instance=True
        instance.history=[]
        return instance
brave=WebBrowser("google.com")
print("Hello world")
print(brave.history)




