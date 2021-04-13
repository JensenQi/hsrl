package tech.cuda.hsrl.common.card.hunter.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Houndmaster_68426 : Card() {
    override val id = 68426
    override val name = "驯兽师"
    override val description = "<b>战吼：</b>使一个友方野兽获得+2/+2和<b>嘲讽</b>。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ClassicCards
    override val background = "“是谁把狗放出来的？”他问。其实，这只是他的口头禅。"
    override val artist = "Dan Brereton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5a41e9cc3298061951fbf62501cd85f59f9e534e0ac99bf42de8ffa7a31fdeeb.png"
}
