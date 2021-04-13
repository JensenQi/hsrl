package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EliseTheEnlightened_53620 : Card() {
    override val id = 53620
    override val name = "启迪者伊莉斯"
    override val description = "<b>战吼：</b>如果你的牌库里没有相同的牌，则复制你的手牌。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "从绘图大师到战斗专家，伊莉斯选择了一条人迹罕至的路，一条在地图上也找不到的路。"
    override val artist = "Luke Mancini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f889308562b6b2140d9840bdb0304f6a4429e9534fce1a4be2f33b2cf4e57e71.png"
}
