#!/usr/bin/env python
# coding: utf-8

# In[1]:


import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
import scipy.stats as stats
import seaborn as sns
from matplotlib import rcParams

get_ipython().run_line_magic('matplotlib', 'inline')
get_ipython().run_line_magic('pylab', 'inline')


# In[3]:


df = pd.read_csv('/users/bricepratt/desktop/python projects/kc_house_data.csv')


# In[4]:


df.head()


# In[5]:


df.isnull().any()


# In[6]:


df.dtypes


# In[7]:


df.describe()


# In[8]:


fig = plt.figure(figsize=(12,6))
sqft = fig.add_subplot(121)
cost = fig.add_subplot(122)


# In[9]:


fig = plt.figure(figsize=(12,6))
sqft = fig.add_subplot(121)
cost = fig.add_subplot(122)

sqft.hist(df.price, bins=80)
sqft.set_xlabel('Ft^2')
sqft.set_title("Histogram of House Square Footage")

cost.hist(df.price, bins=80)
cost.set_xlabel('Price($)')
cost.set_title("Histogram of Housing Prices")

plt.show()


# In[10]:


import statsmodels.api as sm
from statsmodels.formula.api import ols


# In[11]:


m = ols('price ~ sqft_living', df).fit()
print(m.summary())


# In[12]:


m = ols('price ~ sqft_living + bedrooms + grade + condition', df).fit()
print(m.summary())


# In[14]:


sns.jointplot(x='sqft_living', y='price', data=df, kind = 'reg', fit_reg=True, size = 7)
plt.show()


# In[ ]:




