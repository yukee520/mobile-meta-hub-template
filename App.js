import React from 'react';
import {SafeAreaView, StyleSheet, Text, View} from 'react-native';

export default function App() {
  return (
    <SafeAreaView style={styles.container}>
      <View style={styles.card}>
        <Text style={styles.title}>Mobile Meta Hub</Text>
        <Text style={styles.subtitle}>Template Installed & Ready</Text>
      </View>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, backgroundColor: '#121212', justifyContent: 'center', alignItems: 'center' },
  card: { backgroundColor: '#1E1E1E', padding: 20, borderRadius: 10, alignItems: 'center' },
  title: { fontSize: 24, fontWeight: 'bold', color: '#007ACC', marginBottom: 8 },
  subtitle: { fontSize: 14, color: '#AAA' }
});
