package tech.cuda.hsrl.common.card.rogue.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shiv_68458 : Card() {
    override val id = 68458
    override val name = "毒刃"
    override val description = "造成 1点伤害，抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ClassicCards
    override val background = "毒如鹤顶，刃若清刚；图穷匕现，君命难长。"
    override val artist = "Alex Garner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b07e2aeb7f2aaf3097153b205dbb070650987b91a40cde06d2d1f42e8d54450a.png"
}
