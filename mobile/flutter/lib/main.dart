import 'package:flutter/material.dart';

void main() {
  runApp(
    MaterialApp(
      home: SampleApp(),
    ),
  );
}

class SampleApp extends StatelessWidget {
  const SampleApp({Key key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    final sampleText =
        "Hi! I'm a sample text to show the possibilities of declarative UI 😄🤓";

    return Scaffold(
      appBar: AppBar(
        title: Text('Modern languages path'),
        backgroundColor: Colors.amber,
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          children: [
            Text(
              sampleText,
              style: TextStyle(
                color: Colors.black,
                fontSize: 64.0,
                fontStyle: FontStyle.normal,
                fontWeight: FontWeight.w500,
              ),
            ),
          ],
        ),
      ),
    );
  }
}
