package tech.cuda.hsrl.common.card.priest.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HolyFire_70061 : Card() {
    override val id = 70061
    override val name = "神圣之火"
    override val description = "造成 5点伤害。为你的英雄恢复 5点生命值。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ClassicCards
    override val background = "紧接着你就会看到“神圣之烟”！"
    override val artist = "Miguel Coimbra"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d5c1372e4e3408f0458a87a0fdfc51944c3cd0c65c01636f0751042e58a15385.png"
}
