package tech.cuda.hsrl.common.card.hunter.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KingKrush_69968 : Card() {
    override val id = 69968
    override val name = "暴龙王克鲁什"
    override val description = "<b>冲锋</b>"
    override var cost: Int? = 9
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ClassicCards
    override val background = "对付暴龙王克鲁什最好的办法就是让某个你讨厌的人站在你前面。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/79a9366a19a37589b1f13a23d71bf7dba038d252f93dfd629684a609dba251f6.png"
}
