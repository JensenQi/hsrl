package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PharaohCat_54261 : Card() {
    override val id = 54261
    override val name = "法老御猫"
    override val description = "<b>战吼： </b>随机将一张<b>复生</b>随从牌置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "最强的捕鼠能手，上猫窝与下猫窝之王，红色光斑的征服者，全知全能的喵特谢普苏特。"
    override val artist = "Eva Widermann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c44094006181dfd0a4ae610e5a358d45c48fbaac2dc92a614bf84eeec7181d2b.png"
}
