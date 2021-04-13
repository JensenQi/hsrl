package tech.cuda.hsrl.common.card.priest.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MassDispel_70063 : Card() {
    override val id = 70063
    override val name = "群体驱散"
    override val description = "<b>沉默</b>所有敌方随从，抽一张牌。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ClassicCards
    override val background = "它驱散了增益、力量、希望和梦想。"
    override val artist = "Sean O’Daniels"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7fcd730573411bf28664181537e5165b89472e3ff26a05f8fade0d8f2029d312.png"
}
