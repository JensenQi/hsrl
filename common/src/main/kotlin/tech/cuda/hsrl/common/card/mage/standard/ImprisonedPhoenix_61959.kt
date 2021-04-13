package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ImprisonedPhoenix_61959 : Card() {
    override val id = 61959
    override val name = "被禁锢的凤凰"
    override val description = "<b>休眠</b>两回合。<b>法术伤害+2</b>"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "凤凰可以变成一团火，轻松摆脱锁链的禁锢。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d5c249e43dfe4af995dc80236d6df1ca27d67ac8fc2d22f8cf649c122dfc9d66.png"
}
