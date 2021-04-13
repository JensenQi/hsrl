package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BonechewerBrawler_57175 : Card() {
    override val id = 57175
    override val name = "噬骨殴斗者"
    override val description = "<b>嘲讽</b> 每当该随从受到伤害，便获得+2攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "你的躯体要是有这么发达，那箭矢对你来说基本就是免费针灸。"
    override val artist = "Josh Harris"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9ebb0e78eb00257455ac1064429380c23d83c925245f1a734b79fa1376042e05.png"
}
