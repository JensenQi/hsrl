package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SinisterStrike_69524 : Card() {
    override val id = 69524
    override val name = "影袭"
    override val description = "对敌方英雄造成 3点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Core
    override val background = "尽管这个技能的名字已被改变，但这并不意味着它就不再“邪恶”。"
    override val artist = "Frank Cho"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0822c042e4f1482488c2f2d82cc2834d1f0db4af97038e1afcc9767e1c11a874.png"
}
