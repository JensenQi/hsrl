package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AldorPeacekeeper_1167 : Card() {
    override val id = 1167
    override val name = "奥尔多卫士"
    override val description = "<b>战吼：</b>使一个敌方随从的攻击力变为1。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Legacy3
    override val background = "奥尔多痛恨两样东西：占星者和湿鳞蜥蜴的眼睛。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/64e17c6d60f23b28f17252e5268340701afbe4faed54375fa419c35895bd9b8e.png"
}
