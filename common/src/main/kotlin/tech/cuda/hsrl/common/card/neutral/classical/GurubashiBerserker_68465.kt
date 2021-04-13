package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GurubashiBerserker_68465 : Card() {
    override val id = 68465
    override val name = "古拉巴什狂暴者"
    override val description = "每当该随从受到伤害，便获得 +3攻击力。"
    override var cost: Int? = 5
    override var health: Int? = 7
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "如果那些伤痛没能让你死掉，它们就会让你更强大。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6d365ecf1490fb24f59cf5a86ef9a3760b041bac852722a87b77879153e3cfaf.png"
}
