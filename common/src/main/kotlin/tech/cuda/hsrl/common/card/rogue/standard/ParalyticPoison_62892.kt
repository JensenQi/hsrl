package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ParalyticPoison_62892 : Card() {
    override val id = 62892
    override val name = "麻痹药膏"
    override val description = "使你的武器获得+1攻击力和“你的英雄在攻击时具有<b>免疫</b>。”"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "其实只要锤子就够了。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2763d18143b4b80deb00c24ae6959e32a7cf0868d8a7aec512db06d9c2a4fc5e.png"
}
