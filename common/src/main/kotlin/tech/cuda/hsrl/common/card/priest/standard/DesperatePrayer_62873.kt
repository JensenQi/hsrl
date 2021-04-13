package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DesperatePrayer_62873 : Card() {
    override val id = 62873
    override val name = "绝望祷言"
    override val description = "为双方英雄恢复 5点生命值。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "哇哦，我们就快成功了，哇哦……"
    override val artist = "Maria Trepalina"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/85f7ac7ae50bb80f1ce8afd490c00b3874f5c65235413c86ef27ce8ec1db7ee1.png"
}
