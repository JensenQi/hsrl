package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HiredGun_40911 : Card() {
    override val id = 40911
    override val name = "重装佣兵"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "干他们这行，谁给的钱多，谁就是老板！"
    override val artist = "Eric Braddock"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/13951cee2c395cdd76e46948bf363569ecdd9667f9d78194931144141358d13e.png"
}
