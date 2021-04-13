package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KingKrush_1144 : Card() {
    override val id = 1144
    override val name = "暴龙王克鲁什"
    override val description = "<b>冲锋</b>"
    override var cost: Int? = 9
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Legacy3
    override val background = "对付暴龙王克鲁什最好的办法就是让某个你讨厌的人站在你前面。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6ee3545eb2888cd78da6e4260caa3e4d07087f1e663d4224973711ded097a3c2.png"
}
