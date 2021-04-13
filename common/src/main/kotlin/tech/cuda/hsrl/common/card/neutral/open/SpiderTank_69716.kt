package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpiderTank_69716 : Card() {
    override val id = 69716
    override val name = "蜘蛛坦克"
    override val description = ""
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "“我想在这家伙上面装上一门炮，你觉得怎么样?”菲兹布里兹看着蜘蛛运输装置说道。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6add003ce62ee344129ebd2bbe2ee8bbab7e64982f65d27b33a9ec65dc5114eb.png"
}
