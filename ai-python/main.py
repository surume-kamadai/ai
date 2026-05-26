from fastapi import FastAPI

app = FastAPI()

@app.get("/api/python/hello")
def read_root():
    return {"message": "Hello from Python FastAPI!"}