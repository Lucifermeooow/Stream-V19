import 'package:flutter_test/flutter_test.dart';
import 'package:stream_v19/main.dart';

void main() {
  testWidgets('Stream V19 renders', (tester) async {
    await tester.pumpWidget(const StreamV19App());
    expect(find.text('Stream V19'), findsOneWidget);
    expect(find.text('GO LIVE'), findsOneWidget);
  });
}
