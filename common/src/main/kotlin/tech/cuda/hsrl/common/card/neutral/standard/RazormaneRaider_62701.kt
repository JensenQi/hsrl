package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RazormaneRaider_62701 : Card() {
    override val id = 62701
    override val name = "钢鬃掠夺者"
    override val description = "<b>暴怒：</b>随机攻击一个敌人。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“你再叫我一声刺猬试试？”"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4935757f94c99e73b4445a164660d9b26bacc30475514668506ecb36309c6f32.png"
}
