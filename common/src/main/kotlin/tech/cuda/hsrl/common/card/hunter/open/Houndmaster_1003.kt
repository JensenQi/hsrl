package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Houndmaster_1003 : Card() {
    override val id = 1003
    override val name = "驯兽师"
    override val description = "<b>战吼：</b>使一个友方野兽获得+2/+2和<b>嘲讽</b>。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Legacy1635
    override val background = "“是谁把狗放出来的？”他问。其实，这只是他的口头禅。"
    override val artist = "Dan Brereton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/00bbacf41f2e65b416c943830ea94a5ddce023a64a325117195264cc7d7da988.png"
}
