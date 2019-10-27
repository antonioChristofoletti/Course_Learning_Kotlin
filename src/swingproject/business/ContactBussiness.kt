package swingproject.business

import swingproject.entity.ContactEntity
import swingproject.repository.ContactRepository
import java.lang.Exception

class ContactBussiness {

    private fun validate(contact: ContactEntity) {
        if (contact.name == "") {
            throw Exception("Nome é obrigatório")
        }

        if (contact.phone == "") {
            throw Exception("Telefone é obrigatório")
        }
    }

    private fun validateDelete(contact: ContactEntity) {
        if (contact.name == "" || contact.phone == "") {
            throw Exception("É necessário selecionar um contato antes de remover.")
        }
    }

    fun save(contact: ContactEntity) {
        validate(contact)

        ContactRepository.save(contact)
    }

    fun delete(contact: ContactEntity) {
        validateDelete(contact)

        ContactRepository.delete(contact)
    }

    fun getList(): List<ContactEntity> {
        return ContactRepository.getList()
    }
}