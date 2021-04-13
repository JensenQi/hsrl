package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FireworkElemental_61177 : Card() {
    override val id = 61177
    override val name = "焰火元素"
    override val description = "<b>战吼：</b>对一个随从造成3点伤害。<b>腐蚀：</b>改为12点。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "最耀眼的焰火，也难免坠入黑暗。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c2277dae9866cd160ac8cc20607163fdb26b62a42487f095e1afec467cbb171c.png"
}
