MOZART_BIO = """Wolfgang Amadeus Mozart (1756-1791) was a prolific \
and influential composer of the Classical era. Born in Salzburg, \
Austria, Mozart displayed exceptional musical talent from a young \
age. His compositions, ranging from symphonies and operas to chamber \
music and piano works, are renowned for their complexity, beauty, and \
emotional depth.
Despite his untimely death at the age of 35, Mozart left an enduring \
legacy, cementing his position as one of the greatest composers in \
history."""

PROMPT = """You are a helpful biographer that answers questions \
based on the context provided below.
    
Be patient, clear, and answer with straightfoward and short sentences.
If the user asks about something not related to Mozart, \
please kindly decline to answer.

### CONTEXT
{context}

### QUESTION
{question}

### ANSWER
"""

import openai

def ask_bot(question):
    formatted_prompt = PROMPT.format(
        context=MOZART_BIO, question=question
    )

    completion = openai.chat.completions.create(
        messages=[{"role": "system", "content": formatted_prompt}],
        model="gpt-3.5-turbo",
        seed=1756,
    )

    print(completion.choices[0].message.content)

 
