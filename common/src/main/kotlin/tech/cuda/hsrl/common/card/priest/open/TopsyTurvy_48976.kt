package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TopsyTurvy_48976 : Card() {
    override val id = 48976
    override val name = "引力翻转"
    override val description = "使一个随从的攻击力和生命值 互换。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.BoomsdayProject
    override val background = "“救命！我掉……上去了！”"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6bcb6fe9aba2ff4f25538a2c388fbf9679ccc69c8959c7004f8ae71752709816.png"
}
