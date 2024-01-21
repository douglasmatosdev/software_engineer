/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React from 'react';
import { StyleSheet, Text, TextInput, View } from 'react-native';

function App(): React.JSX.Element {
  const [parc1, setParc1] = React.useState('');
  const [parc2, setParc2] = React.useState('');
  const [somaR, setSomaR] = React.useState('Toque aqui para somar.');

  function executarSoma() {
    let p1 = parseInt(parc1, 10);
    let p2 = parseInt(parc2, 10);
    let resultado = p1 + ' + ' + p2 + ' = ' + (p1 + p2);
    setSomaR(resultado);
  }

  return (
    <View style={styles.container}>
      <TextInput
        style={styles.entrada}
        value={parc1}
        onChangeText={setParc1}
        keyboardType="numeric"
      />
      <TextInput
        style={styles.entrada}
        value={parc2}
        onChangeText={setParc2}
        keyboardType="numeric"
      />
      <Text style={styles.texto} onPress={executarSoma}>
        {somaR}
      </Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    marginTop: 32,
    paddingHorizontal: 24,
  },
  texto: {
    fontFamily: 'Verdana',
    fontSize: 24,
    marginTop: 50,
    marginLeft: 10,
  },
  entrada: {
    margin: 12,
    height: 40,
    borderWidth: 1,
  },
});

export default App;
