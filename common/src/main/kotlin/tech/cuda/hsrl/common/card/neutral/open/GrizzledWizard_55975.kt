package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrizzledWizard_55975 : Card() {
    override val id = 55975
    override val name = "灰发巫师"
    override val description = "<b>战吼：</b>直到你的下个回合，和你的对手交换英雄技能。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "灰发巫师失误发挥。"
    override val artist = "David Kegg"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8f37bd10520eab08dc1a39b7ccccef190198e72e1766206cba76fe34f59146b2.png"
}
