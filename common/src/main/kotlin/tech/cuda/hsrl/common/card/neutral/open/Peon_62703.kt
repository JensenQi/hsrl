package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Peon_62703 : Card() {
    override val id = 62703
    override val name = "苦工"
    override val description = "<b>暴怒：</b>随机将一张你职业的法术牌置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "苦工笑话一则：“收工了！”"
    override val artist = "Max Grecke"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/770c9501cbdc7290ae95dcfbb9a12b22aa690738c40590f85422ec18bc7720fc.png"
}
