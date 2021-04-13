package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Bloodworm_45329 : Card() {
    override val id = 45329
    override val name = "血虫"
    override val description = "<b>吸血</b>"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "兰娜瑟尔女王每天早餐都要吃上一条，必须炸得嘎嘣脆。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/aea121581cf2b6920178137ebe6698c07d86b220c70470bb59ce367aaa3cc2d2.png"
}
