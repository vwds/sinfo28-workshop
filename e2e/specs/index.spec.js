describe('Sinfo Cats', () => {
    it('renders the correct heading', () => {
        cy.visit('/')

        cy.findByText(/hello sinfo 28/i)
    })
})