module.exports = {
  name: 'card-hive',
  preset: '../../jest.config.js',
  coverageDirectory: '../../coverage/apps/card-hive',
  snapshotSerializers: [
    'jest-preset-angular/build/AngularNoNgAttributesSnapshotSerializer.js',
    'jest-preset-angular/build/AngularSnapshotSerializer.js',
    'jest-preset-angular/build/HTMLCommentSerializer.js',
  ],
};
