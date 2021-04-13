package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ImprisonedSatyr_56676 : Card() {
    override val id = 56676
    override val name = "被禁锢的萨特"
    override val description = "<b>休眠</b>两回合。唤醒时，使你手牌中的随机一张随从牌的法力值消耗减少（5）点。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.AshesOfOutland
    override val background = "“欢迎光临邪蹄廉价大清仓！萨特出马，随从降价！”"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7f686dfc6e089b95a34163af3af83324a914284fdd55ac458254227539f073e7.png"
}
