package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DariusCrowley_47053 : Card() {
    override val id = 47053
    override val name = "达利乌斯·克罗雷"
    override val description = "<b>突袭</b> 在克罗雷攻击并消灭一个随从后，获得+2/+2。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.TheWitchwood
    override val background = "要么以恶人之名死去，要么活下来直到你变成一个英雄。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d6f90b4ed954bf0b76c56b8ca0653ac8bd3b75deb546f4108a666a0c5a67194a.png"
}
