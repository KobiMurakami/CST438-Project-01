//This is the basic Template for using Web API for react Native.

//The imports to use React Native
import React, { useEffect, useState } from 'react';
import { View, Text, ActivityIndicator } from 'react-native';
import axios from 'axios';

const Dictionary = () => {
  const [data, setData] = useState(null);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState(null);

  useEffect(() => {
    setLoading(true);
    axios
      .get('https://api.dictionaryapi.dev/api/v2/entries/en/<word>')
      .then((response) => {
        setData(response.data);
        setLoading(false);
      })
      .catch((error) => {
        console.error(error);
        setLoading(false);
      });
  }, []);

  if (loading) {
    return <ActivityIndicator />;
  }
  return (
    <View>
      <Text> {JSON.stringify(data)}</Text>
    </View>
  );
};

export default Dictionary;