package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FirelandsPortal_39715 : Card() {
    override val id = 39715
    override val name = "火焰之地传送门"
    override val description = "造成 5点伤害。随机召唤一个法力值消耗为（5）的随从。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Karazhan
    override val background = "火焰之地是由泰坦所铸造的一个熔火领域，用来关押拉格纳罗斯和他那群无法无天的爪牙。"
    override val artist = "Gustav Schmidt"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6c31ccb94ef96e6b6482f7dd352790415304f0b972da94de4640b25735bd3da9.png"
}
