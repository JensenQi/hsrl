package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ForbiddenRitual_38454 : Card() {
    override val id = 38454
    override val name = "禁忌仪式"
    override val description = "消耗你所有的法力值，召唤相同数量的1/1的触须。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Wotog
    override val background = "经证实，该仪式已获得上古之神克苏恩的认可。"
    override val artist = "Evgeniy Zaqumyennyy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0f0af4b02c7fd83362b5e817a4a54981992b29d74661648efacb13cef4c03060.png"
}
