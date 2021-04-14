const express = require('express')
const app = express()
const port = 3000

app.get('/', (req, res) => {
    res.send('Hello from backend')
})

app.get('/test', (req, res) => {
    res.send({ 'status': 'ok' })
})

app.listen(port, () => {
    console.log(`Listening at http://localhost:${port}`)
})