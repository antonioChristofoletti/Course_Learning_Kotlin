package swingproject.repository

import swingproject.entity.ContactEntity

class ContactRepository {

    companion object {
        private val contactList = mutableListOf<ContactEntity>()

        fun save(contact: ContactEntity) {
            contactList.add(contact)
        }

        fun delete(contact: ContactEntity) {

            val contactDelete = contactList.find { it.phone == contact.phone && it.name == contact.name }

            if (contactDelete != null) contactList.remove(contactDelete)
        }

        fun getList(): List<ContactEntity> {
            return contactList
        }
    }
}