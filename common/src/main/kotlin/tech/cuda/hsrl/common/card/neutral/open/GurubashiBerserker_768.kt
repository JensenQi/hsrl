package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GurubashiBerserker_768 : Card() {
    override val id = 768
    override val name = "古拉巴什狂暴者"
    override val description = "每当该随从受到伤害，便获得 +3攻击力。"
    override var cost: Int? = 5
    override var health: Int? = 8
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "如果那些伤痛没能让你死掉，它们就会让你更强大。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f9ef2732a4b7e7f5a7ed8df478993aa4b2d2133dc72edbd29c3e8bef74b5aa7a.png"
}
