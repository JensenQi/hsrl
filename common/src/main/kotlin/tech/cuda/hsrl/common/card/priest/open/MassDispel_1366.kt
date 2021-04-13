package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MassDispel_1366 : Card() {
    override val id = 1366
    override val name = "群体驱散"
    override val description = "<b>沉默</b>所有敌方随从，抽一张牌。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy3
    override val background = "它驱散了增益、力量、希望和梦想。"
    override val artist = "Sean O’Daniels"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3e6f9407d164d86be9d143800cbb8c779f1510ff50aee322bf7ea8a1235a7a61.png"
}
