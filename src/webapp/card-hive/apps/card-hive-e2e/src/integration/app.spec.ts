import {getNavigation} from '../support/app.po';

describe('card-hive', () => {
  beforeEach(() => cy.visit('/'));

  it('should have a title in the navigation bar', () => {
    cy.login('someDude@someCorp.com', 'hisPassword');

    getNavigation().contains('CardHive');
  });
});
