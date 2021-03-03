describe('SINFO =^__^=', () => {


    describe('Hacky wears a light shirt', () => {

        it("tests that hacky has his light shirt", () => {
            cy.visit('/')

            cy.findByText(/hi, i am Sandy Hacky/i)

            cy.findByRole('img')
                .should('have.attr', 'src', `assets-sacky-coiso.jpg`)
                .and('have.attr', 'alt', `${catName} SINFO CAT`)
        })
    });

    describe('Hacky wears a dark shirt', () => {
        beforeEach(() => {
            cy.visit('/')
        })

        it("tests that hacky has his light shirt", () => {

            // check name and img

            cy.findByRole('radio', { name: 'Dark' })
                .should('not.be.checked')
                .click()
            cy.findByRole('button', { name: 'Apply' }).click()


            cy.findByRole('img')
                .should('have.attr', 'src', `assets-sacky-coiso.jpg`)
                .and('have.attr', 'alt', `${catName} SINFO CAT`)
        })
    });


})