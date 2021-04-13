package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Doppelgangster_40953 : Card() {
    override val id = 40953
    override val name = "魅影歹徒"
    override val description = "<b>战吼：</b>召唤该随从的两个复制。"
    override var cost: Int? = 5
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "一个好汉两个帮。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f78d607cf1ac0b6e2662e3a8992fa1d33959eebf4af60e7ba0063804746ee544.png"
}
